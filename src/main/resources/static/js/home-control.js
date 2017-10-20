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
				url  : "/cs480/user/" + userId,
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

	var userId = $('#input_id').val();
	var userName = $('#input_name').val();
	var userMajor = $('#input_major').val();

	if (userId) {
		$.ajax(
				{
					type : "POST",
					url  : "/cs480/user/" + userId,
					data : {
						"name" : userName,
						"major" : userMajor
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

function getUser(userId) {
	var userId = $('#query_id').val();
	if (userId) {
		$.ajax(
				{
					type : "GET",
					url  : "/cs480/user/" + userId,
					data : {
					},
					success : function(result) {
						$('#result_id').text(result.id);
						$('#result_name').text(result.name);
						$('#result_major').text(result.major);
					},
					error: function (jqXHR, exception) {
						alert("Failed to get the user.");
					}
				});
	} else {
		alert("Invalid user Id");
	}
}

function deleteEvent(eventId) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/cs480/event/" + eventId,
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

	var eventID = $('#input_event_id').val();
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