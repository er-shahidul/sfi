sfiFormApp
    .controller('FormHarvestCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){

        $scope.cs4 = angular.copy($rootScope.form.cs4);

        $scope.showExplCheckboxs = function(country){

            if($rootScope.unit == "HA"){

                if(country == 'usa'){
                    return $scope.cs4.usaAvgHervArea > 50
                }

                return $scope.cs4.caAvgHervArea > 50
            }

            if(country == 'usa'){
                return $scope.cs4.usaAvgHervArea > 120
            }

            return $scope.cs4.caAvgHervArea > 120
        }

        $scope.getPlantingTotal = function(country, type){

            var total = 0;

            _.each(['OneYr', 'TwoYr', 'TwoPlusYr'], function(year){
                var key = $rootScope.camelcase(country + ' ' + type + ' ' + year);
                total += $scope.cs4[key];
            });

            return total.toFixed(4);
        }

        $scope.hasError = function(name){

            if($scope.cs4Form && $scope.cs4Form[name]){
                return $scope.cs4Form[name].$invalid;
            }

            return false;
        }

        $scope.save = function(go){

            $scope.error = true;

            if($scope.cs4Form.$invalid){
                return false;
            }

            $http
                .put("/form/cs4", $scope.cs4)
                .then(function(response){

                    if(response.data){

                        $scope.cs4Form.$setPristine();
                        $rootScope.form.cs4 = response.data;
                        $scope.cs4 = angular.copy($rootScope.form.cs4);
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.updateFormMeta();
                    }


                    if(go){
                        $rootScope.goStep("cs6")
                    }

                });
        }


        $scope.setForms = function(){
            $rootScope.$form = $scope.cs4Form;
        }
    }]);
