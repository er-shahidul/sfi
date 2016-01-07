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
                    }


                    if(go){
                        $rootScope.goStep("cs7")
                    }

                });
        }

        $scope.fraItems = {
            1  : 'Alabama Professional Logging Manager',
            2  : 'Arkansas Logger Education and Training Program',
            3  : 'LANC Certified Logger Program',
            4  : 'California Logger Training and Education Program (ACL)',
            5  : 'Qualified Logging Professional Training Requirements',
            6  : 'Central Rockies Sustainable Forestry Education Program',
            7  : 'Florida Master Logger',
            8  : 'Georgia Master Timber Harvester',
            9  : 'Idaho Pro-Logger',
            10 : 'Indiana SFI Logger Training',
            11 : 'Kentucky Master Logger Program',
            12 : 'Louisiana SFI Education Program',
            13 : 'Maine Certified Logging Professional Program',
            14 : 'Maryland/Delaware Master Logger Program',
            15 : 'Michigan SFI-IC Sustainable Forestry Education Program',
            16 : 'Minnesota Logger Education Program',
            17 : 'Mississippi Professional Logging Manager Program',
            18 : 'Missouri Professional Timber Harvester Program',
            19 : 'Montana Accredited Logging Professional Program',
            20 : 'New Hampshire Professional Loggers Program',
            21 : 'New Mexico Forest Worker Safety Certification Training Program',
            22 : 'New York Trained Logger Certification Program',
            23 : 'North Carolina ProLogger',
            24 : 'Ohio Master Logger Program',
            25 : 'Oregon Professional Logger Program',
            26 : 'PA SFI Professional Timber Harvester Training Program',
            27 : 'Quebec Formation entrepreneur accredite',
            28 : 'South Carolina Timber Operations Professional Program',
            29 : 'Tennessee Master Logger Program',
            30 : 'Texas Pro Logger and Continuing Education Program',
            31 : 'Virginia SHARP Logger',
            32 : 'Washington Master Logger Program',
            33 : 'West Virginia Logger Training and Education',
            34 : 'Western Canada Basic Logger Training Requirements',
            35 : 'Wisconsin Logger Training and Education Program',
        }



        $scope.setForms = function(){
            $rootScope.$form = $scope.cs6Form;
        }
    }]);
