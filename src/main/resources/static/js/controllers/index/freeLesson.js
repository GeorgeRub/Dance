angular.module('freeLesson', ['ngMask', 'ngSanitize']).controller('freeLessonController', ['$scope', '$http', '$sce',  function ($scope, $http, $sce) {
    $scope.ngPhoneNumber = "";
    $scope.ngName = "";
    $scope.errorMessage = "";
    $scope.successMessage = "";

    $scope.showSendPhoneButton = true;
    $scope.showCloseButton = false;

    $scope.closeDialog = function(){
        $('#testLesson').modal('toggle');
    }

    $scope.sendQuery = function () {
        let data = new FormData();
        data.append('name', $scope.ngName);
        data.append('phone', $scope.ngPhoneNumber);
        // console.log('click ' + $scope.ngName + " " + $scope.ngPhoneNumber);
        $http({
            method: 'POST',
            url: '/callBack',
            headers: {
                transformRequest: angular.identity,
                transformResponse: angular.identity,
                'Content-Type': undefined
            },
            data: data
        }).then(
            function (response) {
                let res = response.data;
                if(res.success){
                    $scope.errorMessage = "";
                    $scope.successMessage = "Наші оператори з вами зв'яжуться.";
                    $scope.showSendPhoneButton = false;
                    $scope.showCloseButton = true;
                }else{
                    $scope.errorMessage = $sce.trustAsHtml(res.errorMessage);
                    $scope.successMessage = "";
                    $scope.showSendPhoneButton = false;
                    $scope.showCloseButton = true;
                }
            },
            function (response) {
                $scope.errorMessage = $sce.trustAsHtml(response.data.errorMessage);
                $scope.showSendPhoneButton = false;
                $scope.showCloseButton = true;
            }
        )
    }
}]);
