sfiSicApp
    .controller('SicCs1FormCtrl',
        ['$rootScope', '$scope', '$http', 'Message', '$upload', '_',
            function ($rootScope , $scope, $http, Message, $upload, _){


        $scope.cs1 = angular.copy($rootScope.form.cs1);

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
        $scope.addParticipatingMeeting = function(){

            if($scope.cs1Form.participatingMeetingForm.$valid){
                $scope.cs1.participatingMeetingList.push({});
            }
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

                $http
                    .put("/sicForm/cs1", $scope.cs1)
                    .then(function(response){

                        if(response.data){
                            $scope.cs1Form.$setPristine();
                            $rootScope.form.cs1 = response.data;
                            Message.success('Section successfully saved', '.msg-cont', true);
                        }

                        if(go) $rootScope.goStep("cs2");
                    });
            }
        }

        $scope.uploadFile = function(model, bucket) {

            _.each(model, function(file){

                $scope.upload = $upload.upload({
                    url: '/files/upload/sic',
                    method: 'POST',
                    data: {},
                    file: file

                }).progress(function(evt) {
                    console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {

                    bucket.originalDocumentName  = data.originalName;
                    bucket.uniqueDocumentName    = data.uniqueName;

                });

            });

        }

        $scope.saveUploadedFile = function(model, bucket){

            if(model.originalDocumentName){
                bucket.push(model);
            }

            model = {};
        }

    }]);
