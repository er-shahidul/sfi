sfiSicApp
    .controller('SicCs10FormCtrl', ['$scope', '$rootScope', '$http', 'Message',
        function ( $scope, $rootScope, $http, Message){

        $scope.cs10 = angular.copy($rootScope.form.cs10);

        $scope.today = new Date();

        $scope.saveForm = function(go){

            if($scope.cs10Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs10", $scope.cs10)
                .then(function(response){

                    if(response.data){

                        $scope.cs10Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs10 = response.data;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs10")
                    }

                });
        }

    }]);