sfiFormApp
    .controller('FormForestManagementStandardCtrl', ['$rootScope', '$scope', '$state', '$http', '_', 'Message', '$modal', '$upload', function ($rootScope, $scope, $state, $http, _, Message, $modal, $upload) {

    /** CS9  represents front step 7 */

    $scope.cs9 = angular.copy($rootScope.form.cs9);
    cs9 = $scope;


    $scope.hasRegionData = function(){
        return $scope.regionId || $scope.regionArea;
    }

    $scope.saveRegionArea = function(){

        if($scope.hasRegionData() && $scope.forestlandForm.$valid){

            var forestlandArea = {
                region : $rootScope.getRegion($scope.regionId),
                area   : $scope.regionArea

            };

            $scope.cs9.forestlandAreas.push(forestlandArea);
        }
    }

    $scope.isRequired = function(){
        return $rootScope.form.cs1.hasOperationsYards;
    }

    $scope.setForms = function(){
        $rootScope.$form = $scope.cs9Form;
    }

    $scope.saveForm = function (go) {

        $http
            .put("/form/cs9", $scope.cs9)
            .then(function(response){

                if(response.data){

                    //$rootScope.form = response.data;
                    //$scope.cs9 = angular.copy($rootScope.form.cs9);
                    //$scope.errors = $scope.cs9.errors;

                    Message.success('Section successfully saved', '.msg-cont');
                }

                if(go){
                    $rootScope.goStep("cs10")
                }

            });
    }




    var shareStoryModal = $modal({
        scope: $scope,
        template: '/assets/partials/form/share-story-modal.html',
        show: false
    });

    $scope.shareHistory = function(index, name, data){
        $scope.story = {}
        shareStoryModal.$promise.then(shareStoryModal.show);
    }

    $scope.saveHistory = function(){
        shareStoryModal.$promise.then(shareStoryModal.hide);
        console.log($scope.story);
    }

    $scope.upload = {};
    $scope.myFiles = [];

    $scope.fileSelected = function(files) {

        console.log(files);

        alert(1);
        console.log($scope.myFiles);

            for (var i = 0; i < $scope.myFiles.length; i++) {

            alert(2);

                var file = $scope.myFiles[i];

                console.log(file);

                $scope.upload = $upload.upload({
                    url: '/files/upload',
                    method: 'POST',
                    data: $scope.cs9,
                    file: file

                }).progress(function(evt) {
                        console.log('progress: ' + parseInt(100.0 * evt.loaded / evt.total) + '% file :'+ evt.config.file.name);
                }).success(function(data, status, headers, config) {
                    console.log(data, status, headers, config)
                    //$scope.project.supportDocs.push(data);
                });

            }
        }


}]);

sfiFormApp
    .controller('shareStoryModalCtrl', function ($scope, $uibModalInstance) {

        $scope.ok = function () {
            $uibModalInstance.close(true);
        };

        $scope.cancel = function () {
            $uibModalInstance.dismiss('cancel');
        };



    });
