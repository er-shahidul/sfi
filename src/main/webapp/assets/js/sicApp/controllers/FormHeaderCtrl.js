var root;
sfiSicApp
    .controller('FormHeaderCtrl', ['$rootScope', '$scope', '$http', '$location', '$state',  function ($rootScope , $scope, $http, $location, $state){

    root = $rootScope;

    $rootScope.formProgress = 0;

    $rootScope.setProgress = function(){

        var formProgress = 0;

        _.each($rootScope.form , function(cs, key){

            if(cs && cs.errors){
                if(Object.keys(cs.errors).length){
                    return;
                }
            }

            formProgress += 10;
        });

        $rootScope.formProgress = formProgress;
    }

    $rootScope.setProgress();

    $scope.progress = function(){
        return $rootScope.form.progress;
    }

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
            .get('/sic/form/submit/' + urlData.companyId)
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
            "/admin/company/sic/form/view/" + formData.id + "?print#" + $location.$$path :
            "/sicForm/view?print#" + $location.$$path;

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
            "/admin/company/sic/form/view/" + formData.id + "?print#print-all" :
            "/sicForm/view?print#print-all" ;

        var win = window.open(url, '_blank');
        win.focus();
    }

    $scope.submitText = function(){

        if(form.isAdmin){
            return "Submit";
        }

        return $rootScope.formInfo.status.id == 3 ? "Submitted" : "Submit";
    }

    $scope.canSubmit = function(){

        var form = $rootScope.formInfo;

        if(form.status.id == 3 && !$rootScope.isAdmin){
            return false;
        }

        var form = $rootScope.formInfo;
        
        if (form.status.id == 3 && !$rootScope.isAdmin){
            return false;
        }

        return true;
    }


}]);
