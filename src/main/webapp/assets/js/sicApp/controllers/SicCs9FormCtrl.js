sfiSicApp
    .controller('SicCs9FormCtrl', ['$scope', '$rootScope', '$http', 'Message',
        function ( $scope, $rootScope, $http, Message){

        $scope.cs9 = angular.copy($rootScope.form.cs9);

        $scope.bmpReportDoc = {};
        $scope.cs9.supportDocPrinted = $scope.cs9.supportDocPrinted || {};

        $scope.cs9.supportDocLastYrPrinted = $scope.cs9.supportDocLastYrPrinted || [];
        $scope.cs9.supportDocLastYrAdvTV = $scope.cs9.supportDocLastYrAdvTV || [];
        $scope.cs9.supportDocLastYrAdvPrinted = $scope.cs9.supportDocLastYrAdvPrinted || [];
        $scope.cs9.supportDocLastYrTradeshow = $scope.cs9.supportDocLastYrTradeshow || [];
        $scope.cs9.supportDocLastYrEventSponsor = $scope.cs9.supportDocLastYrEventSponsor || [];
        $scope.cs9.supportDocLastYrSocialMedia = $scope.cs9.supportDocLastYrSocialMedia || [];
        $scope.cs9.supportDocLastYrVideo = $scope.cs9.supportDocLastYrVideo || [];
        $scope.cs9.supportDocLastYrOther = $scope.cs9.supportDocLastYrOther || [];

        $scope.cs9.supportDocCurrentYrPrinted = $scope.cs9.supportDocCurrentYrPrinted || [];
        $scope.cs9.supportDocCurrentYrAdvTV = $scope.cs9.supportDocCurrentYrAdvTV || [];
        $scope.cs9.supportDocCurrentYrAdvPrinted = $scope.cs9.supportDocCurrentYrAdvPrinted || [];
        $scope.cs9.supportDocCurrentYrTradeshow = $scope.cs9.supportDocCurrentYrTradeshow || [];
        $scope.cs9.supportDocCurrentYrEventSponsor = $scope.cs9.supportDocCurrentYrEventSponsor || [];
        $scope.cs9.supportDocCurrentYrSocialMedia = $scope.cs9.supportDocCurrentYrSocialMedia || [];
        $scope.cs9.supportDocCurrentYrVideo = $scope.cs9.supportDocCurrentYrVideo || [];
        $scope.cs9.supportDocCurrentYrOther = $scope.cs9.supportDocCurrentYrOther || [];




        $scope.saveForm = function(go){

            if($scope.cs9Form.$invalid){
                return false;
            }

            $http
                .put("/sicForm/cs9", $scope.cs9)
                .then(function(response){

                    if(response.data){

                        $scope.cs9Form.$setPristine();
                        Message.success('Section successfully saved', '.msg-cont', true);
                        $rootScope.form.cs9 = response.data;
                        $scope.errors = $rootScope.form.cs9.errors;
                        $rootScope.updateFormMeta();
                        $rootScope.setProgress();
                    }


                    if(go){
                        $rootScope.goStep("cs10")
                    }

                });
        }

    }]);