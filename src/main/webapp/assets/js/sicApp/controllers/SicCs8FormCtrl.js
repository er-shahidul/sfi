var cs8;
sfiSicApp
    .controller('SicCs8FormCtrl', ['$scope', '$rootScope', '$http', 'Message', 'standardObjects',
        function ( $scope, $rootScope, $http, Message, standardObjects){

        cs8 = $scope;

        $scope.cs8 = angular.copy($rootScope.form.cs8);
        $scope.standardObjects = standardObjects;

        $scope.project  = {}
        $scope.cs8.projects = $scope.cs8.projects || [];


        $scope.isProjectDirty = function(){

            return $scope.project.name ||
                $scope.project.organization ||
                $scope.project.contactName ||
                $scope.project.contactEmail ||
                $scope.project.description ;
        }


        $scope.projectIndex = null;

        $scope.addProject = function(){

            if($scope.projectForm.$valid){

                if($scope.projectIndex){
                    $scope.cs8.projects[$scope.projectIndex]  = angular.copy($scope.project);
                }else{
                    $scope.cs8.projects.push(angular.copy($scope.project));
                }
            }

            $scope.project = {};
        }

        $scope.editProject = function($index){
            $scope.project = angular.copy($scope.cs8.projects[$index]);
        }

        $scope.deleteProject = function($index){

            $scope.cs8.projects.splice($index, 1);
        }



        $scope.saveForm = function(go){

            $scope.addProject();

            if($scope.cs8Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs8", $scope.cs8)
                .then(function(response){

                    if(response.data){

                        $scope.cs6Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                    }


                    if(go){
                        $rootScope.goStep("cs9")
                    }

                });
        }

    }]);