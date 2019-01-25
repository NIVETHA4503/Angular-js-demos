/**
 * 
 */
app.controller('NameCtrl',function($scope){
	$scope.firstname="Jhon"
	$scope.lastname="Smith"
//		For Display the alert message
		alert($scope.firstname + " " + $scope.lastname)

	$scope.updateNames=function(){
	alert($scope.firstname + " " + $scope.lastname)
	
	}
})