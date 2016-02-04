var rootScope = null;
sfiFormApp.controller('FormNavigationCtrl', ['$rootScope', '$scope', '$state', '$location', function ($rootScope , $scope, $state, $location){


    rootScope = $scope;
    $scope.ImageName = 'cs1.png';

    $scope.isActive = function($name){
        return $state.current.name == $name;
    };

    $scope.isEnabled = function(step){
        return true;
    }

    $rootScope.isCompleted = function(){
        return $rootScope.form.isComplete;
    }

    $scope.isSuccess = function(step){
        return $rootScope.form[step].isSectionValid;
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

    $scope.getRightImage = function(step){


        var imageName = step+'.png';

        return imageName;
    }

    $rootScope.goStep = function(step){

        if(!$scope.isEnabled(step)){
            return false;
        }
        //alert(step);
        $scope.ImageName =  $scope.getRightImage(step);
        //alert($scope.ImageName);
        $state.go(step);
    }



}]);
