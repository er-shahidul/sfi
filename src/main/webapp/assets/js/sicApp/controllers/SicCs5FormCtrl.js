var cs5;
sfiSicApp
    .controller('SicCs5FormCtrl', ['$rootScope', '$scope', '$http', 'Message', '$upload', '_',
        function ($rootScope , $scope, $http, Message, $upload, _){

        $scope.cs5 = angular.copy($rootScope.form.cs5);
        cs5 = $scope;

        $scope.mechanismDoc = {}
        $scope.cs5.mechanismDocs = $scope.cs5.mechanismDocs || [];

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

            if(confirm("Are you sure to delete this item ?")){
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

        $scope.forestObjectives = {
            1  : 'Forest Management Planning',
            2  : 'Forest Health and Productivity',
            3  : 'Protection and Maintenance of Water Resources',
            4  : 'Conservation of Biological Diversity',
            5  : 'Management of Visual Quality and Recreation Benefits',
            6  : 'Protection of Special Sites',
            7  : 'Efficient Use of Fiber Resources',
            8  : 'Recognize and Respect Indigenous People\'s Right',
            9  : 'Legal and Regulatory Compliance',
            10 : 'Forestry Research, Science and Technology',
            11 : 'Training and Education',
            12 : 'Community Involvement and Landowner Outreach',
            13 : 'Public Land Management Responsibilities',
            14 : 'Communications and Public Reporting',
            15 : 'Management Review and Continual Improvement'
        };

        $scope.fiberObjectives = {
            1  : 'Biodiversity in Fiber Sourcing',
            2  : 'Adherence to Best Management Practices',
            3  : 'Use of Qualified Resources and Qualified Logging Professionals',
            4  : 'Legal and Regulatory Compliance',
            5  : 'Forestry Research, Science and Technology',
            6  : 'Training and Education',
            7  : 'Community Involvement and Landowner Outreach',
            8  : 'Public Land Management Responsibilities',
            9  : 'Communications and Public Reporting',
            10 : 'Management Review and Continual Improvement',
            11 : 'Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas',
            12 : 'Avoidance of Controversial Sources including Illegal Logging',
            13 : 'Avoidance of Controversial Sources including Fiber Sources from Areas without Effective Social Laws'
        };

        $scope.standardObjectives = {

            1  : 'Forest Management Planning',
            2  : 'Forest Productivity',
            3  : 'Protection and Maintenance of Water Resources',
            4  : 'Conservation of Biological Diversity including Forest with Exceptional Conservation Value',
            5  : 'Management of Visual Quslity and Recreation Benefits',
            6  : 'Protection of Special Sites',
            7  : 'Efficienct Use of Fiber Resources',
            8  : 'Landowner Outreach',
            9  : 'Use of Qualified Logging Professional',
            10 : 'Adherence to Best Management Practices',
            11 : 'Promote Conservation of Biological Diversity, Biodiversity Hotspots and High-Biodiversity Wilderness Areas',
            12 : 'Avoidance of Controvercial Sources, including illegal logging',
            13 : 'Avoidance of Controversial Sources including Fiber Sources from areas Without Effective Social Laws',
            14 : 'Legal and Requlatory Compliance',
            15 : 'Forestry Research, Science and Technology',
            16 : 'Training and Education',
            17 : 'Community Involvement in the Practice of Sustainable Forestry',
            18 : 'Public Land Management Responsibilities',
            19 : 'Communications and Public Reporting',
            20 : 'Management Review and Continual Improvement'

        }

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

