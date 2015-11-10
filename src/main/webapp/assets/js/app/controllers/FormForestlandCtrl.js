var ngScope = null;
var cs2 = null;
sfiFormApp
    .controller('FormForestlandCtrl',
        ['$rootScope', '$scope', '$state', '$http', 'Countries', 'certifyBodies', '_', 'Message', '$',
            function ($rootScope , $scope, $state, $http, Countries, certifyBodies, _, Message, $){

    cs2 = $scope;

    $scope.error = true;
    $scope.certifyBodies  = certifyBodies;
    $scope.otherCountries = Countries.getOthers();
    $scope.cs2 = angular.copy( $rootScope.form.cs2);

//    $scope.isFieldsEnabled = function(){
//        return $rootScope.form.cs1.ownsOrManagesLands;
//    }
//
//    $scope.operateInUsa = function(){
//
//        return $scope.isFieldsEnabled () && $rootScope.form.cs1.operatesInUsa;
//    }
//
//    $scope.operateInCa = function(){
//
//        return $scope.isFieldsEnabled () && $rootScope.form.cs1.operatesInCanada;
//    }
//
//    $scope.operateInOthers = function(){
//        return $scope.isFieldsEnabled () &&  $rootScope.form.cs1.operatesInOthers;
//    }


    $scope.init = function(){

        if(!$rootScope.operateInUsa()){

            _.each($scope.cs2.usa, function(object){
                for(var i in object){
                    object[i] = null;
                }
            });
        }

        if(!$scope.operateInCa()){

            _.each($scope.cs2.ca, function(object){
                for(var i in object){
                    object[i] = null;
                }
            });
        }

        if(!$scope.operateInOthers()){
            $scope.cs2.outsideCountries = [];
        }

        if(_.isEmpty($scope.cs2.outsideCountries)){
            $scope.addOther();
        }
    }


    $scope.addOther = function(){

        $scope.cs2.outsideCountries.push({
            id                 : null,
            countryId          : "",
            areaManaged        : null,
            certified          : 0,
            certificationBody  : null,
            certificationOther : null
        });

    };

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs2Form;
    }


    $scope.save = function(go){

        $scope.error = true;

        if($scope.cs2Form.$invalid){
            return false;
        }

        $http
            //.put(Routing.generate("sfi_cs2_form_update", urlData), $scope.cs2)
            .put("/form/cs1", sfiV2.getSectionData('cs2', $scope.cs2))
            .then(function(response){

                if(response.data){

                    $scope.cs2Form.$setPristine();

                    formData = response.data
                    $rootScope.form = sfiV2.prepareForm(formData);

                    $scope.cs2 = angular.copy($rootScope.form.cs2);
                    $scope.errors = $scope.cs2.errors;

                    Message.success('Section successfully saved', '.msg-cont');
                    $scope.init();
                }

                if(go){
                    $rootScope.goStep("cs4")
                }

            });
    }


    $scope.isDirty = function(other){

        return other.countryId ||
            other.areaManaged ||
            other.certified ;


    }

    $("#table1 > tbody > tr ").each(function(){

        var tooltip = {
            html : true,
            placement : "bottom",
            container : "#cont-body",
            trigger   : 'hover focus'
        }

        $(this).children('td:eq(2)').tooltip($.extend(tooltip,{
            title : "Include only forest management certifications on the acres managed."
        }));


        $(this).children('td:eq(3)').tooltip($.extend(tooltip, {
            title : "Examples of recreational activities include: Viewing natural features, Hiking, Hunting, Cross-country skiing, Bicycling, Gathering forest products, OHV use, Resort use, Motorized Trail Activity, Non-motorized Water, Primitive Camping, Motorized Water Activities, Snowmobiling, Backpacking, Horseback Riding, etc."
        }));


        $(this)
            .children('td:eq(4)').tooltip($.extend(tooltip, {
                title : "This new question was added in response to the SFI ERP requesting more specific information on recreation area as compared with certified forest lands as well as details on examples of recreational activities on those lands."
            }));

        $(this).children('td:eq(5)').tooltip($.extend(tooltip, {
            placement : "left",
            title : "1. Motorized: fee basis (e.g. hunting, fishing, snowmobiling, camping, etc.)<br/>" +
                    "2. Motorized: no fee (e.g. motorized water activities, snowmobiling, camping, etc.)<br/>" +
                    "3. Non-motorized: fee basis (e.g. hunting, fishing, camping, cross-country skiing, etc)<br/>" +
                    "4. Non-motorized: no fee (e.g. hunting, fishing, bicycling, primitive camping, etc)"
            }));

    })



    $scope.init();
}]);
