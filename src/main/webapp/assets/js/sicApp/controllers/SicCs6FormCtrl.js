var cs6;
sfiSicApp
    .controller('SicCs6FormCtrl', ['$scope', '$rootScope', '$http', 'Message', function ( $scope, $rootScope, $http, Message){

        $scope.cs6 = angular.copy($rootScope.form.cs6);
        $scope.cs6.trainingPrograms =  $scope.cs6.trainingPrograms || [];

        $scope.addFra = function(index){
            $scope.cs6.trainingPrograms.push(1 * index) ;
            $scope.cs6.trainingPrograms = _.unique($scope.cs6.trainingPrograms);
            return "0";
        }

        $scope.saveForm = function(go){

            if($scope.cs6Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs6", $scope.cs6)
                .then(function(response){

                    if(response.data){

                        $scope.cs6Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs6 = response.data;
                        $scope.errors = $rootScope.form.cs6.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs7")
                    }

                });
        }

        $scope.fraItems = [
             { id: 1 , value : 'Alabama Professional Logging Manager', order:1 },
             { id: 2 , value : 'Arkansas Logger Education and Training Program', order:2 },
             { id: 3 , value : 'California Logger Training and Education Program (ACL)', order:3 },
             { id: 4 , value : 'Central Rockies Sustainable Forestry Education Program', order:4 },
             { id: 5 , value : 'Florida Master Logger', order:5 },
             { id: 6 , value : 'Georgia Master Timber Harvester', order:6 },
             { id: 7 , value : 'Idaho Pro-Logger', order:7 },
             { id: 8 , value: 'Indiana SFI Logger Training', order:8 },
             { id: 9 , value: 'Kentucky Master Logger Program', order:9 },
             { id: 10 , value: 'LANC Certified Logger Program', order:10},
             { id: 11 , value: 'Louisiana SFI Education Program', order:11},
             { id: 12 , value: 'Maine Certified Logging Professional Program', order:12},
             { id: 13 , value: 'Maryland/Delaware Master Logger Program', order:13},
             { id: 14 , value: 'Michigan SFI-IC Sustainable Forestry Education Program', order:14},
             { id: 15 , value: 'Minnesota Logger Education Program', order:15},
             { id: 16 , value: 'Mississippi Professional Logging Manager Program', order:16},
             { id: 17 , value: 'Missouri Professional Timber Harvester Program', order:17},
             { id: 18 , value: 'Montana Accredited Logging Professional Program', order:18},
             { id: 19 , value: 'New Hampshire Professional Loggers Program', order:19},
             { id: 20 , value: 'New Mexico Forest Worker Safety Certification Training Program', order:20},
             { id: 21 , value: 'New York Trained Logger Certification Program', order:21},
             { id: 22 , value: 'North Carolina ProLogger', order:22},
             { id: 23 , value: 'Ohio Master Logger Program', order:23},
             { id: 24 , value: 'Oregon Professional Logger Program', order:24},
             { id: 25 , value: 'PA SFI Professional Timber Harvester Training Program', order:25},
             { id: 26 , value: 'Qualified Logging Professional Training Requirements', order:26},
             { id: 27 , value: 'Quebec Formation entrepreneur accredite', order:27},
             { id: 28 , value: 'South Carolina Timber Operations Professional Program', order:28},
             { id: 29 , value: 'Tennessee Master Logger Program', order:29},
             { id: 30 , value: 'Texas Pro Logger and Continuing Education Program', order:30},
                 { id: 31 , value: 'Virginia SHARP Logger', order:32},
                 { id: 32 , value: 'Washington Master Logger Program', order:33},
                 { id: 33 , value: 'West Virginia Logger Training and Education', order:34},
                 { id: 34 , value: 'Western Canada Basic Logger Training Requirements', order:35},
                 { id: 35 , value: 'Wisconsin Logger Training and Education Program', order:36},
                 { id: 36 , value: 'Other', order:37}, 
                 { id: 37 , value: 'Vermont LEAP Program', order:31}
        ];



        $scope.setForms = function(){
            $rootScope.$form = $scope.cs6Form;
        }
    }]);
