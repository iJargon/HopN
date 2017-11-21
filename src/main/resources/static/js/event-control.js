// This is the version used for regular HTML + FreeMarker with jQuery

function deleteEvent(eventID) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/event/" + eventID,
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

function driverEvent(eventID) {
	var user = sessionStorage.getItem("userID");
	$.ajax(
		{
			type : "POST",
			url : "/event/" + eventID,
			data : {
				"driver" : user
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("There is already a driver.");
			}
		});
}

function p1Event(eventID) {
	var user = sessionStorage.getItem("userID");
	$.ajax(
		{
			type : "POST",
			url : "/event/" + eventID,
			data : {
				"p1" : user
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("There is already a passenger.");
			}
		});
}

function p2Event(eventID) {
	var user = sessionStorage.getItem("userID");
	$.ajax(
		{
			type : "POST",
			url : "/event/" + eventID,
			data : {
				"p2" : user
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("There is already a passenger.");
			}
		});
}

function p3Event(eventID) {
	var user = sessionStorage.getItem("userID");
	$.ajax(
		{
			type : "POST",
			url : "/event/" + eventID,
			data : {
				"p3" : user
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("There is already a passenger.");
			}
		});
}

function p4Event(eventID) {
	var user = sessionStorage.getItem("userID");
	$.ajax(
		{
			type : "POST",
			url : "/event/" + eventID,
			data : {
				"p4" : user
			},
			success : function(result) {
				location.reload();
			},
			error: function (jqXHR, exception) {
				alert("There is already a passenger.");
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
			url  : "/event/" + eventID,
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
					url  : "/event/" + eventId,
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