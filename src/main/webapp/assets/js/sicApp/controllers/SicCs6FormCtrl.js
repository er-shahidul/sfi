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
                        $rootScope.updateFormMeta();
                    }


                    if(go){
                        $rootScope.goStep("cs7")
                    }

                });
        }

        $scope.fraItems = [
             { id: 1 , value : 'Alabama Professional Logging Manager'},
             { id: 2 , value : 'Arkansas Logger Education and Training Program'},
             { id: 3 , value : 'California Logger Training and Education Program (ACL)'},
             { id: 4 , value : 'Central Rockies Sustainable Forestry Education Program'},
             { id: 5 , value : 'Florida Master Logger'},
             { id: 6 , value : 'Georgia Master Timber Harvester'},
             { id: 7 , value : 'Idaho Pro-Logger'},
             { id: 8 , value: 'Indiana SFI Logger Training'},
             { id: 9 , value: 'Kentucky Master Logger Program'},
             { id: 10 , value: 'LANC Certified Logger Program'},
             { id: 11 , value: 'Louisiana SFI Education Program'},
             { id: 12 , value: 'Maine Certified Logging Professional Program'},
             { id: 13 , value: 'Maryland/Delaware Master Logger Program'},
             { id: 14 , value: 'Michigan SFI-IC Sustainable Forestry Education Program'},
             { id: 15 , value: 'Minnesota Logger Education Program'},
             { id: 16 , value: 'Mississippi Professional Logging Manager Program'},
             { id: 17 , value: 'Missouri Professional Timber Harvester Program'},
             { id: 18 , value: 'Montana Accredited Logging Professional Program'},
             { id: 19 , value: 'New Hampshire Professional Loggers Program'},
             { id: 20 , value: 'New Mexico Forest Worker Safety Certification Training Program'},
             { id: 21 , value: 'New York Trained Logger Certification Program'},
             { id: 22 , value: 'North Carolina ProLogger'},
             { id: 23 , value: 'Ohio Master Logger Program'},
             { id: 24 , value: 'Oregon Professional Logger Program'},
             { id: 25 , value: 'PA SFI Professional Timber Harvester Training Program'},
             { id: 26 , value: 'Qualified Logging Professional Training Requirements'},
             { id: 27 , value: 'Quebec Formation entrepreneur accredite'},
             { id: 28 , value: 'South Carolina Timber Operations Professional Program'},
             { id: 29 , value: 'Tennessee Master Logger Program'},
             { id: 30 , value: 'Texas Pro Logger and Continuing Education Program'},
             { id: 31 , value: 'Virginia SHARP Logger'},
             { id: 32 , value: 'Washington Master Logger Program'},
             { id: 33 , value: 'West Virginia Logger Training and Education'},
             { id: 34 , value: 'Western Canada Basic Logger Training Requirements'},
             { id: 35 , value: 'Wisconsin Logger Training and Education Program'},
             { id: 36 , value: 'Other'}
        ];



        $scope.setForms = function(){
            $rootScope.$form = $scope.cs6Form;
        }
    }]);
