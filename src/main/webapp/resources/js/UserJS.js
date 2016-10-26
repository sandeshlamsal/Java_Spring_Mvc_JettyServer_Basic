
var UserApp = angular
.module("UserModule",[])
.controller("UserController",function($scope,$http){

	$scope.name="sandesh lamsal";
	$scope.pass="******";
	
	//put all the events in controller class eg: on click , set the scope name and 
	$scope.buttonClicked=function(){
	$scope.name="milan lamsal";
	$scope.pass="PASSWORD";
	}
	
	
	
	//this is activated when form is submitted
	$scope.formData={}; //create empty form data to hold form values in scope
	$scope.frmSubmit=function(){
		console.log("login started..");
		$http({
	        method : "GET",
	        url : "/login",
	        dataType:'JSON'
	    }).then(function mySucces(response) {
	    	
	    	console.log("loginsucess");
	        $scope.name = response.data;
	    }, function myError(response) {
	    	console.log(response);
	    	console.log("Error Login");
	        $scope.name = response.statusText;
	    });
		
		
	}
	
});	
