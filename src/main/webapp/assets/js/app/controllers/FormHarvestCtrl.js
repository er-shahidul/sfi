sfiFormApp
    .controller('FormHarvestCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){


    $scope.cs4 = angular.copy($rootScope.form.cs4);

    $scope.operateInUsa = function(){

        return $rootScope.form.cs1.operatesInUsa;
    }

    $scope.operateInCa = function(){

        return $rootScope.form.cs1.operatesInCanada;
    }

    $scope.operateInOthers = function(){

        return $rootScope.form.cs1.operatesInOthers;
    }



    $scope.showExplCheckboxs = function(country){

        if($rootScope.unit == "HA"){


            if(country == 'usa'){

                return $scope.cs4.usa.avgHervArea > 50
            }

            return $scope.cs4.ca.avgHervArea > 50


        }

        if(country == 'usa'){

            return $scope.cs4.usa.avgHervArea > 120
        }

        return $scope.cs4.ca.avgHervArea > 120
    }

    $scope.getPlantingTotal = function(country, type){


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
            .put(Routing.generate("sfi_cs4_form_update", urlData), $scope.cs4)
            .then(function(response){

                if(response.data){

                    $scope.cs4Form.$setPristine();

                    $rootScope.form = response.data;
                    $scope.cs4 = angular.copy($rootScope.form.cs4);
                    $scope.errors = $scope.cs4.errors;
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
