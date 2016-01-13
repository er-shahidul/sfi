var ngScope = null;
sfiFormApp.controller('FormEmergingIssuesCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _, Message){

    $scope.cs7 = angular.copy($rootScope.form.cs7);

    if(!$scope.cs7.planCommPlantYear){
        $scope.cs7.planCommPlantYear = null;
    }

    $scope.user = [];

    $scope.countries = Countries.getAll();


    $scope.findCountry = function(bucket, id){

        return _.find(bucket, function(country){
            return country.id == id;
        });
    }

            $scope.findotherCountry = function(bucket, id){

                return _.find(bucket, function(country){
                    return country.id == id;
                });
            }

    $scope.addCountry = function(model, id){

        //check if already exists
        if($scope.findCountry(model, id)){
            return "";
        }

        var country = $scope.findCountry($scope.countries, id);
        if(country){
            model.push(country);
        }

        return "";
    };

            $scope.addOtherCountry = function(model, id){

                //check if already exists
                if($scope.findotherCountry(model, id)){
                    return "";
                }

                var country = $scope.findotherCountry($scope.countries, id);
                if(country){
                    model.push(country);
                }

                return "";
            };

    $scope.delCountry = function(bucket, id){

        bucket = _.filter(bucket, function(country){
            return country.id != id;
        });

        return bucket;

    };


    $scope.setForms = function(){
        $rootScope.$form = $scope.cs7Form;
    }

    $scope.saveForm = function(go){

        if($scope.cs7Form.$valid){

            $http
                .put("/form/cs7", $scope.cs7)
                .then(function(response){

                    if(response.data){

                        $scope.cs7Form.$setPristine();

                        //$rootScope.form = response.data;
                        //$scope.cs7 = angular.copy($rootScope.form.cs7);
                        //$scope.errors = $scope.cs7.errors;
                        Message.success('Section successfully saved', '.msg-cont');
                    }

                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }

}]);
