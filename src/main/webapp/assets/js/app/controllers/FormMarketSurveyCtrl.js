var ngScope = null;
sfiFormApp.controller('FormMarketSurveyCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _ , Message){

        $scope.cs8 = {} ;
        $scope.cs8Data = angular.copy($rootScope.form.cs8);

        _.each($scope.cs8Data, function(val){
            $scope.cs8 = _.extend($scope.cs8, val);
        });

        $scope.formData = function(){

            _.each($scope.cs8Data, function(object, key){

                _.each(object, function(val, key){
                    object[key] = $scope.cs8[key];
                });

            });

            return $scope.cs8Data;
        };


        $scope.contact = {};
        $scope.contactIndex = null;

        $scope.isContactDirty = function(){
            return $scope.contact.name ||
                $scope.contact.email ||
                $scope.contact.position;
        }


        $scope.addContact = function(){

            if(!$scope.contactForm.$valid){
                return false;
            }

            if($scope.contactIndex == null){
                $scope.contactIndex = $scope.cs8.orgContacts.length;
                $scope.cs8.orgContacts.push({});
            }

            $scope.cs8.orgContacts[$scope.contactIndex] = {
                name     : $scope.contact.name,
                email    : $scope.contact.email,
                position : $scope.contact.position
            }

            $scope.contact = {};
            $scope.contactIndex = null;


        }

        $scope.editContact = function(index, contact){
            $scope.contactIndex = index;
            $scope.contact = angular.copy(contact);
        }

        $scope.deleteContact = function(index, contact){
            if(confirm("Are you sure to delete this ?")){
                $scope.cs8.orgContacts.splice(index, 1);
            }

        }




    $scope.user = [];
    $scope.countries = Countries.getAll();

    /*
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
    */


        $scope.anySelect = function(){

            var flag = false;

            var hasSelected = _.find($scope.productItems(), function(key){
                return $scope.cs8[key];
            });

            return hasSelected ? true : false;
        }

        $scope.productItems = function(){

            return [
                'productSegmentPrintingWritingPaper',
                'productSegmentPackaging',
                'productSegmentBioenergy',
                'productSegmentPulp',
                'productSegmentLand',
                'productSegmentSolidWood',
                'productSegmentPaperMerchant',
                'productSegmentPaperBoard',
                'productSegmentFurniture',
                'productSegmentTowelTissue',
                'productSegmentPrinter',
                'productSegmentWoodMerchant',
                'productSegmentOther'
            ]

        }


        $scope.printingWritingPaper = function(){
            return $scope.cs8.productSegmentPrintingWritingPaper;
        }

        $scope.packaging = function(){
                return $scope.cs8.productSegmentPackaging;
        }

        $scope.bioenergy = function(){
            return $scope.cs8.productSegmentBioenergy;
        }

        $scope.pulp = function(){
            return $scope.cs8.productSegmentPulp;
        }

        $scope.land = function(){
            return $scope.cs8.productSegmentLand;
        }

        $scope.solidWood = function(){
            return $scope.cs8.productSegmentSolidWood;
        }

        $scope.paperMerchant = function(){
            return $scope.cs8.productSegmentPaperMerchant;
        }

        $scope.paperBoard = function(){
            return $scope.cs8.productSegmentPaperBoard;
        }

        $scope.furniture = function(){
            return $scope.cs8.productSegmentFurniture;
        }

        $scope.towelTissue = function(){
            return $scope.cs8.productSegmentTowelTissue;
        }

        $scope.printer = function(){
            return $scope.cs8.productSegmentPrinter;
        }

        $scope.woodMerchant = function(){
            return $scope.cs8.productSegmentWoodMerchant;
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
                .put("/form/cs8", $scope.formData())
                .then(function(response){

                    if(response.data){

                        $scope.cs8Form.$setPristine();

                        //$rootScope.form = response.data;
                        //$scope.cs8 = angular.copy($rootScope.form.cs8);
                        //$scope.errors = $scope.cs8.errors;
                        Message.success('Section successfully saved', '.msg-cont');
                    }


                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }

}]);
