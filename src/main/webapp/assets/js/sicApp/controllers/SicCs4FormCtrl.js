sfiSicApp
    .controller('SicCs4FormCtrl', ['$scope', '$rootScope', '$http', 'Message', function ( $scope, $rootScope, $http, Message){

        $scope.cs4 = angular.copy($rootScope.form.cs4);

        $scope.saveForm = function(go){

            if($scope.cs4Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs4", $scope.cs4)
                .then(function(response){

                    if(response.data){

                        $scope.cs4Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs4 = response.data;
                        $scope.errors = $rootScope.form.cs4.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs5")
                    }

                });
        }


        $scope.setForms = function(){
            $rootScope.$form = $scope.cs4Form;
        }
    }]);
