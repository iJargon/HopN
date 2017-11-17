// This is the version used for regular HTML + FreeMarker with jQuery

function healthCheck() {
	$.ajax(
			{
				type : "GET",
				url  : "/cs480/ping",
				data : {
				},
				success : function(result) {
					$('#status').text(result);
				},
				error: function (jqXHR, exception) {
					$('#status').text("Failed to get the status");
				}
			});
}


function deleteUser(userId) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/cs480/users/" + userId,
				data : {
				},
				success : function(result) {
					location.reload();
				},
				error: function (jqXHR, exception) {
					alert("Failed to delete the user.");
				}
			});
}

function addUser() {

	var userID = $('#input_userID').val();
	var userName = $('#input_name').val();
	var userPassword = $('#input_password').val();
	var userPhone = $('#input_phone').val();

	if (userID) {
		$.ajax(
				{
					type : "POST",
					url  : "/cs480/users/" + userID,
					data : {
						"name" : userName,
						"password" : userPassword,
						"phone" : userPhone
					},
					success : function(result) {
						location.reload();
					},
					error: function (jqXHR, exception) {
						alert("Failed to add the user. Please check the inputs.");
					}
				});
	} else {
		alert("Invalid user Id");
	}
}

function getUser(userID) {
	var userID = $('#query_id').val();
	if (userID) {
		$.ajax(
				{
					type : "GET",
					url  : "/cs480/users/" + userID,
					data : {
					},
					success : function(result) {
						$('#result_userID').text(result.userID);
						$('#result_name').text(result.name);
						$('#result_password').text(result.password);
						$('#result_phone').text(result.phone);
					},
					error: function (jqXHR, exception) {
						alert("Failed to get the user.");
					}
				});
	} else {
		alert("Invalid user Id");
	}
}

function deleteEvent(eventID) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/cs480/event/" + eventID,
				data : {
				},
				success : function(result) {
					location.reload();
				},
				error: function (jqXHR, exception) {
					alert("Failed to delete the event.");
				}
			});
}

function addEvent() {

	var eventID = $('#input_eventID').val();
	var eventName = $('#input_event_name').val();
	var eventLocation = $('#input_event_location').val();
	var eventDate = $('#input_event_date').val();
	var eventStart = $('#input_event_start_time').val();
	var eventEnd = $('#input_event_end_time').val();

	$.ajax(
		{
			type : "POST",
			url  : "/cs480/event/" + eventID,
			data : {
					"event_name" : eventName,
					"location" : eventLocation,
					"date" : eventDate,
					"start_time" : eventStart,
					"end_time" : eventEnd
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("Failed to add the event. Please check the inputs.");
			}
	});	

}

function getEvent(eventId) {
	var eventId = $('#query_eventID').val();
	if (eventId) {
		$.ajax(
				{
					type : "GET",
					url  : "/cs480/event/" + eventId,
					data : {
					},
					success : function(result) {
						$('#result_eventID').text(result.eventID);
						$('#result_event_name').text(result.name);
						$('#result_location').text(result.location);
						$('#result_date').text(result.date);
						$('#result_start_time').text(result.start_time);
						$('#result_end_time').text(result.end_time);
					},
					error: function (jqXHR, exception) {
						alert("Failed to get the event.");
					}
				});
	} else {
		alert("Invalid event Id");
	}
}