sfiFormApp.controller('FormRawMaterialCtrl',
    ['$rootScope', '$scope', '$state', '$http', 'Countries', 'RegionList', '$popover', '$compile' , '_', 'Message', '$', '$modal',
        function ($rootScope , $scope, $state, $http, CountryList , RegionList, $popover, $compile, _, Message, $, $modal){


    $scope.usCanadaEdit   = false;
    $scope.usCanadaDelete = null;

    $scope.cs6 = angular.copy($rootScope.form.cs6);

    $scope.init = function(){

        if(!$rootScope.operateInUsa()){

            with($scope.cs6){
                usaFundingProvided = null;
                usaInfoReceived = null;
                usaTimberSellers = null;
            }
        }

        if(!$rootScope.operateInCa()){

            with($scope.cs6){
                caFundingProvided = null;
                caInfoReceived = null;
                caTimberSellers = null;
            }
        }

        $scope.usCanada = [];
        $scope.usOthers = [];

        _.each($scope.cs6.usCanada, function(usCanada){

            var item = { sections : [] };

            _.each(usCanada, function(val, key){

                var matches = /^([a-zA-Z]*)([0-9]+)$/.exec(key);
                if(!matches) return item[key] = val;


                /** Process section data */

                var attr = matches[1];
                var num  = matches[2];

                /** Process moreThanOneStandard data */
                if(attr == "percCertifedMoreThanOneStandard"){
                    matches = /([1-7]{1})(.*)$/.exec(num);
                    attr = attr + matches[1];
                }

                var index = parseInt(matches[2]) - 1;

                if(!item.sections[index]){
                    item.sections[index] = {};
                }

                item.sections[index][attr] = val;
            });

            $scope.usCanada.push(item);
        });

        $scope.usOthers = angular.copy($scope.cs6.usOthers);

    }

    $scope.init();
    $scope.regionId = 0;

    $scope.getUsCanada = function(regionId){

        var usCanada = _.find($scope.usCanada, function(item){
            return item.region.id == regionId;
        });

        return usCanada;
    }

    $scope.isUsCanadaExist = function(){

        if($scope.usCanadaEdit && $scope.usCanadaEdit.regionId == $scope.regionId){
            return false;
        }

        var usCanada = $scope.getUsCanada($scope.regionId);

        if(usCanada){
            $scope.setRegion(0);
            $scope.resetSection();
            return alert('Already has info for this region');
        }
    }

    $scope.isSectionDirty = function(form){

        for(var i=1;i <11; i++){
            var item = 'item' + i , el = form[item];

            if(el && el.$modelValue){
                return true;
            }
        }

        return false;
    }

    $scope.saveUsCanada = function(){

        /** Check if atleast one valid section there */

        var hasValidSection = false , isValid  = true;

        _.each($scope.sections, function(section){
            var form = section.form;

            if(!$scope.isSectionDirty(form)){
                return;
            }

            isValid = isValid && form.$valid;
            hasValidSection = hasValidSection || form.$valid;
        });

        if(!isValid || !hasValidSection){
            return $('#confirm').modal();
        }


        var region   = $rootScope.getRegion($scope.regionId);
        var usCanada = $scope.usCanadaEdit ? $scope.usCanadaEdit : { sections : [] };

        usCanada.region = region;
        usCanada.otherLabel = $scope.otherLabel ;

        _.each($scope.sections, function(section, index){
            usCanada.sections[index] = $scope.setSectionValues(section, {});
        });


        if(!$scope.usCanadaEdit){
            $scope.usCanada.push(usCanada);
        }

        $scope.isDataDirty = true;
        $scope.resetSection();
    }

    $scope.resetSection = function(){

        _.each($scope.sections, function(section, index){
            $scope.setSectionValues({}, section);
        });

        $scope.usCanadaEdit   = null;
        $scope.usCanadaDelete = null;
        $scope.otherLabel     = null;
        $scope.regionId       = 0;
    }

    $scope.deleteUsCanada = function(regionId){

        var usCanada = $scope.getUsCanada(regionId);

        if(usCanada){

            $scope.usCanadaDelete = usCanada;
            $('#delete1 #region-text').text(usCanada.regionName);
            $('#delete1').modal();
        }
    }

    $scope.deleteConfirm = function(){

        if($scope.usCanadaDelete){
            $scope.usCanada = _.without($scope.usCanada, $scope.usCanadaDelete);
        }

        if($scope.otherDelete){

            $scope.usOthers = _.without($scope.usOthers, $scope.otherDelete);
            $scope.otherDelete = null;
        }

    }

    $scope.deleteCancel = function(){
        $scope.cancelOther();
        $scope.resetSection();
    }

    $scope.cloneSupply = function(srcSec, destSec){

        for(var i in srcSec){

            var src  = srcSec[i];
            var dest = destSec[i];

            $scope.setSectionValues(src, dest);

        }

    }

    $scope.setSectionValues = function(src, dest){

        dest.unit                                = src.unit || "";
        dest.volume                              = src.volume || null;
        dest.percATFSOnlyCertified               = src.percATFSOnlyCertified || null;
        dest.percCSAOnlyCertified                = src.percCSAOnlyCertified || null;
        dest.percFSCOnlyCertified                = src.percFSCOnlyCertified || null;
        dest.percSFIOnlyCertified                = src.percSFIOnlyCertified || null;
        dest.moreThanOneStandard                 = src.moreThanOneStandard || null;
        dest.percDeliveredQualifiedLogging       = src.percDeliveredQualifiedLogging || null;
        dest.percDeliveredQualifiedLoggingReason = src.percDeliveredQualifiedLoggingReason || "";

        for(var i = 1; i<= 7; i++){
            var key = "percCertifedMoreThanOneStandard" + i;
            dest[key] = src[key];
        }

        return dest;
    }

    $scope.cancelUsCanada = function(){
        $scope.resetSection();
    }

    $scope.editUsCanada = function(regionId){

        var item = $scope.getUsCanada(regionId);

        if(!item){
            return alert('Edit item not found');
        }

        $scope.usCanadaEdit = item;
        $scope.setRegion(regionId);

        for(var i in $scope.sections){

            var src  = item.sections[i]
            var dest = $scope.sections[i];
            $scope.setSectionValues(src, dest);
        }

        $scope.otherLabel = item.otherLabel;


    }

    $scope.setRegion = function(regionId){
        $scope.regionId = regionId;
        angular.element('#regionId')[0].value = $scope.regionId;
    }

    $scope.setForms = function(){
        $rootScope.$form = [$scope.cs6Form ,$scope.innerForm];
    }

    $scope.isDataDirty = false;

    $rootScope.isSectionDirty = function(){
        return $scope.cs6Form.$dirty || $scope.isDataDirty ;
    }

    $scope.preparePayload = function(){

        var data = angular.copy($scope.cs6);
        delete data.sections;

        data.usCanada = [];
        data.usOthers = angular.copy($scope.usOthers);

        _.each($scope.usCanada, function(usCanada){

            var item = usCanada;

            _.each(usCanada.sections, function(section, i){

                var k = parseInt(i) + 1;

                _.each(section, function(val, key){

                    var attr = $rootScope.camelcase(key + ' ' + k );
                    item[attr] = val;
                });

            });

            item.sfiPpForm = $scope.cs6.id;
            data.usCanada.push(item);

        });

        return data;
    }

    $scope.save = function(go){

        if($scope.cs6Form.$invalid){
            return false;
        }


        if($scope.innerForm.$invalid){
            return false;
        }

        var data = $scope.preparePayload();

        $http
            .put("/form/cs6", data)
            .then(function(response){

                if(response.data){

                    $scope.isDataDirty = false;
                    $scope.cs6Form.$setPristine();
                    $rootScope.form.cs6 = response.data;
                    $scope.cs6 = angular.copy($rootScope.form.cs6);
                    $scope.init();
                    Message.success('Section successfully saved', '.msg-cont');
                    $rootScope.updateFormMeta();
                }

                if(go){
                    $rootScope.goStep("cs5")
                }

            });

    }

    $scope.opt1 = [

        { id : 1 , name : "Bone Dry Tons"},
        { id : 2 , name : "Bone Dry Units" },
        { id : 3 , name : "Cords" },
        { id : 4 , name : "Cubic Meters" },
        { id : 5 , name : "Cunits-Chips (CCF)" },
        { id : 6 , name : "Cunits-Roundwood" },
        { id : 7 , name : "Cunits of Sawdust" },
        { id : 8 , name : "Cunits-Whole Tree Chip" },
        { id : 9 , name : "Green Tons" },
        { id : 10 , name : "Green Metric Tonnes" },
        { id : 11 , name : "MBF-Doyle" },
        { id : 12 , name : "MBF-International 1/4" },
        { id : 13 , name : "MBF-Scribner (C or Small)" },
        { id : 14 , name : "MBF-Scribner (Large or Long)" },
        { id : 15 , name : "MCF-Thousand Cubic Feet" },
        { id : 16 , name : "Oven Dried Metric Tons"}
    ];

    $scope.standards = [
        "SFI/FSC",
        "SFI/ATFS",
        "SFI/CSA",
        "ATFS/FSC",
        "CSA/FSC",
        "SFI/ATFS/FSC",
        "SFI/CSA/FSC"
    ];

    $scope.getStandard = function(index){
        return $scope.standards[index];
    }

    $scope.sections = [
        {row : 1,  name : 'Fee and long-term lease', percDeliveredQualifiedLogging : ""},
        {row : 2,  name : 'Direct purchase from TIMOs & REITs'},
        {row : 3,  name : 'Direct purchase from family forest owners'},
        {row : 4,  name : 'Direct purchase from Aboriginal/Tribal lands'},
        {row : 5,  name : 'Direct purchase from conservation lands'},

        {row : 6,  name : 'All other direct purchase from private landowners'},

        {row : 7,  name : 'U.S. Federal lands', isUsa : true},
        {row : 8,  name : 'All other U.S. public lands', isUsa : true},
        {row : 9, name : 'Crown land', isCa : true},
        {row : 10, name : 'Non-controlled crown land', isCa : true},

        {row : 11, name : 'Other sources', otherEnable : false}
    ];


    var tooltips = [

        "Private land you own (fee) or control through a long-term lease. A long-term lease is one that extends beyond a single rotation. If the number of years specified in or remaining on a lease is less than one rotation, the lands covered by such a lease are considered “non-industrial” lands for SFI program conformance and reporting requirements.",
        "Purchases you made directly from Timber Investment Management Organizations (TIMOs) or Real Estate Investment Trusts (REIT)",
        "Family Forest Owners typically own forestlands of 20K acres or less. Ownership must be privately held or held by a public entity. Properties are non-industrial but may be associated with small local business.<br/>" +
            "(Non-industrial – An entity whose primary source of revenue is not derived from processed forest products.)",
        "Purchases from lands owned by or managed for indigenous communities.",
        "For this purpose, “conservation lands” should be interpreted as lands primarily serving a conservation purpose. This could include lands managed under a “working forest conservation easement”, or other lands that may be managed primarily for conservation, but which still generate fiber as part of their management regime.",
        "Purchases you made directly from private forests (EXCLUDES family forests, TIMOs & REITs, conservation lands and Aboriginal/Tribal lands).",
        "Include the total raw material sourced from U.S. Federal Lands (USFS, BLM and any other federal land). This includes direct purchases and your best estimate of indirect purchases-- raw material sourced from U.S. Federal Lands that are supplied by loggers, wood dealers and others.",
        "Include direct and indirect purchases or raw material from State & County lands and all other non- Include the total raw material sourced from U.S. Federal Lands (USFS, BLM and any other federal land). This includes direct purchases and your best estimate of indirect purchases-- raw material sourced from U.S. Federal Lands that are supplied by loggers, wood dealers and others.federal public lands",
        "Crown land (federal and provincial) that you control through a long-term lease.",
        "Direct and indirect purchases from Crown land (federal and provincial) that you do not control through a long-term lease.",
        "Include raw material originating from private forests (family forests, industry, TIMOs, and all other privately held forests) that was not purchased directly from the landowner."
    ];


    for(var i in $scope.sections){
        $scope.sections[i].tooltip = tooltips[i];
    }


    $scope.sectionByRow = function(row){

        var section = _.find($scope.sections, function(section){
            return section.row == row;
        });

        if(section){
            return section.name;
        }

        return "";

    }

    $scope.unitById = function(id){

        var option = _.find($scope.opt1, function(opt){
            return opt.id == id;
        });

        if(option){
            return option.name;
        }

        return "";

    }

    $scope.parseSupplies = function(){

        return;

        _.each($scope.usCanada, function(supply){

            var titles = [];
            _.each(supply.sections, function(section, k){

                if(section.unit){
                    var title = $scope.sectionByRow(k+1);
                    titles.push(title);
                }
            });

            var regionId = supply.regionId;
            supply.regionName = RegionList.getName(regionId);
            supply.title = titles.splice(0, 3).join();
        });
    }

    $scope.valOther = false;

    $scope.saveOther = function(){

        $scope.valOther = true;
        var form = $scope.other.form;

        if(form.$invalid){
            return false;
        }

        var countryId = $scope.other.country.id;
        var country = $rootScope.getMyCountry(countryId);

        if($scope.otherEdit){
            var other = $scope.otherEdit;
        }else{
            var other = {};
        }

        $scope.cloneOther($scope.other, other);

        other.country = country;
        other.sfiPpForm = $scope.cs6.id;

        if(!$scope.otherEdit){
            $scope.usOthers.push(other);
        }

        $scope.isDataDirty = true;
        $scope.cancelOther();

        console.log($scope.usOthers);
    }

    $scope.cancelOther = function(){

        $scope.valOther = false;
        $scope.otherEdit = null;
        $scope.otherDelete = null;
        $scope.cloneOther({} , $scope.other);

        $scope.regionId = 0;
        angular.element('#countryId')[0].value = "";
        angular.element('#regionId')[0].value = 0;

    }

    $scope.cloneOther = function(src, dest){

        dest.percFSCCertified        = src.percFSCCertified || null;
        dest.percOther               = src.percOther  || null;
        dest.percPEFCCertified       = src.percPEFCCertified  || null;
        dest.percPEFCFSCCertified    = src.percPEFCFSCCertified  || null;
        dest.percSFIFiberSourcing    = src.percSFIFiberSourcing || null;
        dest.volume                  = src.volume || null;
        dest.units                   = src.units || null;
        dest.countryID               = src.countryID || null;
        dest.standardValues          = src.standardValues || null;
        dest.percOtherReason         = src.percOtherReason || null;

        return dest;

    }

    $scope.getOther = function(countryId){

        var other = _.find($scope.usOthers, function(item){
            return item.country.id == countryId;
        });

        return other;
    }

    $scope.setOther = function(countryId){


        $scope.regionId = -1;
        $scope.other.countryID = countryId;

        angular.element('#countryId')[0].value = countryId;
        angular.element('#regionId')[0].value = -1;

    }

    $scope.editOther = function(countryId){

        var item = $scope.getOther(countryId);


        if(!item){
            return alert('Edit item not found');
        }

        $scope.otherEdit = item;
        $scope.setOther(countryId);
        $scope.cloneOther(item, $scope.other);

    }

    $scope.deleteOther = function(countryId){

        var item = $scope.getOther(countryId);

        if(item){
            $scope.otherDelete = item;

            $('#delete1 #region-text').text(item.countryName);
            $('#delete1').modal();

        }
    }

    $scope.parseOthers = function(){

        _.each($scope.usOthers, function(other){

            var countryId = other.countryID;
            other.countryName = CountryList.getName(countryId);
            other.title = $scope.unitById(other.units);

        });
    }

    $scope.showPop1Link = function(index){

        var section = $scope.sections[index];
        return section.percDeliveredQualifiedLogging < 100;
    }

    $scope.showPopUp1 = function(index){

        var $el = $("#pop-item-" + index);
        //Check if popover already exists

        if(!$el.data('bs.popover')){

            var content = '<div style="width:300px;">' +
                'Why is this less than 100% and what is your organization doing to reach 100%? (optional)' +
                '<textarea class="form-control"></textarea>' +
                '<div class="col-sm-6 specialpadding alignleft"><button type="button" class="btn btn-cancel">Cancel</button></div>'+
                '<div class="col-sm-6 specialpadding alignright"><button type="button" class="btn btn-success">Ok</button> </div>' +
            '</div>';

            $el.popover({
                trigger : 'manual',
                content : content,
                html : true,
                placement : 'bottom'
            });
        }

        $el.popover('show');
        var $popover = $el.data('bs.popover');

        var $text = $popover.$tip.find("textarea"),
            $ok = $popover.$tip.find(".btn-success");

        var section = $scope.sections[index];
        var reason  = section.percDeliveredQualifiedLoggingReason || "";
        $text.val(reason);

        $ok.click(function(e){
            e.preventDefault();
            section.percDeliveredQualifiedLoggingReason =  $text.val();
        });
    }

    $scope.showPopUp1View = function(index, reason){

        var $el = $("#pop-item-" + index);
        //Check if popover already exists

        if(!$el.data('bs.popover')){

            var content = '<div style="width:300px;">' +
                'Why is this less than 100% and what is your organization doing to reach 100%? (optional)' +
                '<textarea class="form-control"></textarea>' +
                '<div class="col-sm-6 specialpadding alignleft"><button type="button" class="btn btn-cancel">Cancel</button></div>'+
                '<div class="col-sm-6 specialpadding alignright"><button type="button" class="btn btn-success">Ok</button> </div>' +
                '</div>';

            $el.popover({
                trigger : 'manual',
                content : content,
                html : true,
                placement : 'bottom'
            });
        }

        $el.popover('show');
        var $popover = $el.data('bs.popover');

        var $text = $popover.$tip.find("textarea"),
            $ok = $popover.$tip.find(".btn-success");

        //var section = $scope.sections[index];
        //var reason  = section.percDeliveredQualifiedLoggingReason || "";
        $text.val(reason);

        $ok.click(function(e){
            e.preventDefault();
            //section.percDeliveredQualifiedLoggingReason =  $text.val();
        });
    }

    $scope.showPopUp2 = function(index){

        var $el = $("#pop-link-" + index);
        var section = $scope.sections[index];

        if(!$el.data('bs.popover')){

            var content = $('#pop2tpl').html();
            content = content.replace("]]>", "");
            $el.popover({
                trigger : 'manual',
                content : content,
                placement: 'bottom',
                html : true
            });
        }
        //console.log(content);
        $el.popover('show');
        var $popover = $el.data('bs.popover');
        var $text = $popover.$tip.find("textarea"),
            $ok = $popover.$tip.find(".btn-success");

        $popover.$tip
            .find('.icheck').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green'
            })
            .on('ifChecked', function(event){
                $(this).closest('tr').find('input[type=number]').attr('disabled', false);
            })
            .on('ifUnchecked', function(event){
                $(this).closest('tr').find('input[type=number]').attr('disabled', true).val(null);
            })
        ;

        var ob = section.standardValues || {};

        for(var i = 1; i<= 7; i++){

            var key1 = "val"  + i;
            var key2 = "item" + i;

            var $input1 = $popover.$tip.find("input[name=" + key1 +"]");
            var $input2 = $popover.$tip.find("input[name=" + key2 +"]");

            var key = "percCertifedMoreThanOneStandard" + i;
            var val = section[key];


            if(val){
                $input1.val(val).attr('disabled', false);
                $input2.iCheck('check')
            }else{
                $input1.val(null).attr('disabled', true);
                $input2.iCheck('uncheck')
            }
        }

        var section = $scope.sections[index];
        var reason  = section.percDeliveredQualifiedLoggingReason || "";
        $text.val(reason);
        console.log(reason);

        $ok.click(function(e){

            e.preventDefault();

            var $tip = $popover.$tip;
            var ob = {};
            var items = [];

            for(var i = 1; i<= 7; i++){
                var key1 = "val"  + i;
                var key2 = "item" + i;

                var $input1 = $tip.find("input[name=" + key1 +"]");
                var $input2 = $tip.find("input[name=" + key2 +"]");

                var key = "percCertifedMoreThanOneStandard" + i;
               // console.log($input1.val());
               var inputValue = $input1.val().replace("-"," ");
                section[key] = $input2.is(":checked") ?  inputValue : null;
            }

            $scope.$digest()
        });
    }

    $scope.otherLabel = "";

    $scope.isDisabled = function(section){

        if(section.otherEnable === false){
            return true;
        }


        if(section.otherEnable === true){

            if(!$scope.otherLabel){
                return true;
            }

        }

        return false;
    }

    $scope.isOtherDirty = function(){

        var other = $scope.other;

        return other.percFSCCertified
            || other.percOther
            || other.percPEFCCertified
            || other.percPEFCFSCCertified
            || other.percSFIFiberSourcing
            || other.volume
            || other.units
            || other.countryID
            || other.standardValues;
    }

    $scope.showPopUp3 = function(section){

        var $el = $('#otherEnable');

        if(!$el.data('bs.popover')){

            var content = '<div style="width:300px;">' +
                'Specify all other scources' +
                '<textarea class="form-control"></textarea>' +
                '<div class="col-sm-6 specialpadding alignleft"><button type="button" class="btn btn-cancel">Cancel</button></div>'+
                '<div class="col-sm-6 specialpadding alignright"><button type="button" class="btn btn-success">Ok</button> </div>' +
                '</div>';

            $el.popover({
                trigger : 'manual',
                content : content,
                html : true,
                placement : 'bottom'
            });
        }

        if($el.is(":checked")){

            if($el.data('bs.popover')){
                if($el.data('bs.popover').$tip){
                    if($el.data('bs.popover').$tip.is(":visible")){
                        return;
                    }
                }
            }

            $el.popover('show');

        }else{
            $el.popover('hide');
            $scope.otherLabel = "";
            $scope.setSectionValues({}, section);
        }


        var $popover = $el.data('bs.popover');

        var $text = $popover.$tip.find("textarea"),
            $ok = $popover.$tip.find(".btn-success");

        $text.val($scope.otherLabel);

        $ok.click(function(e){
            e.preventDefault();
            $scope.otherLabel =  $text.val();
            if(!$scope.otherLabel){
                $scope.setSectionValues({}, section);
            }

            $scope.$digest()
        });
    }

    $scope.showPopUp4 = function(){

        var $el = $('#other8');
        //Check if popover already exists

        if(!$el.data('bs.popover')){

            var content = '<div style="width:400px; font-size: 9pt; ">' +
                'What standards and/or tools are you using to ensure your off-shore fiber is procured from responsible sources? Let us know if you are using: SFI Fiber Sourcing Requirements; PEFC COC DDS; FSC COC Controlled Wood; World Resources Institute Risk Information Tool; The World Bank Legal Rights Index; Transparency International; or other risk assessment tools. Please specify.' +
                '<textarea class="form-control"></textarea>' +
                '<div class="col-sm-6 specialpadding alignleft"><button type="button" class="btn btn-cancel">Cancel</button></div>'+
                '<div class="col-sm-6 specialpadding alignright"><button type="button" class="btn btn-success">Ok</button> </div>' +
                '</div>';

            $el.popover({
                trigger : 'manual',
                content : content,
                html : true,
                placement : 'bottom'
            });
        }

        if($el.val()){

            if($el.data('bs.popover')){
                if($el.data('bs.popover').$tip){
                    if($el.data('bs.popover').$tip.is(":visible")){
                        return;
                    }
                }
            }

            $el.popover('show');

        }else{
            $el.popover('hide')
        }


        var $popover = $el.data('bs.popover');

        var $text = $popover.$tip.find("textarea"),
            $ok = $popover.$tip.find(".btn-success");

        $text.val($scope.other.percOtherReason);

        $ok.click(function(e){
            e.preventDefault();
            $scope.other.percOtherReason =  $text.val();
            $scope.$digest()
        });
    }

    $scope.parseSupplies();
    $scope.parseOthers();


    var sectionTitles = [
        'Fee and long-term lease',
        'Direct purchase from TIMOs & REITs',
        'Direct purchase from family forest owners',
        'Direct purchase from Aboriginal/Tribal lands',
        'Direct purchase from conservation lands',
        'All other direct purchase from private landowners',
        'U.S. Federal lands',
        'All other U.S. public lands',
        'Crown land',
        'Non-controlled crown land',
        'Other sources'
    ];

    $scope.usCanadaTitle = function(usCanada){

        var titles = [];

        _.each(usCanada.sections, function(section, k){

            if(!section.unit){
                return;
            }

            titles.push(sectionTitles[k]);
        });

        return titles.splice(0, 3).join();
    }

    $scope.usOtherTitle = function(usOther){

        var option = _.find($scope.opt1, function(opt){
            return opt.id == usOther.units;
        });

        return usOther.volume + ", " + option.name;
    }

    var lastYearModal = $modal({
        scope: $scope,
        template: '/assets/partials/form/last-year-modal.html',
        show: false
    });

    var lastYear3Modal = $modal({
        scope: $scope,
        template: '/assets/partials/form/last-year-3modal.html',
        show: false
    });


    $scope.lastYearPop = function(){
        lastYearModal.$promise.then(lastYearModal.show);
        return false;
    }

    $scope.lastYear3Pop = function(){
        lastYearModal.$promise.then(lastYear3Modal.show);
        return false;
    }

    $scope.lastYearClose = function()
    {
        lastYearModal.$promise.then(lastYearModal.hide);
    }
    $scope.lastYear3Close = function()
      {
        lastYearModal.$promise.then(lastYear3Modal.hide);
     }



}]);
