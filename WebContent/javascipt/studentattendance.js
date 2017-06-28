$(document).ready(function() {

	var branchId = $('#branchId').val();
	var schemId = $('#schemeId').val();
	var accountNumber = $('#accountNumber').val();
	primaryCustomerIdCheck = "";
	arrayCustomerId = [];
	addArray = [];
	
	$.ajax({
		url : "../api/operator/getOperatorDetails?page_cmd=getAccountInformation&schemeId="+ schemId + "&accountNumber="+ accountNumber	+ "&branchId="+ branchId, 
		type : "POST",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(data) {
			addData = data;
			document.getElementById("customerShortName").value = data.account.customer.customerShortName;
			primaryCustomerIdCheck = data.account.customerId;
			tableData = "";
			tableData += '<tr><td align= "middle">Primary</td><td align= "middle">'+ data.account.customerId + '</td><td align= "middle">'+ data.account.customer.customerShortName + '</td><td></td><td></td></tr>';
		},
		error : function(xhr, status, err) {
			alert("Not a Valid Account   " + status);
			$('#Table tbody').empty();
			// window.location = "../Others/JoinOperator.jsp";
		}
	});
});