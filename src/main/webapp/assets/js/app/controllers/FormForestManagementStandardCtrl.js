sfiFormApp
    .controller('FormForestManagementStandardCtrl', ['$rootScope', '$scope', '$state', '$http', '_', 'Message', '$modal', '$upload', function ($rootScope, $scope, $state, $http, _, Message, $modal, $upload) {

    /** CS9  represents front step 7 */

    $scope.cs9 = angular.copy($rootScope.form.cs9);

    $scope.hasStory = {};

    _.each($scope.cs9.stories, function(story){
        $scope.hasStory[story.index] = true;
    });


    $scope.cs9.stories = $scope.cs9.stories || [];

    $scope.hasRegionData = function(){
        return $scope.regionId || $scope.regionArea;
    }

    $scope.saveRegionArea = function(){

        if($scope.hasRegionData() && $scope.forestlandForm.$valid){

            var forestlandArea = {
                region : $rootScope.getRegion($scope.regionId),
                area   : $scope.regionArea

            };

            if($scope.editIndex){
                $scope.cs9.forestlandAreas[$scope.editIndex] = forestlandArea;

            }
            else if($scope.editIndex == 0){
                $scope.cs9.forestlandAreas[$scope.editIndex] = forestlandArea;

            }else{
                $scope.cs9.forestlandAreas.push(forestlandArea);

            }

            $scope.editIndex = null;
            $scope.resetRegionArea();
        }
    }

    $scope.editIndex = null;
    $scope.editRegionArea = function(index){

        $scope.editIndex = index;
        var forestlandArea = $scope.cs9.forestlandAreas[index];

        $scope.regionArea = forestlandArea.area;
        $scope.regionId = forestlandArea.region.id;

        return false;
    }

    $scope.deleteRegionArea = function(index){

        //if(confirm('Are you sure to delete this item ?')){
        //    $scope.cs9.forestlandAreas.splice(index, 1);
        //}
        $('#delete1').modal();
    }
    $scope.deleteConfirm = function(index){

        $scope.cs9.forestlandAreas.splice(index, 1);

    }

    $scope.resetRegionArea = function(){
        $scope.regionArea = null;
        $scope.regionId = 0;
    }

    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs9Form;
    }

    $scope.clearForm = function(){
        $scope.cs9 = angular.copy($rootScope.form.cs9);

        $scope.hasStory = {};
        _.each($scope.cs9.stories, function(story){
                $scope.hasStory[story.index] = true;
        });
    }


    $scope.saveForm = function (go) {

        $http
            .put("/form/cs9", $scope.cs9)
            .then(function(response){

                if(response.data){

                    $scope.cs9Form.$setPristine();
                    $rootScope.form.cs9 = response.data;
                    $scope.cs9 = angular.copy($rootScope.form.cs9);
                    $scope.errors = $rootScope.form.cs9.errors;
                    Message.success('Section successfully saved', '.msg-cont');

                    $rootScope.updateFormMeta();
                    $rootScope.setProgress();
                }

                if(go){
                    $rootScope.goStep("cs10");
                }

            });
    }

    var templatePath = $rootScope.mode == "edit" ?
            '/assets/partials/form/share-story-modal.html' :
                '/assets/partials/view/share-story-modal.html';

    var shareStoryModal = $modal({
        scope: $scope,
        template: templatePath,
        show: false
    });

    $scope.isStoryDirty = function(){

        if($scope.story){
            return $scope.story.shareKey;
        }

        return false;
    }

    $scope.shareHistory = function(index, key , $event){

        var el = $event.currentTarget;
        var text = $(el).parent().text();
        var label = text.replace('Share Your Story', '').replace('Edit Your Story', '').trim();


        var story = _.find($scope.cs9.stories, function(story){
            return story.index == index;
        });

        if(!story){
            story = {
                index : index,
                key   : key,
                shareKey : null
            }
        }

        story.label = label;

        $scope.story = angular.copy(story);

        if(story.shareOrgName){
            $scope.story.shareKey = 1;
        }

        if(story.shareNoUse){
            $scope.story.shareKey = 2;
        }

        if(story.shareUseAggregate){
            $scope.story.shareKey = 3;
        }

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

        var story = _.find($scope.cs9.stories, function(story){
            return story.index == index;
        });

        if(!story){
            story = {
                index : $scope.story.index,
                key   : $scope.story.key
            }
            $scope.cs9.stories.push(story);
        }

        story.firstName     = $scope.story.firstName;
        story.lastName      = $scope.story.lastName;
        story.email         = $scope.story.email;
        story.description   = $scope.story.description;

        story.shareOrgName  = $scope.story.shareKey == 1;
        story.shareNoUse    = $scope.story.shareKey == 2;
        story.shareUseAggregate = $scope.story.shareKey == 3;


        //story.supportDocs = $scope.story.supportDocs;

        story.originalDocumentName = $scope.story.originalDocumentName;
        story.uniqueDocumentName = $scope.story.uniqueDocumentName;

        $scope.hasStory[index] = true;
        $scope.story = null;

    }

    $scope.tempFile = {};
    $scope.story = {};
    $scope.upload = {};
    $scope.story.myFiles = [];

    $scope.fileSelected = function() {

        var type = '.pdf, .doc, .docx, .xls, .xlsx';


        for (var i = 0; i < $scope.story.myFiles.length; i++) {
            var file = $scope.story.myFiles[i];
            var isValid = true;

            var fileExt = "." + /[^.]+$/.exec(file.name);

            if(type.search(file.type) < 0 && type.search(fileExt) < 0  ){
                isValid = false;
            }

            if(!isValid) {
                return alert("File type doesn't match");
            }


            $scope.upload = $upload.upload({
                url: '/files/upload/sfi',
                method: 'POST',
                data: $scope.cs9,
                file: file
            }).progress(function(evt) {
                    //console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
            }).success(function(data, status, headers, config) {

                $scope.tempFile.originalDocumentName = data.originalDocumentName;
                $scope.tempFile.uniqueDocumentName = data.uniqueDocumentName;

                //$scope.story.originalDocumentName = data.originalDocumentName;
                //$scope.story.uniqueDocumentName = data.uniqueDocumentName;
            }).error(function(data, status, headers, config){
                alert("File upload failed, provide valid type file");
            });

        }
    }

    $scope.saveTmpFile = function(){
        $scope.story.originalDocumentName = $scope.tempFile.originalDocumentName;
        $scope.story.uniqueDocumentName = $scope.tempFile.uniqueDocumentName;
        $scope.tempFile = {};
    }



    $scope.clearConfirm = function(){
        $('#clearConfirm').modal();
    }

    $scope.clearForm = function(){
        window.location.href = "/sfiPpForm/clear/cs9/" + $scope.cs9.id;
    }

    $scope.clearCancel = function(){
    }


}]);

