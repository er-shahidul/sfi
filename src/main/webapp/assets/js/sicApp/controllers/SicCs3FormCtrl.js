sfiSicApp
    .controller('SicCs3FormCtrl', ['$scope', '$rootScope', '$http', 'Message', function ( $scope, $rootScope, $http, Message){

        $scope.cs3 = angular.copy($rootScope.form.cs3);

        $scope.brochureSpecifyFiles = {}
        $scope.cs3.brochureSpecifyFiles = $scope.cs3.brochureSpecifyFiles || [];

        $scope.workshopSpecifyFiles = {}
        $scope.cs3.workshopSpecifyFiles = $scope.cs3.workshopSpecifyFiles || [];
        
        $scope.saveForm = function(go){

            if($scope.cs3Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs3", $scope.cs3)
                .then(function(response){

                    if(response.data){

                        $scope.cs3Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs3 = response.data;
                        $scope.errors = $rootScope.form.cs3.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs4")
                    }

                });
        }


        $scope.setForms = function(){
            $rootScope.$form = $scope.cs4Form;
        }
    }]);
