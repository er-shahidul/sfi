
sfiSicApp
    .controller('SicCs7FormCtrl', ['$scope', '$rootScope', '$http', 'Message',
        function ( $scope, $rootScope, $http, Message){

        $scope.cs7 = angular.copy($rootScope.form.cs7);

        $scope.bmpReportDoc = {};
        $scope.cs7.bmpReportDoc = $scope.cs7.bmpReportDoc || {};


        $scope.saveForm = function(go){

            if($scope.cs7Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs7", $scope.cs7)
                .then(function(response){

                    if(response.data){

                        $scope.cs7Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs7 = response.data;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs8")
                    }

                });
        }

    }]);