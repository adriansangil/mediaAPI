app.controller('MediaController', function($scope, $http) { 
	$http({
        method : "GET",
        url : "http://localhost:8080/medias"
    }).then(function mySuccess(response) {
        $scope.mediaList = response.data;
    }, function myError(response) {
        $scope.myError = response.statusText;
    });


    $scope.addMedia = function() {
    	$http({
        method : "POST",
        headers: {'Content-Type': 'application/json'},
        data :  $scope.media,
        url : "http://localhost:8080/medias"
    }).then(function mySuccess(response) {
        $scope.mediaList = response.data;

    }, function myError(response) {
        $scope.myError = response.statusText;
    });
    }
	
});
