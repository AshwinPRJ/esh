
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>

<title>Leave History</title>

<style type="text/css" media="all">
/* LOOK AND FEEL */
</style>

<link href="/eStudyHub/css/design.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script type="text/javascript" src="/eStudyHub/javascipt/leavehistory.js"></script>
</head>
<body>
	<h1 align="center">Leave History</h1>
	<form name="Acc" class="form-container">
		<table style="widows: 90px;" align="center" border="1" cellpadding="2"
			name="dataTable" id="Table" cellspacing="2">
			<thead>
				<tr>
					<th class="TableHeaderRow">Student Name</th>
					<th class="TableHeaderRow">Leave Type</th>
					<th class="TableHeaderRow">Leave Balance</th>
					<th class="TableHeaderRow">From Date</th>
					<th class="TableHeaderRow">To Date</th>
					<th class="TableHeaderRow">Days Of Leave</th>
					<th class="TableHeaderRow">Approver</th>
					<th class="TableHeaderRow">Remarks</th>
					
				</tr>
			</thead>
			<tbody id="tBody"></tbody>
		</table>

		<table width="40%" align="center">
			<tr>
				<td align="center"><input type="button" class="Button" name="BtLeaveSave" id="BtLeaveSave" value="Show Details" onclick="save()" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
