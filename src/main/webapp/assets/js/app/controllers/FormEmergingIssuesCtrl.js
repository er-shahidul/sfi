var ngScope = null;
sfiFormApp.controller('FormEmergingIssuesCtrl',
    ['$rootScope', '$scope','$state', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, $state, Countries, $http, _, Message){

    $scope.cs7 = angular.copy($rootScope.form.cs7);

    if(!$scope.cs7.planCommPlantYear){
        $scope.cs7.planCommPlantYear = null;
    }

    $scope.user = [];



    $scope.setForms = function(){
        $rootScope.$form = $scope.cs7Form;
    }

    $scope.saveForm = function(go){

        if($scope.cs7Form.$valid){

            $http
                .put("/form/cs7", $scope.cs7)
                .then(function(response){

                    if(response.data){

                        $scope.cs7Form.$setPristine();

                        //$rootScope.form = response.data;
                        //$scope.cs7 = angular.copy($rootScope.form.cs7);
                        //$scope.errors = $scope.cs7.errors;
                        Message.success('Section successfully saved', '.msg-cont');
                    }

                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }

}]);
