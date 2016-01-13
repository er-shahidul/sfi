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

        $scope.cs2.supportCurrency   = $scope.cs2.supportCurrency || 1;
        $scope.cs2.committeeCurrency = $scope.cs2.committeeCurrency || 1;
        $scope.cs2.directCurrency    = $scope.cs2.directCurrency || 1;


        $scope.getTotal = function(){

            var total = 0;

            for(var i = 1; i <= 13; i++){

                total += $scope.cs2["directSpending" + i];

            }

            return total;

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
