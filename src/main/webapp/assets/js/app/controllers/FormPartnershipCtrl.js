sfiFormApp
    .controller('FormPartnershipCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'RegionList', '_', 'Message', '$upload', '$',
            function ($rootScope, $scope, $state, $http, RegionList, _, Message, $upload, $) {

    $scope.cs3 = angular.copy($rootScope.form.cs3);
    ngScope = $scope;

    if(!$rootScope.regions){

        RegionList
            .load()
            .then(function(reponse){
                $rootScope.regions = reponse.data;
            });
    }

    if(!$scope.cs3.projects){
        $scope.cs3.projects = [];
    }

    $scope.costOptions = [
        {id : 1, name: "less than $5,000" },
        {id : 2, name: "$5,000 to $20,000"},
        {id : 3, name: "$20,000 to $50,000"},
        {id : 4, name: "over $50,000"}

    ]

    $scope.validate = false;

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
            $scope.cs3.projects.push(item);
        }

        $scope.resetProject();
        $scope.isDataDirty = true;
        return true;
    }

    $scope.resetProject = function(){

        $scope.project = {

            name : "",
            objective : "",
            description : "",
            StandardObject : 0,
            locations : [],
            conversionPattern: "",
            startDate : "",
            endDate : "",
            totalProjectCost : 0,
            totalProjectCostCurr : 1,
            orgContribution :0,
            orgContributionCurr : 1,
            shareConserData : null,
            incResFunding : null,
            supportDocs : [],

            academicList : "",
            researchList: "",
            conservationList : "",
            governmentList: "",
            communityList: "",
            otherList: ""

        };

        $scope.validate = false;
        $scope.editItem = null;
        $scope.deleteItem = null;

    }

    $scope.isDirty = function(){


        with( $scope.project){

            return name
                || objective
                || description
                || StandardObject
                || startDate
                || endDate
                || totalProjectCost
                || orgContribution
                || shareConserData
                || incResFunding;
        }
    }

    $scope.hasAnyOrg = function(){


        with( $scope.project){

            return academicList
                || researchList
                || conservationList
                || governmentList
                || communityList
                || otherList;
        }
    }

    $scope.resetProject();

    $scope.getProjects = function(){

        return _.filter($scope.cs3.projects, function(item){
            return !item.isDeleted;
        });
    }

    /* Delete project */
    $scope.deleteItem = null;

    $scope.deleteProject = function(index){

        var item = $scope.getProject(index);
        $scope.deleteItem = item;
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
    /* -/- */

    /* Edit project */
    $scope.editItem = null;

    $scope.editProject = function(index){

        var item = $scope.getProject(index);
        $scope.editItem = item;

        _.each($scope.editItem, function(val, key){
            $scope.project[key] = val;
        });
    }
    /* -/- */



    $scope.getProject = function(index){
        return $scope.cs3.projects[index];
    }

    $scope.addRegion = function(region){

        var region = $scope.project.regionItem;

        if(!$scope.project.locations){
            $scope.project.locations = [];
        }

        $scope.project.locations.push(region.id);
    }


    $scope.regionName = function(regionId){

        return RegionList.getSingleName(regionId);
    }

    $scope.delRegion = function(regionId){
        $scope.project.locations = _.without($scope.project.locations, regionId);
    }

    $scope.isDataDirty = false;

    $rootScope.isSectionDirty = function(){

        return $scope.cs3Form.$dirty || $scope.isDataDirty ;

    }

    $scope.saveForm = function (go) {

        if($scope.cs3.isInPartnership == true){

            if ($scope.isDirty()){

                if($scope.innerFrom.$invalid){
                    return false;
                }

                $scope.addProject();
            }

            if(!$scope.getProjects().length){
                //return alert('Provide atleast one project information');
            }
        }

        $http
            .post(Routing.generate("sfi_cs3_form_update", urlData), $scope.cs3)
            .then(function (response) {

                $scope.isDataDirty = false;
                $scope.cs3Form.$setPristine();

                $rootScope.form = response.data;
                $scope.cs3 = angular.copy($rootScope.form.cs3);
                $scope.errors = $scope.cs3.errors;

                Message.success('Section successfully saved', '.msg-cont');

                if(go){
                    $rootScope.goStep("cs7");
                }

            });
    }

    $scope.myFiles = [];
    $scope.upload = {};

    $scope.fileSelected = function() {

        for (var i = 0; i < $scope.myFiles.length; i++) {

            var file = $scope.myFiles[i];
            $scope.upload = $upload.upload({
                url: '/files/upload/sfi',
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
        content : '<div class="form-group"><input type="radio" class="icheck" value="1" name="test" data-name="USD"><label class="checkboxLabel">USD</label>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="icheck" value="2" name="test" data-name="CAD"><label class="checkboxLabel">CAD</label></div></div>',
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



}]);
