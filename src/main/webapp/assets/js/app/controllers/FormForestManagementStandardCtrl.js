sfiFormApp
    .controller('FormForestManagementStandardCtrl', ['$rootScope', '$scope', '$state', '$http', '_', 'Message', function ($rootScope, $scope, $state, $http, _, Message) {

    /** CS9  represents front step 7 */

    $scope.cs9 = angular.copy($rootScope.form.cs9);
    cs9 = $scope;


    //$scope.cs9.forestlandAreas = [];

    $scope.hasRegionData = function(){

        return $scope.regionId || $scope.regionArea;

    }

    $scope.saveRegionArea = function(){


        if($scope.hasRegionData() && $scope.forestlandForm.$valid){

            var forestlandArea = {

                region : $rootScope.getRegion($scope.regionId),
                area   : $scope.regionArea

            };

            $scope.cs9.forestlandAreas.push(forestlandArea);
        }
    }




    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs9Form;
    }

    $scope.saveForm = function (go) {

        $http
            .put("/form/cs9", $scope.cs9)
            .then(function(response){

                if(response.data){

                    //$rootScope.form = response.data;
                    //$scope.cs9 = angular.copy($rootScope.form.cs9);
                    //$scope.errors = $scope.cs9.errors;

                    Message.success('Section successfully saved', '.msg-cont');
                }

                if(go){
                    $rootScope.goStep("cs10")
                }

            });
    }

}]);
