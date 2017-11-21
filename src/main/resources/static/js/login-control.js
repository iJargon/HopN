// This is the version used for regular HTML + FreeMarker with jQuery

function deleteUserLogin(userId) {
	$.ajax(
			{
				type : "DELETE",
				url  : "/login/" + userId,
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
					url  : "/login/" + userID,
					data : {
						"name" : userName,
						"password" : userPassword,
						"phone" : userPhone
					},
					success : function(result) {
						sessionStorage.setItem('userID', result.userID);
						window.location.href = '/events';
					},
					error: function (jqXHR, exception) {
						alert("Could not successfuly create login, try again.");
					}
				});
	} else {
		alert("Invalid input, one or more of the text fields is missing.");
	}
}

function getUserLogin() {
	var userID = $('#query_id').val();
	var userPass = $('#user_password').val();

	if (userID && userPass) {
		$.ajax(
				{
					type : "GET",
					url  : "/login/" + userID,
					data : {
						"password" : userPass
					},
					success : function(result) {
						sessionStorage.setItem('userID', result.userID);
						window.location.href = '/events';
					},
					error: function (jqXHR, exception) {
						alert("Incorrect username/password.");
					}
				});
	} else {
		alert("Invalid username/password.");
	}
}