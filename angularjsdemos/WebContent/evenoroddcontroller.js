/**
 * 
 */
app.controller('EvenOrOddCtrl',function($scope){
	$scope.evenOrOdd=function(){
		alert('Entered number is'+$scope.num)
		if($scope.num%2==0)
			$scope.result="Even"
			else
				$scope.result="Odd"
	}
})