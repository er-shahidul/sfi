var $el;
sfiFormApp
    .controller('FormFiberSourcingStandardCtrl',
        ['$rootScope', '$scope', '$state', '$http', '_','Message', '$modal', '$upload', '$',
            function ($rootScope, $scope, $state, $http, _, Message, $modal, $upload, $) {


    $scope.cs10 = angular.copy($rootScope.form.cs10);

    $scope.hasStory = {};
    _.each($scope.cs10.stories, function(story){
            $scope.hasStory[story.index] = true;
    });


    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs10Form;
    }

    $scope.saveForm = function (go) {

        $http
            .put("/form/cs10", $scope.cs10)
            .then(function(response){

                if(response.data){

                    $scope.cs10Form.$setPristine();
                    $rootScope.form.cs10 = response.data;
                    $scope.cs10 = angular.copy($rootScope.form.cs10);
                    Message.success('Section successfully saved', '.msg-cont');

                    $rootScope.updateFormMeta();
                    $rootScope.setProgress();
                }
                if(go){
                    $rootScope.goStep("cs8");
                }
            });
    };

        var shareStoryModal = $modal({
            scope: $scope,
            template: '/assets/partials/form/share-story-modal.html',
            show: false
        });

        $scope.isStoryDirty = function(){

            if($scope.story){
                return $scope.story.shareOrgName || $scope.story.shareNoUse || $scope.story.shareUseAggregate ;
            }

            return false;
        }


        $scope.shareHistory = function(index, key, $event){

            var el = $event.currentTarget;
            var text = $(el).parent().text();
            var label = text.replace('Share Your Story', '').replace('Edit Your Story', '').trim();

            var story = _.find($scope.cs10.stories, function(story){
                return story.index == index;
            });

            if(!story){

                story = {
                    index : index,
                    key   : key
                }
            }

            story.label = label;

            $scope.story = angular.copy(story);
            $scope.story.myFiles = [];

            shareStoryModal.$promise.then(shareStoryModal.show);

            return false;
        }

        $scope.cancelHistory = function(){
            shareStoryModal.$promise.then(shareStoryModal.hide);
            $scope.story = null;
        }

        $scope.saveHistory = function(){


            if(!$scope.isStoryDirty()){
                return false;
            }

            if(shareStoryModal.$scope.storyForm.$valid){
                shareStoryModal.$promise.then(shareStoryModal.hide);
            }

            var index = $scope.story.index;

            var story = _.find($scope.cs10.stories, function(story){
                return story.index == index;
            });

            if(!story){
                story = {
                    index : $scope.story.index,
                    key   : $scope.story.key
                }
                $scope.cs10.stories.push(story);
            }

            story.firstName     = $scope.story.firstName;
            story.lastName      = $scope.story.lastName;
            story.email         = $scope.story.email;
            story.description   = $scope.story.description;
            story.shareOrgName  = $scope.story.shareOrgName || false;
            story.shareNoUse    = $scope.story.shareNoUse || false;
            story.shareUseAggregate = $scope.story.shareUseAggregate || false;
            //story.supportDocs = $scope.story.supportDocs;

            story.originalDocumentName = $scope.story.originalDocumentName;
            story.uniqueDocumentName = $scope.story.uniqueDocumentName;

            $scope.hasStory[index] = true;
            $scope.story = null;
        }

        $scope.story = {};
        $scope.upload = {};
        $scope.story.myFiles = [];

        $scope.fileSelected = function() {

            for (var i = 0; i < $scope.story.myFiles.length; i++) {
                var file = $scope.story.myFiles[i];

                $scope.upload = $upload.upload({
                    url: '/files/upload/sfi',
                    method: 'POST',
                    data: $scope.cs10,
                    file: file
                }).progress(function(evt) {
                        console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {

                    $scope.story.originalDocumentName = data.originalDocumentName;
                    $scope.story.uniqueDocumentName = data.uniqueDocumentName;


                    //console.log(data, status, headers, config)
                    //$scope.project.supportDocs.push(data);
                });

            }
        }



}]);
