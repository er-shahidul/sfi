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

        $scope.deleteNeighborEvents = function($index){

            if(confirm("Are you sure you want to delete this entry?")){
                $scope.cs2.sicNeighborEvents.splice($index, 1);
            }

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

        $scope.sicList = {
            1  : 'Alabama',
            2  : 'Alaska',
            3  : 'Arkansas',
            4  : 'California',
            5  : 'Central Canada',
            6  : 'Central Rockies',
            7  : 'Florida',
            8  : 'Georgia',
            9  : 'Idaho',
            11 : 'Kentucky',
            12 : 'Louisiana',
            13 : 'Maine',
            14 : 'Maritime',
            15 : 'Maryland/Delaware',
            16 : 'Michigan',
            17 : 'Minnesota',
            18 : 'Mississippi',
            19 : 'Montana',
            20 : 'New Hampshire',
            21 : 'New York',
            22 : 'North Carolina',
            23 : 'Ohio',
            24 : 'Oregon',
            25 : 'Pennsylvania',
            26 : 'Quebec',
            27 : 'South Carolina',
            28 : 'Tennessee',
            29 : 'Texas',
            30 : 'Vermont',
            31 : 'Virginia',
            32 : 'Washington',
            33 : 'West Virginia',
            34 : 'Western Canada',
            35 : 'Wisconsin',


        }

        $scope.whichSicText = function(index){
            console.log(index);
            return $scope.sicList[index];
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

                        if(go) $rootScope.goStep("cs3");
                    });
            }
        }


    }]);
