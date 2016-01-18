var sfiSicApp = angular.module('sfiSicApp',
    ['ui.router', 'checklist-model',  'ngSanitize', 'mgcrea.ngStrap', 'angularFileUpload']);


sfiSicApp.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){

    $urlRouterProvider.otherwise("/step1");

    $stateProvider
        .state('cs1', {
            url : "/step1",
            views: {
                editContainer : {

                    templateUrl : '/assets/partials/sicForm/edit/step1.html',
                    controller  : 'SicCs1FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step1.html',
                    controller  : 'SicCs1FormCtrl'
                }
            }
        })
        .state('cs2', {
            url : "/step2",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step2.html',
                    controller  : 'SicCs2FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step2.html',
                    controller  : 'SicCs2FormCtrl'
                }
            }
        })
        .state('cs3', {
            url : "/step3",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step3.html',
                    controller  : 'SicCs3FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step3.html',
                    controller  : 'SicCs3FormCtrl'
                }
            }
        })
        .state('cs4', {
            url : "/step4",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step4.html',
                    controller  : 'SicCs4FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step4.html',
                    controller  : 'SicCs4FormCtrl'
                }
            }
        })
        .state('cs5', {
            url : "/step5",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step5.html',
                    controller  : 'SicCs5FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step5.html',
                    controller  : 'SicCs5FormCtrl'
                }
            }
        })

        .state('cs6', {
            url : "/step6",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step6.html',
                    controller  : 'SicCs6FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step6.html',
                    controller  : 'SicCs6FormCtrl'
                }
            }
        })
        .state('cs7', {
            url : "/step7",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step7.html',
                    controller  : 'SicCs7FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step7.html',
                    controller  : 'SicCs7FormCtrl'
                }
            }
        })
        .state('cs8', {
            url : "/step8",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step8.html',
                    controller  : 'SicCs8FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step8.html',
                    controller  : 'SicCs8FormCtrl'
                }
            }
        })

        .state('cs9', {
            url : "/step9",
            views: {
                editContainer : {
                    templateUrl : '/assets/partials/sicForm/edit/step9.html',
                    controller  : 'SicCs9FormCtrl'
                },
                viewContainer : {
                    templateUrl : '/assets/partials/sicForm/view/step9.html',
                    controller  : 'SicCs9FormCtrl'
                }
            }
        })
        .state('cs10', {
                url : "/step10",
                views: {
                    editContainer : {
                        templateUrl : '/assets/partials/sicForm/edit/step10.html',
                        controller  : 'SicCs10FormCtrl'
                    },
                    viewContainer : {
                        templateUrl : '/assets/partials/sicForm/view/step10.html',
                        controller  : 'SicCs10FormCtrl'
                    }
                }
        })
        /*
        .state('print-all', {
            url : "/print-all",
            views: {
                viewContainer : {
                    template  : Templates.ViewAllSectionView,
                    controller: function($rootScope) {

                    }
                }
            }
        }); */
}]);



sfiSicApp
    .factory('_', function() {
        return window._;
    })
    .factory('$', function() {
        return window.$;
    })
    .factory('standardObjects', function() {
        return window.standardObjects;
    })
    .factory('Countries', ['$http', '$q','_', function($http, $q) {

        var factory = {

            countries : [],
            sellCountries : [],
            otherCountries : [],

            load : function(){

                var defer = $q.defer();

                $http.get("/country/list").then(function(data){

                    console.log(data);
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
                    this.otherCountries = window.countries;

                    //this.sellCountries = window.sellCountries;
                    //this.otherCountries = window.otherCountries;

                    return;
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
                        '<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>' +
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
sfiSicApp.directive('icheck', ['$rootScope', '$timeout',  function($rootScope, $timeout){

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

sfiSicApp
    .config(function($popoverProvider) {
        angular.extend($popoverProvider.defaults, {
            html: true
        });
    });

sfiSicApp
    .config(function($tooltipProvider) {
        angular.extend($tooltipProvider.defaults, {
            trigger: 'hover',
            placement : 'right',
            container: 'body'

        });
    })


sfiSicApp.directive('tooltip', function(){
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

sfiSicApp.directive('datetimepicker', function(){
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



sfiSicApp.directive('popover', function(){
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

sfiSicApp.directive('customerror', [ '_', function(_){


    var messages = {

        url : 'Please enter a valid url',
        email : 'Please enter a valid email',
        number : 'Please enter a valid number',
        required : 'This field is required',
        min : 'Number can not be less than <%= min %>',
        max : 'Number can not be greater than <%= max %>',
        maxlength : 'Please enter a max length of <%= ngMaxlength %>',
        minlength : 'Please enter a max length of <%= ngMinlength %>',
        maxWordCount : 'Please enter text not more than <%= maxWordCount %> words',
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



            //$el.keyup(validate)

        }
    };
}]);


sfiSicApp.directive('maxWordCount', function() {
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

sfiSicApp.filter('para', ['$sce', function ($sce) {
    return function (text) {
        //return $sce.trustAsHtml('<p>' + text + '</P>');
        return '<p>' + text.replace(/(?:\r\n|\r|\n)/g, '<br />'); + '</P>';
    };
}]);


/** Functions for multiple country select */

sfiSicApp.run(['$rootScope', 'Countries', 'RegionList', function($rootScope, Countries, RegionList ) {

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

    $rootScope.addSellCountry = function(bucket, model){

        if(!(country = $rootScope.findCountry(bucket, model))){

            if(country = $rootScope.findCountry($rootScope.sellCountries, model)){
                bucket.push(country);
                //bucket.push(country.id);
            }
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
sfiSicApp.run(['$rootScope', '_', function($rootScope, _) {

    $rootScope.camelcase = function(str) {
        return str.replace(/(?:^\w|[A-Z]|\b\w)/g, function(letter, index) {
            return index == 0 ? letter.toLowerCase() : letter.toUpperCase();
        }).replace(/\s+/g, '');
    }



    $rootScope.isFieldsEnabled = function(){
        //return true;
        return $rootScope.form.cs1.ownsMngLands;
    }

    $rootScope.operateInUsa = function(){

        //return true;
        return $rootScope.isFieldsEnabled () && $rootScope.form.cs1.ownsMngLandsInUSA;
    }

    $rootScope.operateInCa = function(){

        //return true;
        return $rootScope.isFieldsEnabled () && $rootScope.form.cs1.ownsMngLandsInCA;
    }

    $rootScope.operateInOthers = function(){
        //return true;
        return $rootScope.isFieldsEnabled () &&  $rootScope.form.cs1.ownsMngLandsInOther;
    }

    $rootScope.isSelected = function(model, val){
        return _.indexOf(model, val) > -1;
    }


    $rootScope.addBucket = function(bucket, model, list){

        console.log(bucket, model, list);

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
            return item.id == id;
        });
    }


    $rootScope.deleteByIndex = function(index, bucket){
        bucket.splice(index, 1);
    }




}]);

sfiSicApp.run(['$rootScope', '$upload', '_', function($rootScope, $upload, _) {

        $rootScope.uploadFile = function(model, bucket) {

            _.each(model, function(file){

                $rootScope.upload = $upload.upload({
                    url: '/files/upload/sic',
                    method: 'POST',
                    data: {},
                    file: file

                }).progress(function(evt) {
                    console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {

                    bucket.originalDocumentName  = data.originalDocumentName;
                    bucket.uniqueDocumentName    = data.uniqueDocumentName;

                });

            });

        }

        $rootScope.saveUploadedFile = function(model, bucket, singleMode){

            if(model.originalDocumentName){

                if(singleMode){

                    bucket.originalDocumentName = model.originalDocumentName;
                    bucket.uniqueDocumentName   = model.uniqueDocumentName;
                }else{
                    bucket.push(model);
                }

            }
                console.log(model, bucket, singleMode);
            return {};
        }



        var popSettings = {
            title       : '',
            html        : true,
            content     : '<div class="form-group"><input type="radio" class="icheck" value="1" name="test" data-name="USD"><label class="checkboxLabel">USD</label>&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" class="icheck" value="2" name="test" data-name="CAD"><label class="checkboxLabel">CAD</label></div></div>',
            placement   : 'bottom',
            trigger     : 'manual'
        }

        $rootScope.setCurrency = function(key, bucket){

            var $el  = $("#" + key);
            var value = bucket[key];

            function getOptions($el){
                return $el.data('bs.popover').$tip.find('input');
            }

            function setValue ($el, value){
                getOptions($el).filter('[value=' + value + ']').prop('checked', true);
            }

            function getValue($el){
                return getOptions($el).filter(':checked').val();
            }


            if($el.data('bs.popover')){
                $el.popover('toggle');
            }else{

                $el.popover(popSettings);
                $el.popover('show');

                $el.on('shown.bs.popover', function(){

                    getOptions($el).change(function(){
                        bucket[key] = 1 * getValue($el)
                        $el.popover('hide');
                        $rootScope.$digest();
                    });
                });
            }

            setValue($el, value);
        }

        $rootScope.gerCurrency = function(val){
            return (val == 1) ? "USD" : "CAD";
        }

        $rootScope.getOtherValue = function(key, bucket){

            var $el   = $("#" + key);
            var value = bucket[key];

            if(!$el.is(":checked")){
                $el.data('bs.popover') && $el.popover('hide');
                return;
            }

            function $find(selector){
                return $el.data('bs.popover').$tip.find(selector);
            }


            if($el.data('bs.popover')){
                $el.popover('show');
            }else{

                var content = '<div style="width:300px;">'+
                    '<textarea class="form-control"></textarea>' +
                    '<div class="col-sm-6 specialpadding alignleft"><button type="button" class="btn btn-cancel">Cancel</button></div>'+
                    '<div class="col-sm-6 specialpadding alignright"><button type="button" class="btn btn-success">Ok</button> </div>' +
                    '</div>';

                $el.popover({
                    trigger   : 'manual',
                    content   : content,
                    html      : true,
                    placement : 'bottom'
                });

                $el.popover('show');

                $el.on('shown.bs.popover', function(){

                    $find(".btn-success")
                       .click(function(){

                            bucket[key] = $find("textarea").val();
                            $el.popover('hide');
                            $rootScope.$digest();
                       });
                });
            }

            $find("textarea").val(value);
        }

}]);
