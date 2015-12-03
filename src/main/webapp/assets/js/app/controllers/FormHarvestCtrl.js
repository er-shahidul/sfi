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

        return 0;

        var total = 0, items = $scope.cs4[country][type];

        _.each(items, function(item){

            var val = parseFloat(item);
            if(!_.isNaN(val)) total += val;
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

                    //$rootScope.form = response.data;
                    //$scope.cs4 = angular.copy($rootScope.form.cs4);
                    //$scope.errors = $scope.cs4.errors;
                    Message.success('Section successfully saved', '.msg-cont', true);
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
