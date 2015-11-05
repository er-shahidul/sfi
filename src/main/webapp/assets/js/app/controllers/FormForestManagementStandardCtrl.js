sfiFormApp
    .controller('FormForestManagementStandardCtrl',
        ['$rootScope', '$scope', '$state', '$http', '_', 'Message',
            function ($rootScope, $scope, $state, $http, _, Message) {

    $scope.cs9 = angular.copy($rootScope.form.cs9);

    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs9Form;
    }

    $scope.saveForm = function (go) {

        $http
            .put(Routing.generate("sfi_cs9_form_update", urlData), $scope.cs9)
            .then(function(response){

                if(response.data){

                    $rootScope.form = response.data;
                    $scope.cs9 = angular.copy($rootScope.form.cs9);
                    $scope.errors = $scope.cs9.errors;

                    Message.success('Section successfully saved', '.msg-cont');
                }

                if(go){
                    $rootScope.goStep("cs10")
                }

            });
    }

}]);
