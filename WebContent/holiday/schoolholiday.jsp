
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>

<title>Holiday</title>

<style type="text/css" media="all">
/* LOOK AND FEEL */
body {
	background: #FCFCFC;
	background-size: cover;
	font-family: 'Lato', sans-serif;
	font-size: 13px;
	background-position: 50% 50%;
}

.form_table {
	width: 1000px;
	margin-left: auto;
	margin-right: auto;
	border-radius: 0;
	border: 1px solid #D9DDE2;
	background: #FFFFFF;
	background-size: cover;
	color: #36454E;
	overflow: hidden;
	box-shadow: none;
	background-position: 50% 50%;
}

.form_table a {
	color: #0D47A1;
}

.outside a {
	color: #0D47A1;
}

.form_table a:visited {
	color: #0D47A1;
}

.outside a:visited {
	color: #0D47A1;
}

.segment_header {
	width: auto;
	margin: 1px;
	color: #FFFFFF;
	background: #2196F3;
	background-size: cover;
	background-repeat: repeat;
	background-position: 50% 50%;
	border-radius: 0;
}

.segment_header h1 {
	border-radius: 0;
	padding: 20px 10px;
	font-family: 'Lato', sans-serif;
}

.q {
	padding: 10px;
	margin-bottom: 10px;
	margin-left: 10px;
	float: left;
	display: block;
}

.q .question {
	font-weight: bold;
}

.q .left_question_first {
	width: 15em;
}

.required .icon {
	background-image: none;
	background-position: left;
	background-repeat: no-repeat;
	font-size: 13px;
	padding-left: 14px;
}

.q .text_field {
	background: #FFFFFF;
	border: 1px solid #D9DDE2;
	border-radius: 2px;
	border-width: 1px;
	color: #36454E;
	font-family: 'Lato', sans-serif;
	font-size: 14px;
	margin: 1px 0;
	padding: 10px;
}

.q .file_upload {
	background: #FFFFFF;
	border: 1px solid #D9DDE2;
	border-radius: 2px;
	border-width: 1px;
	color: #36454E;
	font-family: 'Lato', sans-serif;
	font-size: 14px;
	margin-top: 1px;
	padding: 10px;
}

.q .file_upload_button {
	margin-top: 2px;
}

.q .inline_grid td {
	padding: 5px;
	vertical-align: baseline;
}

.q .drop_down {
	background: #FFFFFF;
	border: 1px solid #D9DDE2;
	border-radius: 2px;
	border-width: 1px;
	color: #36454E;
	font-family: 'Lato', sans-serif;
	font-size: 14px;
	margin: 1px 0;
	padding: 9px;
}

.q .matrix th {
	color: #7A858B;
	background: #F0F2F4;
	padding: 5px;
	font-weight: bold;
	text-align: center;
	vertical-align: bottom;
}

.q .matrix td {
	padding: 5px;
	text-align: center;
	white-space: nowrap;
	height: 26px;
	border-bottom: 1px solid #D9DDE2;
	border-top: 1px solid #D9DDE2;
}

.q .matrix td.question {
	border-right: 1px solid #D9DDE2;
	font-weight: normal;
}

.q .matrix .multi_scale_sub th {
	font-weight: normal;
	border-top: 1px solid #D9DDE2 !important;
	background: #F4F6F9;
}

.q .matrix .multi_scale_break {
	border-right: 1px solid #D9DDE2;
}

.q .matrix_row_dark td {
	color: #36454E;
	background: #FCFCFC;
}

.q .matrix_row_dark td.question {
	color: #36454E;
	background: #FCFCFC;
}

.q .matrix_row_light td {
	color: #36454E;
	background: #FFFFFF;
}

.q .matrix_row_light td.question {
	color: #36454E;
	background: #FFFFFF;
}

.q .rating_ranking td {
	padding: 5px;
}

.q .scroller {
	border: 1px solid #D9DDE2;
}

.highlight {
	background: #FFF9C4 !important;
}

tr.highlight td {
	background: #FFF9C4 !important;
}

.outside {
	color: #36454E;
}

.outside_container {
	width: 650px;
	padding: 1em 0;
	margin-left: auto;
	margin-right: auto;
	text-align: center;
	color: #36454E;
}

.outside_container .submit_button {
	color: #FFFFFF !important;
	background: #1795FF;
	background-size: auto;
	border-style: none;
	border-width: 0px;
	border-color: #FFFFFF;
	border-radius: 2px;
	text-align: center;
	font-family: 'Lato', sans-serif;
	font-size: 14px;
	font-weight: normal;
	min-width: 20%;
	padding: 10px 20px;
	text-transform: none;
	box-shadow: none;
}

.outside_container .submit_button:hover {
	background: #106AB7;
	border-color: #BBBBBB;
	background-size: auto;
}

.progressBarWrapper {
	border-radius: 0;
	background: #FFFFFF;
	background-size: cover;
	border-color: #D9DDE2;
}

.progressBarBack {
	color: #FFFFFF;
	background-color: #1795FF;
}

.progressBarFront {
	color: #36454E;
}

.ui-widget {
	font-family: 'Lato', sans-serif;
}

.invalid {
	background: #FDF1F0;
}

.invalid .invalid_message {
	color: #EC756B;
	background: #FDF1F0;
	border: 1px solid #EC756B;
	border-radius: 2px;
}

.form_table.invalid {
	border: 2px solid #EC756B;
}

.invalid .matrix .invalid_row {
	background: #FDF1F0;
}
</style>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script type="text/javascript">
	function save() {

		var schoolHoliday = {
			date : new Date($("#date").val()),
			event : $("#event").val(),
			holidaytype : $('input[name=holidaytype]:checked').val(),
			reason : $("#reason").val(),
		};

		var applyLeave = {
			studentName : $("#studentName").val(),
			leavetype : $("#leavetype").val(),
			leaveBalance : $("#leaveBalance").val(),
			fromDate : new Date($("#fromDate").val()),
			toDate : new Date($("#toDate").val()),
			daysOfLeave : $("#daysOfLeave").val(),
			approver : $("#approver").val(),
			remarks : $("#remarks").val(),
			email : $("#email").val(),
		};

		var keyValue = {
			"schoolProfileBean" : schoolHoliday,
			"applyLeaveBean" : applyLeave,

		};

		var stringifyVar = JSON.stringify(keyValue);
		alert(stringifyVar);
		$.ajax({
			url : "/eStudyHub/api/holiday/schoolProfiling",
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			data : stringifyVar,
			success : function(response) {
				alert("Success " + response.responseMessage);
			},
			error : function(xhr, status, err) {
				alert("Error" + status);
			}
		});
	}
</script>
</head>
<body>
	<form id="FSForm">
		<div class="form_table">
			<div class="clear"></div>
			<div id="q34" class="q full_width">
				<a class="item_anchor" name="ItemAnchor0"></a>
				<div class="segment_header" style="width: auto; text-align: Left;">
					<h1 style="font-size: 30px; padding: 20px 1em;">Add School
						Holidays</h1>
				</div>
			</div>

			<div class="clear"></div>

			<div id="q2" class="q ired">
				<a class="item_anchor" name="ItemAnchor1"></a> <label
					class="question left_question_first" for="RESULT_TextField-1">Date:&nbsp;<b
					class="icon_ired" style="color: #FF0000">*</b>
				</label>
				<div class="inline_answer">
					<input type="text" name="RESULT_TextField-1" class="text_field"
						id="date" size="25" maxlength="25" />
				</div>
			</div>
			<div id="q35" class="q ired">
				<a class="item_anchor" name="ItemAnchor2"></a> <label
					class="question left_question" for="RESULT_TextField-2">Event:&nbsp;<b
					class="icon_ired" style="color: #FF0000">*</b>
				</label>
				<div class="inline_answer">
					<input type="text" name="RESULT_TextField-2" class="text_field"
						id="event" size="25" maxlength="25" value="" />
				</div>

			</div>
			<div id="q37" class="q ired">
				<a class="item_anchor" name="ItemAnchor4"></a> <span
					class="question left_question_first">Holiday Type:&nbsp;<b
					class="icon_ired" style="color: #FF0000">*</b></span>
				<table class="inline_grid inline_answer" id="tableid">
					<tr>
						<td><input type="radio" name="holidaytype"
							class="multiple_choice" id="RESULT_RadioButton-4_0"
							value="Mandatory" /><label for="RESULT_RadioButton-4_0">Mandatory</label></td>
						<td><input type="radio" name="holidaytype"
							class="multiple_choice" id="RESULT_RadioButton-4_1"
							value="Optional" /><label for="RESULT_RadioButton-4_1">Optional</label></td>
					</tr>
				</table>
			</div>
			<div class="clear"></div>

			<div id="q52" class="q ired">
				<a class="item_anchor" name="ItemAnchor33"></a> <label
					class="question left_question_first" for="RESULT_TextArea-33">Reason:&nbsp;<b
					class="icon_ired" style="color: #FF0000">*</b>
				</label>
				<div class="inline_answer">
					<textarea name="RESULT_TextArea-33" class="text_field" id="reason"
						rows="7" cols="50"></textarea>
				</div>



				<!-- ################################################################################################################################################################################################################################################# -->

				<div class="clear"></div>
				<div id="q12" class="q full_width">
					<a class="item_anchor" name="ItemAnchor21"></a>
					<div class="segment_header" style="width: auto; text-align: Left;">
						<h1 style="font-size: 18px; padding: 20px 1em;">Apply Leave</h1>
					</div>
				</div>
				<div class="clear"></div>
				<div id="q13" class="q">
					<a class="item_anchor" name="ItemAnchor22"></a> <label
						class="question left_question_first" for="RESULT_TextField-22">Student
						Name:</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-22" class="text_field"
							id="studentName" size="25" maxlength="255" value="" />
					</div>
				</div>
				<div class="clear"></div>
				<div id="q48" class="q">
					<a class="item_anchor" name="ItemAnchor23"></a>
					<div id="q49" class="q ired" style="width: 902px; height: 56px;">
						<a class="item_anchor" name="ItemAnchor24"></a> <label
							class="question left_question_first" for="RESULT_RadioButton-24">LeaveType&nbsp;<b
							class="icon_ired" style="color: #FF0000">*</b></label> <select
							id="leavetype" name="leavetype" class="drop_down inline_answer">
							<option></option>
							<option value="Privilage">Privilage</option>
							<option value="Sick/Casual">Sick/Casual</option>

						</select>
					</div>
					<label class="question left_question_first"
						for="RESULT_TextField-23">Leave Balance</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-23" class="text_field"
							id="leaveBalance" size="25" maxlength="255" value="" />
					</div>
				</div>
				<div class="clear"></div>

				<div class="clear"></div>
				<div id="q50" class="q">
					<a class="item_anchor" name="ItemAnchor25"></a> <label
						class="question left_question_first" for="RESULT_TextField-25">From
						Date</label>
					<div class="inline_answer">
						<input type="date" name="RESULT_TextField-25" class="text_field"
							id="fromDate" size="25" maxlength="255" value="" />
					</div>
				</div>

				<div class="clear"></div>
				<div id="q50" class="q">
					<a class="item_anchor" name="ItemAnchor25"></a> <label
						class="question left_question_first" for="RESULT_TextField-25">To
						Date</label>
					<div class="inline_answer">
						<input type="date" name="RESULT_TextField-25" class="text_field"
							id="toDate" size="25" maxlength="255" value="" />
					</div>
				</div>


				<div class="clear"></div>

				<div id="q61" class="q">
					<a class="item_anchor" name="ItemAnchor41"></a> <label
						class="question left_question_first" for="RESULT_TextField-41">DaysOfLeave</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-41"
							class="text_field number_field" id="daysOfLeave" size="25"
							maxlength="255" value="" />
					</div>
				</div>

				<div class="clear"></div>

				<div class="clear"></div>
				<div id="q13" class="q">
					<a class="item_anchor" name="ItemAnchor22"></a> <label
						class="question left_question_first" for="RESULT_TextField-22">Approver:</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-22" class="text_field"
							id="approver" size="25" maxlength="255" value="" />
					</div>
				</div>
				<div class="clear"></div>

				<div class="clear"></div>
				<div id="q13" class="q">
					<a class="item_anchor" name="ItemAnchor22"></a> <label
						class="question left_question_first" for="RESULT_TextField-22">Remarks:</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-22" class="text_field"
							id="remarks" size="25" maxlength="255" value="" />
					</div>
				</div>
				<div class="clear"></div>

				<div class="clear"></div>
				<div id="q13" class="q">
					<a class="item_anchor" name="ItemAnchor22"></a> <label
						class="question left_question_first" for="RESULT_TextField-22">Email:</label>
					<div class="inline_answer">
						<input type="text" name="RESULT_TextField-22" class="text_field"
							id="email" size="25" maxlength="255" value="" />
					</div>
				</div>
				<div class="clear"></div>

				<div class="outside_container">
					<div class="buttons_reverse">
						<input type="button" name="Submit" value="Submit"
							class="submit_button" id="FSsubmit" onclick="save()" />
					</div>
				</div>
	</form>
</body>
</html>
