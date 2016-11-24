sfiSicApp
    .controller('SicCs1FormCtrl',
        ['$rootScope', '$scope', '$http', 'Message', '_',
            function ($rootScope , $scope, $http, Message, _){


        $scope.cs1 = angular.copy($rootScope.form.cs1);

        $scope.involvements = [  {id:1,name:'Attending'},
                                {id:2,name:'Sponsoring'},
                                {id:3,name:'Exhibiting'},
                                {id:4,name:'Speaking'}
                                ];

        $scope.guideFile = {}
        $scope.cs1.guideFiles = $scope.cs1.guideFiles || [];

        $scope.contactFile = {}
        $scope.cs1.contactFiles = $scope.cs1.contactFiles || [];

        $scope.cs1.subCommittees = $scope.cs1.subCommittees || [];
        $scope.addSubCommittee = function(){

            if($scope.cs1Form.subCommitteeForm.$valid){
                $scope.cs1.subCommittees.push({});
            }
        }

        $scope.cs1.meetingList = $scope.cs1.meetingList || [];
        $scope.addMeeting = function(){

            if($scope.cs1Form.meetingListForm.$valid){
                $scope.cs1.meetingList.push({});
            }
        }

        $scope.cs1.participatingMeetingList = $scope.cs1.participatingMeetingList || [];
        angular.forEach($scope.cs1.participatingMeetingList, function(value, index) {
            if(value.involvement){
                /*value.involvement = [];*/
                value.involvement= JSON.parse(value.involvement);

            }else{
                value.involvement = [];
            }

        });

        $scope.addParticipatingMeeting = function(){

            if($scope.cs1Form.participatingMeetingForm.$valid){
                $scope.cs1.participatingMeetingList.push({involvement:[]});
            }
        }
        $scope.removeFromList = function(index,list){

            list.splice(index,1);
        }


        $scope.init = function(){
            $scope.cs1.subCommittees.length || $scope.addSubCommittee();
            $scope.cs1.meetingList.length || $scope.addMeeting();
            $scope.cs1.participatingMeetingList.length || $scope.addParticipatingMeeting();
        }


        $scope.setForms = function(){
            $rootScope.$form = $scope.cs1Form;
        }

        $scope.saveForm = function(go){

            if($scope.cs1Form.$valid){

                var data = angular.copy($scope.cs1);
                angular.forEach(data.participatingMeetingList, function(value, index) {
                    value.involvement= JSON.stringify(value.involvement);
                });

                $http
                    .put("/sicForm/cs1", data)
                    .then(function(response){

                        if(response.data){
                            angular.forEach(response.data.participatingMeetingList, function(value, index) {
                                if(value.involvement){
                                    value.involvement= JSON.parse(value.involvement);
                                }
                            });
                            $scope.cs1Form.$setPristine();
                            $rootScope.form.cs1 = response.data;

                            $scope.errors = $rootScope.form.cs1.errors;
                            Message.success('Section successfully saved', '.msg-cont', true);

                            $rootScope.updateFormMeta();
                            $rootScope.setProgress();
                        }

                        if(go) $rootScope.goStep("cs2");
                    }, function (err) {
                        console.error(err);

                    });
            }else{
                console.log('invalid');
            }
        }



    }]);
