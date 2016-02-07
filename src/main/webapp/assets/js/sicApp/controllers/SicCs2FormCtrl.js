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

        $scope.deleteNeighborEvents = function(index){
            //alert(1);
            console.log(index);
            if(confirm("Are you sure you want to delete this entry?")){
                $scope.cs2.sicNeighborEvents.splice(index, 1);
            }

        }

        $scope.cs2.supportCurrency   = $scope.cs2.supportCurrency || 1;
        $scope.cs2.committeeCurrency = $scope.cs2.committeeCurrency || 1;
        $scope.cs2.directCurrency    = $scope.cs2.directCurrency || 1;


        $scope.cs2.spentByYourCommittee = $scope.cs2.spentByYourCommittee || 0;

        $scope.getTotal = function(){

            var total = 0;

            for(var i = 1; i <= 13; i++){
                total += $scope.cs2["directSpending" + i];
            }

            return total;
        }

        $scope.sicList = [
            { id:1 , value : 'Alabama'},
            { id:2 , value : 'Alaska'},
            { id:3 , value : 'Arkansas'},
            { id:4 , value : 'California'},
            { id:5 , value : 'Central Canada'},
            { id:6 , value : 'Central Rockies'},
            { id:7 , value : 'Florida'},
            { id:8 , value : 'Georgia'},
            { id:9 , value : 'Idaho'},
            { id:11 , value: 'Kentucky'},
            { id:12 , value: 'Louisiana'},
            { id:13 , value: 'Maine'},
            { id:14 , value: 'Maritime'},
            { id:15 , value: 'Maryland/Delaware'},
            { id:16 , value: 'Michigan'},
            { id:17 , value: 'Minnesota'},
            { id:18 , value: 'Mississippi'},
            { id:19 , value: 'Montana'},
            { id:20 , value: 'New Hampshire'},
            { id:21 , value: 'New York'},
            { id:22 , value: 'North Carolina'},
            { id:23 , value: 'Ohio'},
            { id:24 , value: 'Oregon'},
            { id:25 , value: 'Pennsylvania'},
            { id:26 , value: 'Quebec'},
            { id:27 , value: 'South Carolina'},
            { id:28 , value: 'Tennessee'},
            { id:29 , value: 'Texas'},
            { id:30 , value: 'Vermont'},
            { id:31 , value: 'Virginia'},
            { id:32 , value: 'Washington'},
            { id:33 , value: 'West Virginia'},
            { id:34 , value: 'Western Canada'},
            { id:35 , value: 'Wisconsin'}

        ];



        $scope.whichSicText = function(index){
            console.log(index);
            return $scope.sicList[index].value;
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
                            $rootScope.updateFormMeta();
                        }

                        if(go) $rootScope.goStep("cs3");
                    });
            }
        }

        $scope.getTotal


    }]);
