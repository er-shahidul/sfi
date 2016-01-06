var cs2 = null;
sfiSicApp
    .controller('SicCs2FormCtrl',
        ['$rootScope', '$scope', '$http', 'Message', '_', '$', '$popover',
            function ($rootScope , $scope, $http, Message, _, $, $popover){

        $scope.cs2 = angular.copy($rootScope.form.cs2);
        cs2 = $scope;

        $scope.event = {}
        $scope.cs2.sicNeighborEvents = $scope.cs2.sicNeighborEvents || [];

        $scope.addEvent = function(){

            if($scope.eventForm.$valid){
                $scope.cs2.sicNeighborEvents.push($scope.event);
            }

            $scope.event = {}
        }




        $scope.currencyPop = {}

        $scope.setCurrency = function(event, key){

            var element = event.target;
            if(!$(element).hasClass('currency-brn')){
                return;
            }

            $scope.popover.key = key;
            $scope.popover.currency = $scope.cs2[key] || 1;


            if(!element.popover){

                element.popover = $popover($(element), {
                    placement: 'bottom',
                    contentTemplate: 'calendar-item-popover.html',
                    scope : $scope
                });

                return element.popover.$promise.then(element.popover.show)

            }

            if(element.popover.isShown){
                element.popover.hide();
                element.popover.isShown = false;
            }
        }


        $scope.setCurrency = function(){

            var key = $scope.popover.key;
            $scope.cs2[key] = $scope.popover.currency;

        }

        $scope.saveForm = function(go){

            if($scope.cs2Form.$valid){

                $http
                    .put("/sicForm/cs2", $scope.cs2)
                    .then(function(response){

                        if(response.data){
                            $scope.cs2Form.$setPristine();
                            $rootScope.form.cs2 = response.data;
                            Message.success('Section successfully saved', '.msg-cont', true);
                        }

                        if(go) $rootScope.goStep("cs2");
                    });
            }
        }


    }]);
