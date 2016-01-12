sfiSicApp
    .controller('SicCs9FormCtrl', ['$scope', '$rootScope', '$http', 'Message',
        function ( $scope, $rootScope, $http, Message){

        $scope.cs9 = angular.copy($rootScope.form.cs9);

        $scope.bmpReportDoc = {};
        $scope.cs9.bmpReportDoc = $scope.cs9.bmpReportDoc || {};


        $scope.saveForm = function(go){

            if($scope.cs9Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs9", $scope.cs9)
                .then(function(response){

                    if(response.data){

                        $scope.cs6Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                    }


                    if(go){
                        $rootScope.goStep("cs10")
                    }

                });
        }

    }]);