var cs1;
sfiFormApp
    .controller('FormProfileCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){

    $scope.countries =  Countries.getSells();
    $scope.otherCountries =  Countries.getOthers();

    $scope.cs1 = angular.copy($rootScope.form.cs1);


    $scope.sellCountry = 0;
    $scope.operateCountry = 0;


    /**
     *
     * Added items in V2
     * */

    cs1 = $scope;
    $scope.cs1.ownsMngLandsOtherCountries = [];
    $scope.cs1.hasPrimaryOperMillsYardsInOtherCountries = [];
    $scope.cs1.hasSecondaryOperMillsYardsInOtherCountries = [];

    /** -/- */

//    $scope.addSellCountry = function(){
//
//
//        if(!$scope.sellCountry) return false;
//
//        var isExists = _.find($scope.cs1.sellsCountries, function(country){
//            return $scope.sellCountry == country.id;
//        });
//
//        if(!isExists) {
//
//            var country = _.find($scope.countries, function(country){
//                return country.id == $scope.sellCountry;
//            });
//
//            if(country){
//                $scope.cs1.sellsCountries.push(country);
//            }
//
//        }
//
//        $scope.sellCountry = 0;
//    }

    $scope.delSellCountry = function(countryId){

        $scope.cs1.sellsCountries = _.filter($scope.cs1.sellsCountries, function(country){
            return country.id != countryId;
        });
    }

    $scope.addOperateCountry = function(){

        if(!$scope.operateCountry) return false;

        var isExists = _.find($scope.cs1.operateCountries, function(country){
            return $scope.operateCountry == country.id;
        });

        if(!isExists) {

            var country = _.find($scope.countries, function(country){
                return country.id == $scope.operateCountry;
            });

            if(country){
                $scope.cs1.operateCountries.push(country);
            }
        }

        $scope.operateCountry = "0";

    }

    $scope.delOperateCountry = function(countryId){

        $scope.cs1.operateCountries = _.filter($scope.cs1.operateCountries, function(country){
            return country.id != countryId;
        });
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs1Form;
    }

    $scope.saveForm = function(go){

        if($scope.cs1Form.$valid){

            $http
                .put("", $scope.cs1)
                .then(function(response){

                    if(response.data){

                        $scope.cs1Form.$setPristine();

                        $rootScope.form = response.data;

                        $scope.cs1 = angular.copy($rootScope.form.cs1);
                        $scope.errors = $scope.cs1.errors;

                        Message.success('Section successfully saved', '.msg-cont', true);
                    }

                    if(go){
                        $rootScope.goStep("cs2")
                    }

                });
        }
    }
}]);
