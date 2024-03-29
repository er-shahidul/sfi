sfiFormApp
    .controller('FormProfileCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){

        $scope.cs1 = angular.copy($rootScope.form.cs1);

        $scope.setForms = function(){
            $rootScope.$form = $scope.cs1Form;
        }


        $rootScope.isSfiSecondary() && ($scope.cs1.hasSecondaryOperMillsYards = true);

                $scope.saveForm = function(go){

            if($scope.cs1Form.$valid){

                $http
                    .put("/form/cs1", $scope.cs1)
                    .then(function(response){

                        if(response.data){
                            $scope.cs1Form.$setPristine();
                            $rootScope.form.cs1 = response.data;
                            $scope.cs1 = angular.copy($rootScope.form.cs1);
                            $scope.errors = $rootScope.form.cs1.errors;

                            Message.success('Section successfully saved', '.msg-cont', true);
                            $rootScope.updateFormMeta();
                            $rootScope.updateCs1Error();

                        }
                       //console.log(go); //stp9
                        if(go == 'stp9') $rootScope.goStep("cs8");
                        else if(go) $rootScope.goStep("cs2");
                    });
            }
        }
    }]);
