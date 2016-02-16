var cs8;
sfiSicApp
    .controller('SicCs8FormCtrl', ['$scope', '$rootScope', '$http', 'Message', 'standardObjects',
        function ( $scope, $rootScope, $http, Message, standardObjects){

        cs8 = $scope;

        $scope.cs8 = angular.copy($rootScope.form.cs8);
        $scope.standardObjects = standardObjects;

        $scope.project  = {}
        $scope.cs8.projects = $scope.cs8.projects || [];

//        $scope.cs8.sicContributionCurrency = $scope.cs8.sicContributionCurrency || 1;
//        $scope.cs8.projectCostCurrency = $scope.cs8.projectCostCurrency || 1;


        $scope.isProjectDirty = function(){

            return $scope.project.name ||
                $scope.project.organization ||
                $scope.project.contactName ||
                $scope.project.contactEmail ||
                $scope.project.description ;
        }


        $scope.projectIndex = null;

        $scope.addProject = function(){

            if(!$scope.isProjectDirty()){
                return false;
            }

            if($scope.projectForm.$valid){

                if($scope.projectIndex != null){
                    $scope.cs8.projects[$scope.projectIndex]  = angular.copy($scope.project);
                }else{
                    $scope.cs8.projects.push(angular.copy($scope.project));
                }

                $scope.projectIndex = null;
                $scope.project = {};
                return true;
            }

            return false;
        }

        $scope.editProject = function($index){
            $scope.projectIndex = $index;
            $scope.project = angular.copy($scope.cs8.projects[$index]);
        }

        $scope.deleteProject = function($index){

           // $scope.cs8.projects.splice($index, 1);
            $('#delete1').modal();
        }
        $scope.deleteConfirm = function($index){

            $scope.cs8.projects.splice($index, 1);
            $scope.projectIndex = null;

        }


        $scope.saveForm = function(go){

            if($scope.isProjectDirty() && !$scope.addProject()){
                return false
            }


            if($scope.cs8Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs8", $scope.cs8)
                .then(function(response){

                    if(response.data){

                        $scope.cs8Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs8 = response.data;
                        $scope.errors = $rootScope.form.cs8.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }]);