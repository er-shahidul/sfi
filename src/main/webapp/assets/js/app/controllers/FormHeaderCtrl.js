sfiFormApp.controller('FormHeaderCtrl', ['$rootScope', '$scope', '$http', '$location', '$state',  function ($rootScope , $scope, $http, $location, $state){

    $scope.progress = function(){
        return $rootScope.form.progress;
    }

    $scope.progressClass = function(){
        return { width: $rootScope.form.progress + "%" };
    }

    $scope.printDate = function(timestamp){

        var dateObj = new Date(timestamp);
        return dateObj

    };

    $rootScope.submit = function () {

        $('#submit').modal();
    };

    $rootScope.formSubmit = function(){

        $http
            .put(Routing.generate("sfi_cs10_form_submit", urlData))
            .then(function(){
                window.location.reload();
            })
    }


    $rootScope.printSection = function(){

        if($rootScope.mode == "view"){
            return window.print();
        }

        //var url = Routing.generate("sfi_form_view", angular.extend({}, urlData, {print: true}), true) + '#' + $location.$$path;

        var url = "/sfiPpForm/view?print" + '#' + $location.$$path;
        var win = window.open(url, '_blank');


        win.focus();
    }

    $rootScope.printAllSection = function(){

        if($rootScope.mode == "view"){

            if($state.is('print-all')){
                return window.print();
            }

            $state.go('print-all');

            setTimeout(function(){
                window.print()
            }, 4000);

            return;
        }


//        var url = Routing.generate("sfi_form_view", angular.extend({}, urlData, {print: true}), true) + '#print-all'; // + $location.$$path;

        var url = "/sfiPpForm/view?print" + '#print-all';
        var win = window.open(url, '_blank');
        win.focus();
    }



    $scope.submitText = function(){

        if(form.isAdmin){
            return "Submit";
        }

        return $rootScope.form.status == 3 ? "Submitted" : "Submit";
    }

    $scope.canSubmit = function(){

        var form = $rootScope.form;

        if(!form.isSaved){
            return false;
        }

        if(form.status == 3 && !form.isAdmin){
            return false;
        }

        return true;
    }


}]);
