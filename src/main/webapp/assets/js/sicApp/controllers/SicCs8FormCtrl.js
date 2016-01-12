
sfiSicApp
    .controller('SicCs8FormCtrl', ['$scope', '$rootScope', '$http', 'Message',
        function ( $scope, $rootScope, $http, Message){

        $scope.cs8 = angular.copy($rootScope.form.cs8);

        $scope.bmpReportDoc = {};
        $scope.cs8.bmpReportDoc = $scope.cs8.bmpReportDoc || {};


        $scope.saveForm = function(go){

            if($scope.cs8Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs8", $scope.cs8)
                .then(function(response){

                    if(response.data){

                        $scope.cs6Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                    }


                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }]);