var ngScope = null;
sfiFormApp.controller('FormMarketSurveyCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _ , Message){

    $scope.cs8 = angular.copy($rootScope.form.cs8);

    $scope.user = [];
    $scope.countries = Countries.getAll();

    $scope.findCountry = function(bucket, id){

        return _.find(bucket, function(country){
            return country.id == id;
        });
    }

    $scope.getCountry = function(id){

        var country = _.find($scope.countries, function(country){
            return country.id == id;
        });

        return  country ? country.name : "";
    }

    $scope.addCountry = function(model, id){

        //check if already exists
        if(model.indexOf(id) >= 0){
            return "";
        }

        var country = $scope.findCountry($scope.countries, id);
        if(country)model.push(id);


        return "";
    };

    $scope.delCountry = function(bucket, id){

        bucket = _.filter(bucket, function(countryId){
            return countryId != id;
        });

        return bucket;

    };



    $scope.anySelect = function(){

        return $scope.woodProducts() ||
            $scope.packaging() ||
            $scope.printingWritingPaper() ||
            $scope.bioenergy ()||
            $scope.towelTissue() ||
            $scope.other();
    }

    $scope.woodProducts = function(){
        return $scope.cs8.productSegmentWoodProducts;
    }

    $scope.packaging = function(){
        return $scope.cs8.productSegmentPackaging;
    }

    $scope.printingWritingPaper = function(){
        return $scope.cs8.productSegmentPrintingWritingPaper;
    }

    $scope.bioenergy = function(){
        return $scope.cs8.productSegmentBioenergy;
    }

    $scope.towelTissue = function(){
        return $scope.cs8.productSegmentTowelTissue;
    }

    $scope.other = function(){
        return $scope.cs8.productSegmentOther;
    }

    $scope.isSelected = function(model, val){

        return _.indexOf(model, val) > -1;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs8Form;
    }


    $scope.saveForm = function(go){

        if($scope.cs8Form.$valid){

            $http
                .put(Routing.generate("sfi_cs8_form_update", urlData), $scope.cs8)
                .then(function(response){

                    if(response.data){

                        $scope.cs8Form.$setPristine();
                        $rootScope.form = response.data;
                        $scope.cs8 = angular.copy($rootScope.form.cs8);
                        $scope.errors = $scope.cs8.errors;
                        Message.success('Section successfully saved', '.msg-cont');
                    }


                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }

}]);
