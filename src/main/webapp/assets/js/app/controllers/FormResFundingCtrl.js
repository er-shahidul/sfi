var cs5;
sfiFormApp
    .controller('FormResFundingCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message', 'RegionList', '$upload', '$', 'standardObjects', 'standardObjects2015',
            function ($rootScope , $scope, $state, $http, Countries, _, Message, RegionList, $upload, $, standardObjects, standardObjects2015){

        cs5 = $scope;
        $scope.validate = false;
        $scope.isDataDirty = false;
        $scope.standardObjects = standardObjects;
        $scope.standardObjects2015 = standardObjects2015;


        $scope.cs5 = angular.copy($rootScope.form.cs5);
        //$scope.cs5.isOtherEnabled = ($scope.cs5.other) ? true: false;

        $scope.academicOptions = [
            { id : 1 , name :"Auburn University"},
            { id : 2 , name :"Clemson University"},
            { id : 3 , name :"Duke University"},
            { id : 4 , name :"Lakehead University"},
            { id : 5 , name :"Laval University"},
            { id : 6 , name :"Michigan State University"},
            { id : 7 , name :"Mississippi State University"},
            { id : 8 , name :"North Carolina State University"},
            { id : 9 , name :"Oregon State University"},
            { id : 10 , name :"Stephen F. Austin State University"},
            { id : 11 , name :"Texas A&M University"},
            { id : 12 , name :"University of Alberta"},
            { id : 13 , name :"University of British Columbia"},
            { id : 14 , name :"University of Florida"},
            { id : 15 , name :"University of Georgia"},
            { id : 16 , name :"University of Georgia"},
            { id : 17 , name :"University of Idaho"},
            { id : 18 , name :"University of Maine"},
            { id : 19 , name :"University of Minnesota"},
            { id : 20 , name :"University of Montana"},
            { id : 21 , name :"University of New Brunswick"},
            { id : 22 , name :"University of Washington"},
            { id : 23 , name :"Virginia Polytechnic Institute"}
        ];

        $scope.researchList = [
            { id : 1 , name :"FP Innovations"},
            { id : 2 , name :"National Council for Air and Stream Improvement"},
            { id : 3 , name :"Wood Supply Resources Institute"}
        ];

        $scope.conservationList = [

            { id : 1 , name :"Ducks Unlimited"},
            { id : 2 , name :"Ducks Unlimited Canada"},
            { id : 3 , name :"Forest Ecosystems Science Co-op"},
            { id : 4 , name :"Longleaf Alliance"},
            { id : 5 , name :"New Brunswick Tree Improvement Council"},
            { id : 6 , name :"Pacific Salmon Foundation"},
            { id : 7 , name :"Rocky Mountain Elk Foundation"},
            { id : 8 , name :"Ruffed Grouse Society"},
            { id : 9 , name :"The Nature Conservancy"},
            { id : 10 , name :"The Nature Conservancy of Canada"},
            { id : 11 , name :"NatureServe"},
            { id : 12 , name :"NatureServe Canada"}
        ]

        $scope.governmentList = [
            { id : 1 , name :"Canadian Forest Service"},
            { id : 2 , name :"US Fish & Wildlife Service"},
            { id : 3 , name :"US Forest Service"}
        ];

        $scope.communityList = [

            { id : 1 , name :"Boy Scouts of America"},
            { id : 2 , name :"Girl Guides"},
            { id : 3 , name :"Girl Guides of Canada"},
            { id : 4 , name :"Habitat for Humanity"},
            { id : 5 , name :"Habitat for Humanity Canada"},
            { id : 6 , name :"Intertribal Timber Council"},
            { id : 7 , name :"Scouts Canada"},
            { id : 8 , name :"Alabama SIC"},
            { id : 9 , name :"Alaska SIC"},
            { id : 10 , name :"Arkansas SIC"},
            { id : 11, name :"California SIC"},
            { id : 12, name :"Central Canada SIC"},
            { id : 13 , name :"Central Rockies SIC"},
            { id : 14 , name :"Florida SIC"},
            { id : 15 , name :"Georgia SIC"},
            { id : 16 , name :"Idaho SIC"},
            { id : 17 , name :"Kentucky SIC"},
            { id : 18 , name :"Louisiana SIC"},
            { id : 19 , name :"Maine SIC"},
            { id : 20, name :"Maritime SIC"},
            { id : 21 , name :"Maryland/Delaware SIC"},
            { id : 22 , name :"Michigan SIC"},
            { id : 23 , name :"Minnesota SIC"},
            { id : 24 , name :"Mississippi SIC"},
            { id : 25 , name :"Montana SIC"},
            { id : 26 , name :"New Hampshire SIC"},
            { id : 27 , name :"New York SIC"},
            { id : 28 , name :"North Carolina SIC"},
            { id : 29 , name :"Ohio SIC"},
            { id : 30 , name :"Oregon SIC"},
            { id : 31 , name :"Pennsylvania SIC"},
            { id : 32 , name :"Quebec SIC"},
            { id : 33 , name :"South Carolina SIC"},
            { id : 34 , name :"Tennessee SIC"},
            { id : 35 , name :"Texas SIC"},
            { id : 36 , name :"Vermont SIC"},
            { id : 37 , name :"Virginia SIC"},
            { id : 38 , name :"Washington SIC"},
            { id : 39 , name :"West Virginia SIC"},
            { id : 40 , name :"Western Canada SIC"},
            { id : 41 , name :"Wisconsin SIC"}
        ];

        $scope.otherList = [
            "America Forest and Paper Association",
            "American Forest Foundation",
            "Forest Products Association of Canada",
            "Forest Resources Association",
            "Society of American Foresters",
            "Sustainable Forestry Initiative Inc"
        ];

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

            //if($scope.innerFrom.$invalid){
            //    return false;
            //}

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
                regionModel    : [],
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
                incSFIConservation  : null,
                supportDocs         : [],
                organizationListAcademic        : [],
                organizationListResearch        : [],
                organizationListConservation    : [],
                organizationListGovernment      : [],
                organizationListCommunity       : [],
                organizationListOther           : []

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
                    || incResFunding
                    || incSFIConservation;
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

            $('#delete1').modal();
            //if(confirm("Are you sure to delete this project ?")){
            //    $scope.cs5.projects.splice(index, 1);
            //}
        }

                $scope.deleteConfirm = function(index){

                    $scope.cs5.projects.splice(index, 1);

                }

                //$scope.deleteCancel = function(){
                //    $scope.cancelOther();
                //    $scope.resetSection();
                //}





        $scope.editProject = function(index){

            $scope.editItem = $scope.getProject(index);
            _.each($scope.editItem, function(val, key){
                $scope.project[key] = val;
            });
            //$scope.project['startDate'] = new Date($scope.editItem['startDate']);

        }

        $scope.getProject = function(index){
            return $scope.cs5.projects[index];
        }


        $scope.delRegion = function(regionId){
            //console.log(regionId);
            //console.log($scope.project.projectLocations);
            $scope.project.projectLocations.splice($scope.project.projectLocations.indexOf(regionId),1);
            //$scope.project.projectLocations = _.without($scope.project.projectLocations, regionId);
             //$scope.project.projectLocations.splice(regionId, 1);

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

                    //if($scope.innerFrom.$invalid){
                    //    return false;
                    //}

                    $scope.addProject();
                }
            }


            $http
                .put("/form/cs5", $scope.cs5)
                .then(function(response){

                    if(response.data){

                        $scope.cs5Form.$setPristine();
                        $scope.isDataDirty  = false;
                        $rootScope.form.cs5 = response.data;
                        $scope.cs5 = angular.copy($rootScope.form.cs5);
                        Message.success('Section successfully saved', '.msg-cont');
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();

                        $scope.init();
                        $scope.resetProject();
                    }

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
                       // console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {
                    $scope.project.supportDocs.push({
                        projectOriginalDocumentName : data.originalDocumentName,
                        projectUniqueDocumentName : data.uniqueDocumentName
                    });
                });

            }
        }

        var currPop = {

            title : '',
            html : true,
            content : '<div class="form-group"><input type="radio" class="icheck" value="1" name="test" data-projectNm="USD"><label class="checkboxLabel">USD</label>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="icheck" value="2" name="test" data-name="CAD"><label class="checkboxLabel">CAD</label></div></div>',
            placement : 'bottom',
            trigger : 'manual',
            container: 'body'
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

        $scope.cs5.organizationListAcademic = $scope.cs5.organizationListAcademic || [];

        $scope.addList = function(bucket, model){

            _.isArray(bucket) || (bucket = []);

            if(_.isObject(model)){
                bucket.push(model.name);
            }else{
                bucket.push(model);
            }

            return _.unique(bucket);
        }

        $scope.withoutList = function(item, bucket){
            bucket = _.without(bucket, item);
            return bucket;
        }



    }]);
