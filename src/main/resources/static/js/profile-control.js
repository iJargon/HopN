// This is the version used for regular HTML + FreeMarker with jQuery

function bodyOnLoad() {
	var urlPathArray = window.location.pathname.split('/');
	var userID = urlPathArray[3];
	
	$.ajax(
		{
			type : "GET",
			url  : "/cs480/users/" + userID,
			data : {
			},
			success : function(result) {
				$('#username').text(result.userID);
				$('#name').text(result.name);
				$('#phone').text(result.phone);
			},
			error: function (jqXHR, exception) {
				alert("Error: Could not load profile.")
			}
		});
}