// This is the version used for the HTML home-ajs.html with AngularJS
// This is the trending technology
var cs480App = angular.module('cs480App', []);

cs480App.controller('UserCtrl', function ($scope, $http) {

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
	  $http.post("cs480/user/" + $scope.new_id + "?name=" + $scope.new_name + "&major=" + $scope.new_major)
	  	.success(function(data){
	  		$scope.loadUsers();
	  	});
  }

  $scope.addEvent = function() {
	$http.post("cs480/event/" + $scope.new_eventId + "?name=" + $scope.new_name + "&location" + $scope.new_location + "&date" + $scope.new_date + "&start_time" + $scope.new_start_time + "&end_time" + $scope.new_end_time)
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
	
	$scope.deleteEvent = function(eventId) {
	  $http.delete("cs480/event/" + eventId)
	  	.success(function(data){
	  		$scope.loadEvents();
	  	});
  }

  $scope.loadUsers();
  $scope.loadEvents();

});