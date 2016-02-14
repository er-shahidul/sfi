
sfiSicApp
    .controller('FormNavigationCtrl', ['$rootScope', '$scope', '$state', '$location', function ($rootScope , $scope, $state, $location){



    $scope.isActive = function($name){
        return $state.current.name == $name;
    };

    $scope.isEnabled = function(step){
        return true;
        //sreturn $rootScope.form[step].isSectionEnabled;
    }

    $rootScope.isCompleted = function(){
        return $rootScope.formInfo.isComplete;
    }

    $scope.isSuccess = function(step){

        var cs = $rootScope.form[step];

        if(cs && cs.errors){
            if(Object.keys(cs.errors).length){
                return false;
            }
        }

        return true;
    }

    $scope.getClass = function(step){


        var klass = "";

        if($rootScope.isCompleted()){

            klass = $scope.isSuccess(step) ? 'success' : 'error';

            if($state.is(step)){

                klass += '-active';
            }

            return klass;
        }


        if($scope.isEnabled(step)){
            if($state.is(step)){
                return 'active';
            }
        }

        return 'disabledMenu';
    }



    $rootScope.goStep = function(step){

//        if(!$scope.isEnabled(step)){
//            return false;
//        }

        $state.go(step);
    }



}]);
