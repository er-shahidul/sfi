var cs5;
sfiFormApp
    .controller('FormResFundingCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message', 'RegionList', '$upload', '$', 'standardObjects',
            function ($rootScope , $scope, $state, $http, Countries, _, Message, RegionList, $upload, $, standardObjects){

        $scope.validate = false;
        $scope.isDataDirty = false;
        $scope.standardObjects = standardObjects;
        console.log($scope.standardObjects);
        $scope.cs5 = angular.copy($rootScope.form.cs5);
        $scope.cs5.isOtherEnabled = ($scope.cs5.other) ? true: false;

        cs5 = $scope;

        $scope.init = function(){

            _.each($scope.cs5.items, function(item){

                if(!$scope.operateInCa(item)){
                    item.internalCad = null;
                    item.externalCad = null;
                };


                if(!$scope.operateInUsa(item)){
                    item.internalUsd = null;
                    item.externalUsd = null;
                };
            });

            $scope.cs5.projects = $scope.cs5.projects || [];
        }

        $scope.costOptions = [
            {id : 1, name : "less than $5,000" },
            {id : 2, name : "$5,000 to $20,000"},
            {id : 3, name : "$20,000 to $50,000"},
            {id : 4, name : "over $50,000"}
        ]

        $scope.addProject = function(){

            if($scope.innerFrom.$invalid){
                return false;
            }

            if(!$scope.isDirty()){
                return false;
            }

            var item = $scope.editItem || {};

            _.each($scope.project, function(val, key){
                item[key] = val;
            });

            if(!$scope.editItem){
                $scope.cs5.projects.push(item);
            }

            $scope.resetProject();
            $scope.isDataDirty = true;

            return true;
        }

        $scope.resetProject = function(){

            $scope.project = {

                projectNm           : "",
                projectObj          : "",
                description         : "",
                sfiStandardObj      : 0,
                sfiStandard10     : [],
                sfiStandard15     : [],
                projectLocations    : [],
                conversionPattern   : "",
                startDate           : "",
                endDate             : "",
                totalProjectCost    : 0,
                totalProjectCostCurr: 1,
                orgContribution     : 0,
                orgContributionCurr : 1,
                shareConceptData    : false,
                shareConceptNoName  : false,
                dontShare           : false,
                incResFunding       : null,
                supportDocs         : [],
                organizationListAcademic        : "",
                organizationListResearch        : "",
                organizationListConservation    : "",
                organizationListGovernment      : "",
                organizationListCommunity       : "",
                organizationListOther           : ""

            };

            $scope.validate     = false;
            $scope.editItem     = null;
            $scope.deleteItem   = null;

        }

        $scope.isDirty = function(){

            with( $scope.project){
                return projectNm
                    || projectObj
                    || description
                    || sfiStandardObj
                    || startDate
                    || endDate
                    || totalProjectCost
                    || orgContribution
                    || shareConceptData
                    || shareConceptNoName
                    || dontShare
                    || incResFunding;
            }
        }

        $scope.hasAnyOrg = function(){

            with( $scope.project){

                return organizationListAcademic
                    || organizationListResearch
                    || organizationListConservation
                    || organizationListGovernment
                    || organizationListCommunity
                    || organizationListOther;
            }
        }


        $scope.getProjects = function(){
            return _.filter($scope.cs5.projects, function(item){
                return !item.isDeleted;
            });
        }

        /* Edit/ Delete project */
        $scope.deleteItem = null;
        $scope.editItem = null;

        $scope.deleteProject = function(index){

            $scope.deleteItem = $scope.getProject(index);
            $("#delete1").modal();
        }

        $scope.deleteProjectOk = function(){

            if($scope.deleteItem){
                $scope.deleteItem.isDeleted = true;
                $scope.deleteItem = null;
            }
        }

        $scope.deleteProjectCancel = function(){
            $scope.deleteItem = null;
        }

        $scope.editProject = function(index){

            $scope.editItem = $scope.getProject(index);
            _.each($scope.editItem, function(val, key){
                $scope.project[key] = val;
            });
        }

        $scope.getProject = function(index){
            return $scope.cs5.projects[index];
        }

        $scope.addRegion = function(region){

            var region = $scope.project.regionItem;

            if(!$scope.project.projectLocations){
                $scope.project.projectLocations = [];
            }

            $scope.project.projectLocations.push(region.id);
        }


        $scope.regionName = function(regionId){
            return RegionList.getSingleName(regionId);
        }

        $scope.delRegion = function(regionId){
            $scope.project.projectLocations = _.without($scope.project.projectLocations, regionId);
        }

        $rootScope.isSectionDirty = function(){
            return $scope.cs5Form.$dirty || $scope.isDataDirty ;

        }



        $scope.init();
        $scope.resetProject();


        $scope.setForms = function(){
            $rootScope.$form = $scope.cs5Form;
        }


        $scope.save = function(go){


        if($scope.cs5Form.$invalid){
            return false;
        }

        if($scope.cs5.isInPartnership == true){

            if ($scope.isDirty()){

                if($scope.innerFrom.$invalid){
                    return false;
                }

                $scope.addProject();
            }
        }


        $http
            .put("/form/cs5", $scope.cs5)
            .then(function(response){

                if(response.data){

                    $scope.cs5Form.$setPristine();
                    $scope.isDataDirty = false;

                    //$rootScope.form = response.data;
                    //$scope.cs5 = angular.copy($rootScope.form.cs5);
                    //$scope.errors = $scope.cs5.errors;
                    Message.success('Section successfully saved', '.msg-cont');
                }

                if(go){
                    $rootScope.goStep("cs7")
                }

            });
    }


        $scope.myFiles = [];
        $scope.upload = {};

        $scope.fileSelected = function() {

            for (var i = 0; i < $scope.myFiles.length; i++) {

                var file = $scope.myFiles[i];
                $scope.upload = $upload.upload({
                    url: '/files/upload',
                    method: 'POST',
                    data: $scope.cs1,
                    file: file

                }).progress(function(evt) {
                        console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {
                    $scope.project.supportDocs.push(data);
                });

            }
        }

        var currPop = {

            title : '',
            html : true,
            content : '<div class="form-group"><input type="radio" class="icheck" value="1" name="test" data-projectNm="USD"><label class="checkboxLabel">USD</label>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="icheck" value="2" name="test" data-name="CAD"><label class="checkboxLabel">CAD</label></div></div>',
            placement : 'bottom',
            trigger : 'manual'
        }

        $scope.currPopPp = function(id, key){

            var $el  = $("#" + id);


            if(!$el.data('bs.popover')){

                $el.popover(currPop);
                $el.popover('show');


                $el.on('shown.bs.popover', function(){

                    var $popover = $el.data('bs.popover');
                    var $tip = $popover.$tip;

                    $tip.find('input')
                        .filter('[value=' + $scope.project[key] + ']')
                        .prop('checked', true);

                    $tip
                        .find('.icheck').iCheck({
                            checkboxClass: 'icheckbox_square-green',
                            radioClass: 'iradio_square-green'
                        })
                        .on('ifChecked', function(event){
                            var $input = $popover.$tip.find('input:checked');
                            $scope.project[key] = $input.val();
                            $el.popover('hide');
                            $scope.$digest();

                        });
                });

                return;
            }

            $el.popover('toggle');

        }

        $scope.gerCurrText = function(val){

            return (val == 1) ? "USD" : "CAD";

        }

        $scope.delSupportDoc = function(index){

            if(confirm("Are you sure to remove this doc ?")){

                var doc = $scope.project.supportDocs[index];
                doc.isDeleted = true;
            }

        }


        if(!$rootScope.regions){

                RegionList
                    .load()
                    .then(function(reponse){
                        $rootScope.regions = reponse.data;
                    });
            }




    }]);
