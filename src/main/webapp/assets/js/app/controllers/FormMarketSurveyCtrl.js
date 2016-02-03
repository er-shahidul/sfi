var cs8;
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

        $scope.cs8.primaryProducers = $scope.cs8.primaryProducers || [];

        $scope.producer = {};
        $scope.producerIndex = null;


        $scope.producers = [
            "A&A Trading Ltd.",
            "ABITIBI RIVER FOREST MANAGEMENT INC",
            "American Forest Management (AFM) – PNW Group",
            "ANC Timber Ltd.",
            "Anthony Forest Products",
            "Arbec Forest Products G.P.",
            "AT Limited Partnership",
            "Atco Wood Products Ltd.",
            "AV Group (AV Nackawic and AV Cell)",
            "BBC Land LLC",
            "Bennett Lumber Products, Inc.",
            "Boise Cascade Company",
            "Boise Paper Holdings, LLC",
            "British Columbia Timber Sales",
            "C&C Resources Ltd.",
            "C&D Lumber Co.",
            "Cal-Tex Lumber Company, Inc.",
            "Campbell Global, LLC - East Coast and Southeast Re",
            "Campbell Global, LLC - Northwest Region",
            "Campbell Global, LLC - Southwest Region",
            "Canfor Southern Pine",
            "Canyon Lumber Co., Inc.",
            "Capacity Forest Management Ltd.",
            "Carrier Forest Products Ltd.",
            "Carrier Lumber Ltd.",
            "Catalyst Paper Corporation",
            "Catchmark Timber Trust, Inc.",
            "Clearwater Paper Corporation",
            "Clearwater Paper Corporation - AR ",
            "Clearwater Paper Corporation - Lewiston ",
            "Clemson Experimental Forest ",
            "Cogent Fibre Inc.",
            "Collum's Lumber Products, LLC ",
            "Conifex Timber Inc.",
            "Conservation Forestry LLC",
            "Daishowa-Marubeni International - Peace River Pulp ",
            "Delaware Wild Lands",
            "Deltic Timber Corporation",
            "Domtar Inc., Dryden",
            "Domtar Inc., Espanola ",
            "Domtar Inc., Usine de Windsor",
            "Domtar Paper Company LLC",
            "Drax Biomass Inc.",
            "Dryden Forest Management Co. Ltd.",
            "Dunkley Lumber Ltd.",
            "Durgin and Crowell Lumber Co., Inc.",
            "Edwards Wood Products",
            "Enviva Holdings LP",
            "Evergreen Packaging, Inc.",
            "Expera Specialty Solutions, LLC",
            "F.H. Stoltze Land & Lumber Company",
            "Finch Paper LLC",
            "Florida Forest Service",
            "Foley Cellulose LLC",
            "Forest Investment Associates (FIA)",
            "Forestar (USA) Real Estate Group, Inc.",
            "Fornebu Lumber Company Inc., Woodlands Division",
            "Fruit Growers Supply Company",
            "Futurewood Corp.",
            "Georgia Biomass LLC",
            "Georgia-Pacific LLC",
            "Glatfelter - Wood Division",
            "Glatfelter Chillicothe Woodlands",
            "GMO Threshold Timber Corp. - Michigan",
            "GMO Threshold Timber Corporation",
            "Graphic Packaging International",
            "Green Bay Packaging Inc.",
            "Green Diamond Resource Company",
            "Greenmantle  Forest Inc.",
            "Greif Packaging, LLC ",
            "Groupe Forestra Coopérative Forestière ",
            "Groupe Savoie Inc. ",
            "H.W. Culp Lumber Company",
            "Hampton Resources, Inc.",
            "Hancock Forest Management ",
            "Hankins, Inc. ",
            "Harden Furniture, Inc.",
            "Hilton Timberlands, LLC",
            "Homan Industries ",
            "Hood Container Corporation ",
            "Hood Industries, Inc.",
            "Howe Sound Pulp & Paper Corporation",
            "Huber Engineered Woods, LLC",
            "Husby Forest Products Ltd. ",
            "Idaho Forest Group, LLC",
            "Idaho Timber, LLC",
            "Indiana Department of Natural Resources",
            "Interfor (formerly Tolleson Lumber LLC)",
            "Interfor Corporation",
            "International Paper Company",
            "Island Timberlands Limited Partnership",
            "J.D. Irving Limited",
            "JAMESTOWN TIMBER LP",
            "Jasper Lumber Company/ Southern Wood Chips",
            "JH Huscroft",
            "Joe N. Miles and Sons, Inc.",
            "Jordan Lumber & Supply, Inc.",
            "KapStone Paper and Packaging Corporation",
            "Katahdin Forest Management LLC",
            "King Forest Industries, Inc.",
            "KPAQ Industries, LLC",
            "KyKenKee, Inc.",
            "Lampe & Malphrus Lumber Company ",
            "L&M Lumber",
            "Lincoln Paper and Tissue ",
            "Louisiana Pacific Corporation",
            "Lone Rock Tmber Management Company",
            "Mackenzie Fibre Management Corporation",
            "Madison Paper Industries, a UPM Group Company",
            "Maine Bureau Parks and Lands ",
            "Manning Diversified Forest Products ",
            "Maryland DNR Forest Service",
            "Masonite Corporation",
            "McShan Lumber Company, Inc.",
            "Meadow Lake OSB Limited Partnership",
            "Michigan Department of Natural Resources ",
            "Michigan-California Timber Company LP",
            "Miitigoog Limited Partnership",
            "Millar Western Forest Products Ltd.",
            "Minnesota Counties Sustainable Forest Co-operative",
            "Minnesota Department of Natural Resources",
            "Mondi Pine Bluff, LLC",
            "Montreal Lake Business Ventures Ltd.",
            "Neiman Enterprises, Inc.",
            "New York State Dept of Environmental Conservation",
            "NewPort Timber LLC",
            "Nipissing Forest Resource Management Inc.",
            "Norbord Inc.",
            "Norfolk Southern Railway Company",
            "Northern Pulp Nova Scotia Corporation ",
            "Nova Scotia Department of Natural Resources",
            "Ohio Division of Forestry",
            "Olympic Resource Management",
            "Orion Timberlands, LLC",
            "Packaging Corporation of America",
            "Parton Lumber Company",
            "Philmont Scout Ranch",
            "Pingree Associates",
            "Plum Creek Timber Company, Inc.",
            "Pollard Lumber Company",
            "Ponderay Newsprint",
            "Port Blakely Tree Farms, L.P.",
            "Port Hawkesbury Paper Limited Partnership",
            "Port Townsend Paper Corporation",
            "POTLATCH FOREST HOLDINGS CORPORATION",
            "PROCURE LLC",
            "Pyramid Mountain Lumber, Inc.",
            "Rayonier Advanced Materials Wood Procurement LLC",
            "Rayonier USFR ",
            "ReEnergy Holdings LLC",
            "Resolute FP Canada Inc./ PF Résolu Canada Inc.",
            "Resolute FP US Inc. - US Wood Products",
            "Resource Management Service, LLC",
            "Revelstoke Community Forest Corporation",
            "Rex Lumber Company, LLC",
            "Rock-Tenn Company",
            "SAPPI North America (S.D. Warren Company)",
            "Scotch & Gulf Lumber, LLC",
            "Scotch Plywood Company, Inc.",
            "Sierra Pacific Industries",
            "Sinclar Group Forest Products Ltd",
            "Solvay Biomass Energy, LLC",
            "Sonoco Products Company",
            "South Carolina Forestry Commission",
            "Southern Veneer Products",
            "Spruce Products Limited",
            "Spruceland Millworks Inc.",
            "St. Charles Community LLC",
            "ST. JOE TIMBERLAND CO. OF DEL. LLC",
            "St. Louis County Land and Minerals",
            "Stella-Jones Canada Inc. ",
            "Stimson Lumber Company",
            "Stuwix Resources Joint Venture",
            "Swanson Group Mfg. LLC",
            "Tamarack Mill, LLC dba Evergreen Forest",
            "The Conservation Fund ",
            "The Gorman Group of Companies",
            "The Lyme Timber Company LP ",
            "The Molpus Woodlands Group, LLC",
            "The Nature Conservancy - Montana",
            "The Port Townsend Group, Port Townsend Paper Corpo",
            "The Westervelt Company",
            "Timber Products Company",
            "Timberland Investment Resources LLC",
            "TimberWest Forest Corporation",
            "Timiskaming Forest Alliance, Inc.",
            "Tolko Industries Ltd.",
            "Trinchera Property Managment, LLC",
            "Twin Rivers Paper Company, Woodlands & Procurement",
            "UPM Blandin",
            "UPPER HUDSON WOODLANDS ATP LP",
            "Varn Wood Products, LLC",
            "Verso Corporation",
            "Wagner Forest Management, Ltd",
            "Washington Department of Natural Resources ",
            "WD CHIPS LLC",
            "Weaber, Inc.",
            "West Fraser Mills Ltd.",
            "West Fraser, Inc.",
            "WestRock (MWV)",
            "Weyerhaeuser Columbia Timberlands (Longview Timber",
            "Weyerhaeuser NR Company",
            "Wisconsin Department of Natural Resources",
            "Wisconsin's County Forest Program",
            "Woodland Pulp LLC",
            "Wynndel Box & Lumber Co. Ltd. dba WynnWood",
            "Yakama Nation and Yakama Forest Products",
            "Zilkha Biomass Fuels I LLC"

        ];

        $scope.producers = _.unique($scope.producers);

        $scope.addProducer = function(){

            if($scope.cs8Form.producerSource.$valid && $scope.cs8Form.percPurchased.$valid){

                //alert($scope.producer.source);
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
            //
            //if(confirm('Are you sure to delete this item ?')){
            //    $scope.cs8.primaryProducers.splice(index, 1);
            //}
            $('#delete2').modal();
        }

        $scope.deleteConfirm2 = function(index){

            $scope.cs8.primaryProducers.splice(index, 1);

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
            //if(confirm("Are you sure to delete this ?")){
            //    $scope.cs8.orgContacts.splice(index, 1);
            //}
            $('#delete1').modal();

        }
            $scope.deleteConfirm = function(index){

                $scope.cs8.orgContacts.splice(index, 1);

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
                            $rootScope.form.cs8 = response.data;
                            Message.success('Section successfully saved', '.msg-cont');
                            $rootScope.updateFormMeta();
                        }


                        if(go){
                            $rootScope.goStep("cs9")
                        }

                    });
            }

        }

}]);



