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

        $scope.deleteStandard = function(index, bucket){

            if(confirm("Are you sure you want to delete this entry?")){
                $rootScope.deleteByIndex(index, bucket)
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
            { id:1 , value:  '1. Communications and Public Reporting'},
            { id:2 , value:  '2. Community Involvement and Landowner Outreach'},
            { id:3 , value:  '3. Conservation of Biological Diversity'},
            { id:4 , value:  '4. Efficient Use of Fiber Resources'},
            { id:5 , value:  '5. Forest Health and Productivity'},
            { id:6 , value:  '6. Forest Management Planning'},
            { id:7 , value:  '7. Forestry Research, Science and Technology'},
            { id:8 , value:  '8. Legal and Regulatory Compliance'},
            { id:9 , value:  '9. Management Review and Continual Improvement'},
            { id:10 , value: '10. Management of Visual Quality and Recreation Benefits'},
            { id:11 , value: '11. Protection and Maintenance of Water Resources'},
            { id:12 , value: '12. Protection of Special Sites'},
            { id:13 , value: '13. Public Land Management Responsibilities'},
            { id:14 , value: '14. Recognize and Respect Indigenous People\'s Right'},
            { id:15 , value: '15. Training and Education'}
        ];

        $scope.fiberObjectives = [
            { id:1 , value:  '1. Adherence to Best Management Practices'},
            { id:2 , value:  '2. Avoidance of Controversial Sources including Fiber Sources from Areas without Effective Social Laws'},
            { id:3 , value:  '3. Avoidance of Controversial Sources including Illegal Logging'},
            { id:4 , value:  '4. Biodiversity in Fiber Sourcing'},
            { id:5 , value:  '5. Communications and Public Reporting'},
            { id:6 , value:  '6. Community Involvement and Landowner Outreach'},
            { id:7 , value:  '7. Forestry Research, Science and Technology'},
            { id:8 , value:  '8. Legal and Regulatory Compliance'},
            { id:9 , value:  '9. Management Review and Continual Improvement'},
            { id:10 , value: '10. Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas'},
            { id:11 , value: '11. Public Land Management Responsibilities'},
            { id:12 , value: '12. Training and Education'},
            { id:13 , value: '13. Use of Qualified Resources and Qualified Logging Professionals'}

        ];

        $scope.standardObjectives = [
            { id: 1 , value:  '1. Adherence to Best Management Practices'},
            { id: 2 , value:  '2. Avoidance of Controvercial Sources, including illegal logging'},
            { id: 3 , value:  '3. Avoidance of Controversial Sources including Fiber Sources from areas Without Effective Social Laws'},
            { id: 4 , value:  '4. Community Involvement in the Practice of Sustainable Forestry'},
            { id: 5 , value:  '5. Communications and Public Reporting'},
            { id: 6 , value:  '6. Conservation of Biological Diversity including Forest with Exceptional Conservation Value'},
            { id: 7  , value: '7. Efficienct Use of Fiber Resources'},
            { id: 8  , value: '8. Forest Management Planning'},
            { id: 9  , value: '9. Forest Productivity'},
            { id: 10 , value: '10. Forestry Research, Science and Technology'},
            { id: 11 , value: '11. Landowner Outreach'},
            { id: 12 , value: '12. Legal and Requlatory Compliance'},
            { id: 13 , value: '13. Management of Visual Quslity and Recreation Benefits'},
            { id: 14 , value: '14. Management Review and Continual Improvement'},
            { id: 15 , value: '15. Protection and Maintenance of Water Resources'},
            { id: 16 , value: '16. Protection of Special Sites'},
            { id: 17 , value: '17. Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas'},
            { id: 18 , value: '18. Public Land Management Responsibilities'},
            { id: 19 , value: '19. Training and Education'},
            { id: 20 , value: '20. Use of Qualified Logging Professional'}

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
                        $rootScope.updateFormMeta();
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

