// This is the version used for the HTML home-ajs.html with AngularJS
// This is the trending technology
var cs480App = angular.module('cs480App', []);

cs480App.controller('Ctrl', function ($scope, $http) {

  $scope.loadUsers = function() {
	  $http.get("cs480/users/list")
	  	.success(function(data){
	  		$scope.users = data;
	  	});
  }

  $scope.loadEvents = function() {
	$http.get("cs480/events/list")
		.success(function(data){
			$scope.events = data;
		});
}

  $scope.getUser = function() {
	  $http.get("cs480/user/" + $scope.userIdToSearch)
	  	.success(function(data){
	  		$scope.founduser = data;
	  	});
	}
	
	$scope.getEvent = function() {
	  $http.get("cs480/event/" + $scope.eventIdToSearch)
	  	.success(function(data){
	  		$scope.foundevent = data;
	  	});
  }

  $scope.addUser = function() {
	  $http.post("cs480/user/" + $scope.new_userID + "?name=" + $scope.new_name + "&username=" + $scope.new_username + "&password=" + $scope.new_password + "&phone=" + $scope.new_phone)
	  	.success(function(data){
	  		$scope.loadUsers();
	  	});
  }

  $scope.addEvent = function() {
	$http.post("cs480/event/" + $scope.new_eventID + "?name=" + $scope.new_event_name + "&location" + $scope.new_location + "&date" + $scope.new_date + "&start_time" + $scope.new_start_time + "&end_time" + $scope.new_end_time)
		.success(function(data){
			$scope.loadEvents();
		});
	}

  $scope.deleteUser = function(userId) {
	  $http.delete("cs480/user/" + userId)
	  	.success(function(data){
	  		$scope.loadUsers();
	  	});
	}
	
	$scope.deleteEvent = function(eventID) {
	  $http.delete("cs480/event/" + eventID)
	  	.success(function(data){
	  		$scope.loadEvents();
	  	});
  }

  $scope.loadUsers();
  $scope.loadEvents();

});