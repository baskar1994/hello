/**
 * 
 */

var  mod=angular.module("mymod",[]);

mod.controller("mycontroller",function($scope,$http){



		//alert("hellolist");
		$http.get("CustomerListEmitter")
		.then(function(response){
			
			$scope.k=response.data;
			//alert($scope.c.length);
			
		});

	$scope.getobj=function(){
		
		$http.get("CustomerObjectEmitter?cif="+$scope.cid)
		.then(function(response){
			alert(response.data);
			$scope.c=response.data;
			
		});
	};
	

});                       