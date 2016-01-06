var ngScope = null;
sfiFormApp.controller('FormMarketSurveyCtrl',
    ['$rootScope', '$scope', 'Countries',  '$http', '_', 'Message',
        function ($rootScope , $scope, Countries, $http, _ , Message){

        ngScope = $scope;
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

        $scope.cs8.primaryProducers = $scope.cs8.primaryProducers || [];

        $scope.producer = {};
        $scope.producerIndex = null;

        $scope.producers = [
            'producers 1' , 'producers 2'
        ];

        $scope.addProducer = function(){

            if($scope.cs8Form.producerSource.$valid && $scope.cs8Form.percPurchased.$valid){

                if(!$scope.producerIndex){
                    $scope.cs8.primaryProducers.push($scope.producer);
                }

                $scope.producerIndex = null;
                $scope.producer = {};
            }
        }

        $scope.editProducer = function(index, producer){
            $scope.producerIndex = index;
            $scope.producer = producer;
        }

        $scope.deleteProducer = function(index){

            if(confirm('Are you sure to delete this item ?')){
                $scope.cs8.primaryProducers.cs8.primaryProducers(index, 1);
            }
        }



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
