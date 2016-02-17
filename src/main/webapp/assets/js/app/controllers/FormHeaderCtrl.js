sfiFormApp.controller('FormHeaderCtrl', ['$rootScope', '$scope', '$http', '$location', '$state',  '_', function ($rootScope , $scope, $http, $location, $state, _){

    $rootScope.formProgress = 0;

    $rootScope.setProgress = function(){

        $rootScope.formProgress = 0;

        _.each($rootScope.form , function(cs){

            if(cs && cs.errors){
                if(Object.keys(cs.errors).length){
                    return;
                }
            }

            if($rootScope.mode == "view"){
                $rootScope.formProgress = 100;
            }else{
                $rootScope.formProgress += 10;
            }
        });
    }

    $rootScope.setProgress();

    $scope.progressClass = function(){
        return { width: $rootScope.formProgress + "%" };
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
            .get("/pp/form/submit/" + urlData.companyId)
            .then(function(response){

                if(response.data){
                    var form = response.data.form;
                    if(form.status.id == 3){
                        alert("Form submitted successfully");
                    }else{
                        alert("Please provide required information")
                    }
                }
                window.location.reload();
            })
    }


    $rootScope.printSection = function(){

        if($rootScope.mode == "view"){
            return window.print();
        }


        var url = urlData.isAdmin ?
            "/admin/company/pp/form/view/" + formData.id + "?print#" + $location.$$path :
            "/sfiPpForm/view?print#" + $location.$$path;

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

        var url = urlData.isAdmin ?
            "/admin/company/pp/form/view/" + formData.id + "?print#print-all" :
            "/sfiPpForm/view?print#print-all" ;

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

//        var form = $rootScope.form;
//
//        if(!form.isSaved){
//            return false;
//        }
//
//        if(form.status == 3 && !form.isAdmin){
//            return false;
//        }

        return true;
    }


}]);
