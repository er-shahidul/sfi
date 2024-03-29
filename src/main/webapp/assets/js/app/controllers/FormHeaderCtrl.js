sfiFormApp.controller('FormHeaderCtrl', ['$rootScope', '$scope', '$http', '$location', '$state',  '_', function ($rootScope , $scope, $http, $location, $state, _){

    $rootScope.formProgress = 0;

    $rootScope.hasSectionError = function(cs){
        if(cs && cs.errors){
            if(Object.keys(cs.errors).length){
                return true;
            }
        }

        return false;
    };

    $rootScope.setProgress = function(){


        if($rootScope.isSfiSecondary()){
            var cs1 = $rootScope.form.cs1;
            $rootScope.formProgress = $rootScope.hasSectionError(cs1) ? 0 : 100;
            return;
        }

        $rootScope.formProgress = 0;

        _.each($rootScope.form , function(cs, key){


            if($rootScope.hasSectionError(cs)){
                return;
            }

//            if(cs && cs.errors){
//                if(Object.keys(cs.errors).length){
//                    return;
//                }
//            }

            //if($rootScope.mode == "view"){
            //    $rootScope.formProgress = 100;
            //}else{
                $rootScope.formProgress += 10;
            //}
        });

    };

    $rootScope.setProgress();

    $scope.progressClass = function(){
        return { width: $rootScope.formProgress + "%" };
    };

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
                    var res = false;
                    _.each($rootScope.form , function(cs, key){

                        if(cs && cs.errors){
                            if(Object.keys(cs.errors).length){
                                res = true;
                            }
                        }
                    });

                    if(res){
                        alert("Please provide required information")
                    }

                }
                window.location.reload();
            })
    };


    $rootScope.printSection = function(){

        if($rootScope.mode == "view"){
            return setTimeout(function(){ window.print() }, 4000);
        }

        var url = urlData.isAdmin ?
            "/admin/company/pp/form/view/" + formData.id + "?print#" + $location.$$path :
            "/sfiPpForm/view?print#" + $location.$$path;

        var win = window.open(url, '_blank');

        win.focus();
    };

    $rootScope.printAllSection = function(){

        if($rootScope.mode == "view"){

            if($state.is('print-all')){
                return setTimeout(function(){ window.print() }, 4000);
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
    };

    $scope.submitText = function(){

        if(form.isAdmin){
            return "Submit";
        }

        return $rootScope.formInfo.status.id == 3 ? "Submitted" : "Submit";
    };

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

        var form = $rootScope.formInfo;

        if (form.status.id == 3 && !$rootScope.isAdmin){
            return false;
        }

        return true;
    }


}]);
