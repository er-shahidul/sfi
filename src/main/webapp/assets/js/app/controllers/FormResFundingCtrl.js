
sfiFormApp
    .controller('FormResFundingCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', '_', 'Message',
            function ($rootScope , $scope, $state, $http, Countries, _, Message){

    $scope.cs5 = angular.copy($rootScope.form.cs5);

//    $scope.operateInUsa = function(){
//
//        return $rootScope.form.cs1.operatesInUsa;
//    }
//
//    $scope.operateInCa = function(){
//
//        return $rootScope.form.cs1.operatesInCanada;
//    }


    $scope.hasAnyOrg = function(){


        with( $scope.cs5){

            return academicList
                || researchList
                || conservationList
                || governmentList
                || communityList
                || otherList;
        }
    }



    $scope.init = function(){

        _.each($scope.cs5.items, function(item){

            if(!$scope.operateInCa(item)){
                item.internalCad = null;
                item.externalCad = null;
            };


            if(!$scope.operateInUsa(item)){
                item.internalUsd = null;
                item.externalUsd = null;
            };
        });

    }

    $scope.init();


    $scope.setForms = function(){
        $rootScope.$form = $scope.cs5Form;
    }


    $scope.save = function(go){


        if($scope.cs5Form.$invalid){
            return false;
        }

        $http
            .put(Routing.generate("sfi_cs5_form_update", urlData), $scope.cs5)
            .then(function(response){

                if(response.data){

                    $scope.cs5Form.$setPristine();
                    $rootScope.form = response.data;
                    $scope.cs5 = angular.copy($rootScope.form.cs5);
                    $scope.errors = $scope.cs5.errors;
                    Message.success('Section successfully saved', '.msg-cont');
                }

                if(go){
                    $rootScope.goStep("cs3")
                }

            });
    }

}]);
