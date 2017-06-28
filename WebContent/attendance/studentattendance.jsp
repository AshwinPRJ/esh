
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>

<title>Student Attendance</title>

<style type="text/css" media="all">
/* LOOK AND FEEL */
</style>

<link href="/eStudyHub/css/design.css" rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script type="text/javascript" src="/eStudyHub/javascipt/faculty.js"></script>
</head>
<body>
	<h1 align="center">Student Attendance</h1>
	<form name="Acc" class="form-container">
		<table style="widows: 90px;" align="center" border="1" cellpadding="2"
			name="dataTable" id="Table" cellspacing="2">
			<thead>
				<tr>
					<th class="TableHeaderRow">Register Number</th>
					<th class="TableHeaderRow">Student Name</th>
					<th class="TableHeaderRow">Status</th>
					<th class="TableHeaderRow">Save</th>
				</tr>
			</thead>
			<tbody id="tBody"></tbody>
		</table>
	</form>
</body>
</html>
