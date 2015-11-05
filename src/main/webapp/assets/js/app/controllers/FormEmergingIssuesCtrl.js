var ngScope = null;
sfiFormApp.controller('FormEmergingIssuesCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _, Message){

    $scope.cs7 = angular.copy($rootScope.form.cs7);

    if(!$scope.cs7.planCommPlant_year){
        $scope.cs7.planCommPlant_year = null;
    }

    $scope.user = [];

    $scope.countries = Countries.getAll();


    $scope.findCountry = function(bucket, id){

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
                .put(Routing.generate("sfi_cs7_form_update", urlData), $scope.cs7)
                .then(function(response){

                    if(response.data){

                        $scope.cs7Form.$setPristine();

                        $rootScope.form = response.data;
                        $scope.cs7 = angular.copy($rootScope.form.cs7);
                        $scope.errors = $scope.cs7.errors;
                        Message.success('Section successfully saved', '.msg-cont');
                    }

                    if(go){
                        $rootScope.goStep("cs8")
                    }

                });
        }

    }

}]);
