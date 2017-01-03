var cs5;
sfiSicApp
    .controller('SicCs5FormCtrl', ['$rootScope', '$scope', '$http', 'Message', '$upload', '_',
        function ($rootScope , $scope, $http, Message, $upload, _){

        $scope.cs5 = angular.copy($rootScope.form.cs5);
        cs5 = $scope;

        $scope.mechanismDoc = {}
        $scope.cs5.mechanismDoc = $scope.cs5.mechanismDoc || {};

        $scope.editIndex  = {};

        $scope.forest2015 = {};
        $scope.fiber2015  = {};
        $scope.standard2010  = {
            //circumstancesDoc : {}
        };

        $scope.standardDoc = {};


        $scope.cs5.forestStandards2015    = $scope.cs5.forestStandards2015 || [];
        $scope.cs5.fiberSourcing2015      = $scope.cs5.fiberSourcing2015 || [];
        $scope.cs5.standardObjectives2010 = $scope.cs5.standardObjectives2010 || [];
        $scope.cs5.totalInconsistentPractices = $scope.cs5.totalInconsistentPractices || 0;


        $scope.hasData = function(object){

            var hasData = false;
            _.each(object, function(val, key){

                if(_.isObject(val)){
                    return ;
                }

                if(!hasData && val){
                    hasData = true;
                }

            });
            return hasData;
        }

        $scope.addStandard = function(key, model, bucket) {

            if(!$scope.hasData(model)){
                return model;
            }

            var formName = key + 'Form';

            if($scope.cs5Form[formName].$valid){

                var index = _.isNumber($scope.editIndex[key]) ? $scope.editIndex[key] : bucket.length;
                bucket[index] = angular.copy(model);
                $scope.editIndex[key] = null;

                return model.circumstancesDoc ? {circumstancesDoc : {}} : {}
            }

            return model;
        }

        $scope.deleteIndex  = null;
        $scope.deleteBucket = null;

        $scope.deleteStandard = function(index, bucket){

            $scope.deleteIndex  = index;
            $scope.deleteBucket = bucket;

            $("#deleteConfirm").modal();

        }

        $scope.deleteConfirm = function(){

            if($scope.deleteIndex != null && $scope.deleteBucket){

                $rootScope.deleteByIndex($scope.deleteIndex, $scope.deleteBucket);
                $scope.deleteIndex  = null;
                $scope.deleteBucket = null;
            }
        }

        $scope.editStandard = function(index, key, bucket){

            var item = bucket[index];
            $scope.editIndex[key] = index;
            $scope[key] = angular.copy(item);
        }

        $scope.getTotalInquiriesReceived = function(){

            var total = 0;
            if($scope.cs5.sfiStandardVersion == 1){

                _.each($scope.cs5.forestStandards2015, function(object){
                    total += object.resolved + object.unresolved;
                });

                _.each($scope.cs5.fiberSourcing2015, function(object){
                    total += object.resolved + object.unresolved;
                });


            }

            if($scope.cs5.sfiStandardVersion == 2){

                _.each($scope.cs5.standardObjectives2010, function(object){
                    total += object.resolved + object.unresolved;
                });


            }

            return total;
        }

        $scope.forestObjectives = [
            { id:1 , value:  'Objective 1. Forest Management Planning'},
            { id:2 , value:  'Objective 2. Forest Health and Productivity'},
            { id:3 , value:  'Objective 3. Protection and Maintenance of Water Resources'},
            { id:4 , value:  'Objective 4. Conservation of Biological Diversity'},
            { id:5 , value:  'Objective 5. Management of Visual Quality and Recreational Benefits'},
            { id:6 , value:  'Objective 6. Protection of Special Sites'},
            { id:7 , value:  'Objective 7. Efficient Use of Fiber Resources'},
            { id:8 , value:  'Objective 8. Recognize and Respect Indigenous People\'s Rights'},
            { id:9 , value:  'Objective 9. Legal and Regulatory Compliance'},
            { id:10 , value: 'Objective 10. Forestry Research, Science and Technology'},
            { id:11 , value: 'Objective 11. Training and Education'},
            { id:12 , value: 'Objective 12. Community Involvement and Landowner Outreach'},
            { id:13 , value: 'Objective 13. Public Land Management Responsibilities'},
            { id:14 , value: 'Objective 14. Communications and Public Reporting'},
            { id:15 , value: 'Objective 15. Management Review and Continual Improvement'}
        ];

        $scope.fiberObjectives = [
            { id:1 , value:  'Objective 1. Biodiversity in Fiber Sourcing'},
            { id:2 , value:  'Objective 2. Adherence to Best Management Practices'},
            { id:3 , value:  'Objective 3. Use of Qualified Resource and Qualified Logging Professionals'},
            { id:4 , value:  'Objective 4. Legal and Regulatory Compliance'},
            { id:5 , value:  'Objective 5. Forestry Research, Science and Technology'},
            { id:6 , value:  'Objective 6. Training and Education'},
            { id:7 , value:  'Objective 7. Community Involvement and Landowner Outreach'},
            { id:8 , value:  'Objective 8. Public Land Management Responsibilities'},
            { id:9 , value:  'Objective 9. Communications and Public Reporting'},
            { id:10 , value: 'Objective 10. Management Review and Continual Improvement'},
            { id:11 , value: 'Objective 11. Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas'},
            { id:12 , value: 'Objective 12. Avoidance of Controversial Sources including Illegal Logging'},
            { id:13 , value: 'Objective 13. Avoidance of Controversial Sources including Fiber Sourced from Areas without Effective Social Laws'}

        ];

        $scope.standardObjectives = [
            { id: 1 , value:  'Adherence to Best Management Practices'},
            { id: 2 , value:  'Avoidance of Controvercial Sources, including illegal logging'},
            { id: 3 , value:  'Avoidance of Controversial Sources including Fiber Sources from areas Without Effective Social Laws'},
            { id: 4 , value:  'Community Involvement in the Practice of Sustainable Forestry'},
            { id: 5 , value:  'Communications and Public Reporting'},
            { id: 6 , value:  'Conservation of Biological Diversity including Forest with Exceptional Conservation Value'},
            { id: 7  , value: 'Efficienct Use of Fiber Resources'},
            { id: 8  , value: 'Forest Management Planning'},
            { id: 9  , value: 'Forest Productivity'},
            { id: 10 , value: 'Forestry Research, Science and Technology'},
            { id: 11 , value: 'Landowner Outreach'},
            { id: 12 , value: 'Legal and Requlatory Compliance'},
            { id: 13 , value: 'Management of Visual Quality and Recreation Benefits'},
            { id: 14 , value: 'Management Review and Continual Improvement'},
            { id: 15 , value: 'Protection and Maintenance of Water Resources'},
            { id: 16 , value: 'Protection of Special Sites'},
            { id: 17 , value: 'Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas'},
            { id: 18 , value: 'Public Land Management Responsibilities'},
            { id: 19 , value: 'Training and Education'},
            { id: 20 , value: 'Use of Qualified Logging Professional'}

        ];

        $scope.saveForm = function(go){

            if($scope.cs5Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs5", $scope.cs5)
                .then(function(response){

                    if(response.data){
                        $scope.cs5Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs5 = response.data;
                        $scope.errors = $rootScope.form.cs5.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }

                    if(go){
                        $rootScope.goStep("cs6")
                    }
                });
        }


        $scope.setForms = function(){
            $rootScope.$form = $scope.csfForm;
        }



    }]);

