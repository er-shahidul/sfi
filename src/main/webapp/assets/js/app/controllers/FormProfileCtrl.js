var cs1;
sfiFormApp
    .controller('FormProfileCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){

    cs1 = $scope;
    $scope.cs1 = angular.copy($rootScope.form.cs1);

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs1Form;
    }

    $scope.saveForm = function(go){

        if($scope.cs1Form.$valid){

            $http
                .put("/form/cs1", sfiV2.getSectionData('cs1', $scope.cs1))
                .then(function(response){

                    if(response.data){

                        $scope.cs1Form.$setPristine();

                        formData = response.data
                        $rootScope.form = sfiV2.prepareForm(formData);



                        $scope.cs1 = angular.copy($rootScope.form.cs1);
                        $scope.errors = $scope.cs1.errors;

                        Message.success('Section successfully saved', '.msg-cont', true);
                    }

                    if(go){
                        $rootScope.goStep("cs2")
                    }

                });
        }
    }
}]);
