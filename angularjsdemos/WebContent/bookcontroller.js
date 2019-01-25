/**
 * 
 */
app.controller('BookCtrl',function($scope)
		{
	$scope.book={'isbn':100,'title':'Spring FrameWork', 'author':'James','price':250}

	$scope.books=[{'isbn':101,'title':'Java', 'author':'Richard','price':650},
				  {'isbn':102,'title':'Electronics', 'author':'Agarwal','price':420},
				  {'isbn':103,'title':'Angular Js', 'author':'James','price':850},
				  {'isbn':104,'title':'HTML', 'author':'Dhiraj','price':760}]
	
	
	$scope.addBook=function()
	{
	
      alert("in addBook")
		console.log('entered book is')
		console.log($scope.book)
	}
	
	
	
	})