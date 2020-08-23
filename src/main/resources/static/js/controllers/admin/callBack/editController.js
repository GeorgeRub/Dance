angular.module('editcallBack', []).controller('editController', ['$scope', '$http', '$sce', function ($scope, $http, $sce) {
    $scope.answer = document.getElementById('talking').value;
    $scope.callBackId = document.getElementById('callBackId').value;
    $scope.callBackMessage = "";
    $scope.callBackUser = "";
    $scope.saveAnswer = function () {
        console.log($scope.answer);
        let data = new FormData();
        data.append('text', $scope.answer);
        data.append('id', $scope.callBackId);
        $http(
            {
                method: 'POST',
                url: '/admin/callback/edit',
                headers: {
                    transformRequest: angular.identity,
                    transformResponse: angular.identity,
                    'Content-Type': undefined
                },
                data: data
            }
        ).then(
            function (response) {
                let data = response.data;
                $scope.callBackMessage = $sce.trustAsHtml(data.message);
                $scope.callBackUser = $sce.trustAsHtml(data.userName);
            }, function (response) {
                let data = response.data;
                $scope.callBackMessage = $sce.trustAsHtml(data.message);
            }
        )
    }
}])