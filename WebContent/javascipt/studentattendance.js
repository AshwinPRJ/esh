
	$(document).ready(function(){
	    $(window ).load(function(){
	        alert("Image loaded.");
	    	$.ajax({
	    		url : "/eStudyHub/api/student/studentAttendance", 
	    		type : "POST",
	    		contentType : "application/json; charset=utf-8",
	    		dataType : "json",
	    		success : function(data) {
	    			console.log(data);
	    			tableData = "";
	    			tableData += '<tr><td align= "middle">Primary</td><td align= "middle">'+ data.account.customerId + '</td><td align= "middle">'+ data.account.customer.customerShortName + '</td><td></td><td></td></tr>';
	    		},
	    		error : function(xhr, status, err) {
	    			alert("Not a Valid Account   " + status);
	    			$('#Table tbody').empty();
	    		}
	    	});
	    });
	});
	

