// This is the version used for regular HTML + FreeMarker with jQuery

function deleteUserLogin(userId) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/cs480/login/" + userId,
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

function addUserLogin() {

	var userID = $('#input_userID').val();
	var userName = $('#input_name').val();
	var userPassword = $('#input_password').val();
	var userPhone = $('#input_phone').val();

	if (userID) {
		$.ajax(
				{
					type : "POST",
					url  : "/cs480/login/" + userID,
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

function getUserLogin(userID) {
	var userID = $('#query_id').val();
	if (userID) {
		$.ajax(
				{
					type : "GET",
					url  : "/cs480/login/" + userID,
					data : {
					},
					success : function(result) {
						$('#result_userID').text(result.userID);
						$('#result_name').text(result.name);
						$('#result_username').text(result.username);
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