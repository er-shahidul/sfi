
var sfiFormApp = angular.module('sfiFormApp', ['ui.router', 'checklist-model',  'ngSanitize', 'mgcrea.ngStrap', 'angularFileUpload','angular-carousel']);

sfiFormApp.config(['$stateProvider', '$urlRouterProvider',  function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise("/profile");

    $stateProvider
        .state('cs1', {
            url : "/profile",
            views: {
                editContainer : {
                
                    templateUrl : '/assets/partials/form/profile.html',
                    controller  : 'FormProfileCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/profile.html',
                    controller  : 'FormProfileCtrl'
                }
            }
        })
        .state('cs2', {
            url : "/forestland-info",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/forestland-info.html',
                    controller  : 'FormForestlandCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/forestland-info.html',
                    controller  : 'FormForestlandCtrl'
                }
            }
        })
        .state('cs4', {
            url : "/harvest",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/harvest.html',
                    controller  : 'FormHarvestCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/harvest.html',
                    controller  : 'FormHarvestCtrl'
                }
            }
        })
        .state('cs5', {
            url : "/research-funding",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/research-funding.html',
                    controller  : 'FormResFundingCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/research-funding.html',
                    controller  : 'FormResFundingCtrl'
                }
            }
        })
        .state('cs6', {
            url : "/raw-material",
            views: {
                editContainer : {
                    templateUrl :  '/assets/partials/form/raw-material.html',
                    controller  : 'FormRawMaterialCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/raw-material.html',
                    controller  : 'FormRawMaterialCtrl'
                }
            }
        })

        .state('cs3', {
            url : "/partnership",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/partnership.html',
                    controller  : 'FormPartnershipCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/partnership.html',
                    controller  : 'FormPartnershipCtrl'
                }
            }
        })
        .state('cs7', {
            url : "/emerging-issues",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/emerging-issues.html',
                    controller  : 'FormEmergingIssuesCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/emerging-issues.html',
                    controller  : 'FormEmergingIssuesCtrl'
                }
            }
        }).state('cs8', {
            url : "/market-survey",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/market_survey.html',
                    controller  : 'FormMarketSurveyCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/market_survey.html',
                    controller  : 'FormMarketSurveyCtrl'
                }
            }
        }).state('cs9', {
            url : "/forest-management-standard",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/forest_management_standard.html',
                    controller  : 'FormForestManagementStandardCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/forest_management_standard.html',
                    controller  : 'FormForestManagementStandardCtrl'
                }

            }
        }).state('cs10', {
            url : "/fiber-sourcing-standard",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/form/fiber_sourcing_standard.html',
                    controller  : 'FormFiberSourcingStandardCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/view/fiber_sourcing_standard.html',
                    controller  : 'FormFiberSourcingStandardCtrl'
                }
            }
        }).state('print-all', {
            url : "/print-all",
            views: {
                viewContainer : {
                    templateUrl  : '/assets/partials/view/view-all.html',
                    controller: function($rootScope) {

                    }
                }
            }
        });
}]);

sfiFormApp.run(['$rootScope', '$state', function($rootScope, $state) {

    $rootScope.isSfiSecondary = function(){
        return !$rootScope.company.primary && $rootScope.company.secondary;
    }

    $rootScope.isStepAllowed = function(step){

        if($rootScope.company.sfi){
            if(step != "cs1" &&  step != "cs8"){
                if($rootScope.isSfiSecondary()){
                    return false;
                }
            }

            return true;
        }

        return false;
    }


    $rootScope.$on('$stateChangeStart', function(e, to) {

        if(/cs[1-9]*/.test(to.name)){
            if(!$rootScope.isStepAllowed(to.name)){
                e.preventDefault();
            }
        }
    });
}]);



sfiFormApp
    .factory('_', function() {
        return window._;
    })
    .factory('$', function() {
        return window.$;
    })
    .factory('standardObjects', function() {
        return window.standardObjects;
    })
    .factory('standardObjects2015', function() {
        return window.standardObjects2015;
    })
    .factory('Countries', ['$http', '$q','_', function($http, $q) {

        var factory = {

            countries : [],
            sellCountries : [],
            otherCountries : [],

            load : function(){

                var defer = $q.defer();

                $http.get("/country/list").then(function(data){
                    defer.resolve(data);
                });

                return defer.promise;
            },
            getAll : function(){

                return this.countries;
            },
            getSells : function(){

                return this.sellCountries;
            },

            getOthers : function(){

                return this.otherCountries;
            },

            init : function(){

                if(window.countries){

                    this.countries = window.countries;
                    this.sellCountries = window.countries;
                    this.otherCountries = _.filter(this.countries, function(country){
                        return country.id > 2;
                    });
                }

                this.load().then(function(response){
                    factory.countries = response.data;
                });
            },
            getName : function(id){

                var country = _.find(this.countries, function(country){
                    return country.id == id;
                });

                if(country){
                    return country.name;
                }

                return "";
            }

        };

        factory.init();

        return factory;

    }])
    .factory('RegionList', ['$http', '$q','_', function($http, $q) {

        var factory = {

            allRegions : [],

            load : function(){

                var defer = $q.defer();

//                $http.get(Routing.generate("sfi_form_region_list")).then(function(data){
//                    defer.resolve(data);
//                });

                return defer.promise;
            },
            getAll : function(){

                return this.allRegions;
            },

            init : function(){

                if(window.regions){

                    this.allRegions = window.regions;
                    return;
                }


            },

            getName : function(id){

                var region = _.find(this.allRegions, function(region){
                    return region.id == id;
                });

                if(region){
                    return region.name + ", " + region.country_name;
                }

                return "";


            },

            getSingleName : function(id){

                var region = _.find(this.allRegions, function(region){
                    return region.id == id;
                });

                if(region){
                    return region.name ;
                }

                return "";


            }


        };

        factory.init();

        return factory;

    }])
    .factory('certifyBodies', function() {
        return window.certifyBodies
    })
    .factory('Message', ['$', function($) {
        return {

            success : function(message, cont, focus){

                $(cont).find('.alert').remove();

                $(cont).append(

                    '<div class="alert alert-success alert-dismissable">' +
                        '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&#10006;</button>' +
                        '<strong>Success!</strong> ' + message +
                    '</div>'
                );

                if($(cont).size()){
                    $(cont)[0].scrollIntoView();
                }

            }

        }
    }]);
;



/*
sfiFormApp.directive('icheck', ['$rootScope', '$timeout',  function($rootScope, $timeout){

    return {
        require: 'ngModel',
        link: function($scope, element, $attrs, ngModel) {



            return $timeout(function() {
                var value = $attrs['value'];

                $scope.$watch($attrs['ngModel'], function(newValue){
                    $(element).iCheck('update');
                });

                return $(element).iCheck({
                    checkboxClass: 'icheckbox_square-green icheck-hack',
                    radioClass: 'iradio_square-green icheck-hack'
                }).on('ifChanged', function(event) {

                    if ($(element).attr('type') === 'checkbox' && $attrs['ngModel']) {
                        $scope.$apply(function() {
                            return ngModel.$setViewValue(event.target.checked);
                        });
                    }

                    if ($(element).attr('type') === 'radio' && $attrs['ngModel']) {
                        return $scope.$apply(function() {
                            return ngModel.$setViewValue(value);
                        });
                    }
                });
            });
        }
    };
}]);

*/

sfiFormApp
    .config(function($popoverProvider) {
        angular.extend($popoverProvider.defaults, {
            html: true
        });
    });

sfiFormApp
    .config(function($tooltipProvider) {
        angular.extend($tooltipProvider.defaults, {
            trigger: 'hover',
            placement : 'right',
            container: 'body'

        });
    })


sfiFormApp.directive('tooltip', function(){
    return {
        restrict: 'A',
        link: function(scope, element, attrs){

            $(element).hover(function(){
                // on mouseenter
                $(element).tooltip('show');


            }, function(){
                // on mouseleave
                $(element).tooltip('hide');
            });
        }
    };
});

var test = {};

sfiFormApp.directive('datetimepicker', function(){
    return {
        restrict: 'A',
        link: function(scope, element, attrs){

            var $el = $(element);

            $el.datetimepicker({
                format: 'YYYY-MM-DD',
                pickTime: false,
                useCurrent: true
            });

            $el.on('dp.change', function(){
                $el.find('input').trigger('change');
            });
        }
    };
});



sfiFormApp.directive('popover', function(){
    return {
        restrict: 'A',
        link: function(scope, element, attrs){

            $(element).hover(function(){
                // on mouseenter
                $(element).popover('show');


            }, function(){
                // on mouseleave
                $(element).popover('hide');
            });
        }
    };
});

sfiFormApp.directive('customerror', [ '_', function(_){


    var messages = {

        url : 'Please enter a valid url',
        email : 'Please enter a valid email',
        number : 'Please enter a valid number',
        required : 'This field is required',
        min : 'Number can not be less than <%= min %>',
        max : 'Number can not be greater than <%= max %>',
        maxlength : 'Provide value with max length of <%= ngMaxlength %>',
        minlength : 'Provide value with min length of <%= ngMinlength %>',
        maxWordCount : 'Provide text not more than <%= maxWordCount %> words',
        pattern : '<%=  patternMsg %>'

    };

    var getMsgBox  = function($el){


        if($el.hasClass('icheck')){
            $el = $el.parent();
        }

        if($el.parent().hasClass('datetimepicker')){
            $el = $el.parent();
        }


        if(!$el.parent().find(".error").size()){
            $el.parent().append('<small class="error"></small>');
        }

        return $el.parent().find(".error");

        if(!$el.next('.error').size()){
            $el.after('<small class="error"></small>');
        }

        return $el.next('.error');
    }


    return {
        restrict: 'A',
        require: '^ngModel',
        link: function($scope, $el, attrs, $model){



            function validate (){

                getMsgBox($el).hide();

                for(var key in $model.$error){

                    if($model.$error[key] && messages[key]){

                        if(attrs.patternMsg){
                            key = 'pattern';
                        }

                        var message = _.template(messages[key], attrs);
                        return getMsgBox($el).text(message).show();
                    }
                }
            }

            attrs.$observe("required", validate);

            $scope.$watch(function(){
                return $model.$modelValue;
            }, validate);

            $scope.$watch(function(){
                return $model.$modelValue;
            }, validate);



            $el.keyup(validate)

        }
    };
}]);


sfiFormApp.directive('maxWordCount', function() {
    return {
        require: 'ngModel',
        link: function(scope, elm, attrs, ctrl) {

            //For DOM -> model validation
            var maxLimit = attrs.maxWordCount;
            ctrl.$parsers.unshift(function(value){

                var valid = true;

                if(value){
                    valid = value.split(' ').length <= maxLimit;
                }

                ctrl.$setValidity('maxWordCount', valid);
                return valid ? value : undefined;
            });

            //For model -> DOM validation
            ctrl.$formatters.unshift(function(value) {

                var valid = true;

                if(value){
                    valid = value.split(' ').length <= maxLimit;
                }

                ctrl.$setValidity('maxWordCount',valid);
                return value;
            });
        }
    };
});

sfiFormApp.filter('para', ['$sce', function ($sce) {
    return function (text) {
        //return $sce.trustAsHtml('<p>' + text + '</P>');
        return '<p>' + text.replace(/(?:\r\n|\r|\n)/g, '<br />'); + '</P>';
    };
}]);


/** Functions for multiple country select */

sfiFormApp.run(['$rootScope', 'Countries', 'RegionList', function($rootScope, Countries, RegionList ) {

    $rootScope.countries      = Countries.getAll();
    $rootScope.otherCountries = Countries.getOthers();
    $rootScope.sellCountries  = Countries.getSells();

    $rootScope.regions = RegionList.getAll();

    $rootScope.findCountry = function(bucket, id){

        return _.find(bucket, function(country){
            return country.id == id;
        });
    }

    $rootScope.getCountry = function(id){

        var country = $rootScope.findCountry($rootScope.countries, id);
        return  country ? country.country : "";
    }

    $rootScope.getOtherCountry = function(id){

        var country = $rootScope.findCountry($rootScope.otherCountries, id);
        return  country ? country.country : "";
    }

    $rootScope.getSellCountry = function(id){
        var country = $rootScope.findCountry($rootScope.sellCountries, id);
        return  country ? country.country : "";
    }



    $rootScope.addCountry = function(bucket, model){


        if(!(country = $rootScope.findCountry(bucket, model) )){

            if(country = $rootScope.findCountry($rootScope.countries, model)){
                bucket.push(country);
            }
        }

        return "0";
    };

    $rootScope.addOtherCountry = function(bucket, model){

        if(!(country = $rootScope.findCountry(bucket, model))){

            if(country = $rootScope.findCountry($rootScope.otherCountries, model)){
                bucket.push(country);
            }
        }

        return "0";
    };

    $rootScope.addSellCountry = function(bucket, model, msg){



        if(!(country = $rootScope.findCountry(bucket, model))){

            if(country = $rootScope.findCountry($rootScope.sellCountries, model)){
                bucket.push(country);
                //bucket.push(country.id);
            }
        }else if(msg) {
            alert(msg);
        }

        return "0";
    };


    $rootScope.delCountry = function(bucket, id){

        bucket = _.filter(bucket, function(country){
            return country.id != id;
        });

        return bucket;

    };


    $rootScope.getRegion = function(regionId){
        return _.find($rootScope.regions, function(region){
            return region.id == regionId;
        });
    }

    $rootScope.getMyCountry = function(countryId){

        return _.find($rootScope.countries, function(country){
            return country.id == countryId;
        });
    }




}]);

/** Operating country rules from CS1 data */
sfiFormApp.run(['$rootScope', '_', function($rootScope, _) {

    $rootScope.camelcase = function(str) {
        return str.replace(/(?:^\w|[A-Z]|\b\w)/g, function(letter, index) {
            return index == 0 ? letter.toLowerCase() : letter.toUpperCase();
        }).replace(/\s+/g, '');
    }

    $rootScope.hasPrimaryYards = function(){
        return $rootScope.form.cs1.hasPrimaryOperMillsYards;
    }

    $rootScope.hasPrimaryYardsUsa = function(){

        return $rootScope.hasPrimaryYards () && $rootScope.form.cs1.hasPrimaryOperMillsYardsInUSA;
    }

    $rootScope.hasPrimaryYardsCa = function(){

        return $rootScope.hasPrimaryYards () && $rootScope.form.cs1.hasPrimaryOperMillsYardsInCA;
    }

    $rootScope.hasPrimaryYardsOther = function(){

        return $rootScope.hasPrimaryYards () && $rootScope.form.cs1.hasPrimaryOperMillsYardsInOther;
    }

    $rootScope.ownsForestLands = function(){
        return $rootScope.form.cs1.ownsMngLands;
    }

    $rootScope.ownsForestLandsUsa = function(){
        return $rootScope.ownsForestLands() && $rootScope.form.cs1.ownsMngLandsInUSA;
    }

    $rootScope.ownsForestLandsCa = function(){
        return $rootScope.ownsForestLands() && $rootScope.form.cs1.ownsMngLandsInCA;
    }

    $rootScope.ownsForestLandsOther = function(){
        return $rootScope.ownsForestLands() && $rootScope.form.cs1.ownsMngLandsInOther;
    }


    $rootScope.operateInUsa = function(){

        return $rootScope.hasPrimaryYardsUsa() || $rootScope.ownsForestLandsUsa();
    }

    $rootScope.operateInCa = function(){
        return $rootScope.hasPrimaryYardsCa() || $rootScope.ownsForestLandsCa();
    }

    $rootScope.operateInOthers = function(){
        return $rootScope.hasPrimaryYardsOther() || $rootScope.ownsForestLandsOther();
    }


//    $rootScope.isFieldsEnabled = function(){
//        return $rootScope.form.cs1.ownsMngLands;
//    }


    $rootScope.isSelected = function(model, val){
        return _.indexOf(model, val) > -1;
    }


    $rootScope.addBucket = function(bucket, model, list){


        var item = _.find(bucket, function(item){
            return item.id == model;
        });

        if(item) return "0";

        var item = _.find(list, function(item){
            return item.id == model;
        });

        if(item) bucket.push(item);

        return "0"
    }


    $rootScope.deleteBucket = function(id, bucket){

        return _.filter(bucket, function(item){
            return item.id != id;
        });
    }

}]);

sfiFormApp.run(['$rootScope', '$http', function($rootScope, $http) {
    $rootScope.updateFormMeta = function(){

        var url = "/updateDate/" + $rootScope.form.cs10.id;
        $http
            .get(url)
            .then(function(response){

                if(response.data){
                    $rootScope.form.cs10.updatedAt = new Date(response.data.updateDate);
                }

            });
    }

    $rootScope.updateCs1Error = function(){


        var url = "/form/errors/" + $rootScope.form.cs10.id;
        $http
            .get(url)
            .then(function(response){

                if(response.data){

                    $rootScope.form.cs2.errors = response.data.cs2;
                    $rootScope.form.cs4.errors = response.data.cs4;;
                    $rootScope.form.cs6.errors = response.data.cs6;;
                    $rootScope.setProgress();

                    $//rootScope.form.cs10.updatedAt = new Date(response.data.updateDate);
                }

            });

    }

    $rootScope.download = function(a, b){
        window.location.href = "/sfiPpForm/sfi/"+  a + "/" + b;
    }

}]);
