/**
 * This js file contains the common javascript functions for whole application
 */

$(document).ready(function() {

	$("#clickMe").click(function() {
		$.ajax({
			type : "POST",
			url : "http://localhost:8080/BakeItStore/getAllCakes",
			success : function(response) {
				alert(response);
				alert(JSON.stringify(response));
				$("#tableDiv").html(JSON.stringify(response));
			},
			error : function(errordata) {
				alert("error: " + errordata);
			},
			done : function(somedata) {
				alert("done: " + somedata);
			}
		});
	});

});
