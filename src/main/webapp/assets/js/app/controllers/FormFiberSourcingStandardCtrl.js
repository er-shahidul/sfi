sfiFormApp
    .controller('FormFiberSourcingStandardCtrl',
        ['$rootScope', '$scope', '$state', '$http', '_','Message',
            function ($rootScope, $scope, $state, $http, _, Message) {


    $scope.cs10 = angular.copy($rootScope.form.cs10);

    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs10Form;
    }

    $scope.saveForm = function (go) {

        $http
            .put("/form/cs10", $scope.cs10)
            .then(function(response){

                if(response.data){

                    $scope.cs10Form.$setPristine();
                    //$rootScope.form = response.data;
                    //$scope.cs10 = angular.copy($rootScope.form.cs10);
                    //$scope.errors = $scope.cs10.errors;


                    Message.success('Section successfully saved', '.msg-cont');
                }
            });

    };
}]);
