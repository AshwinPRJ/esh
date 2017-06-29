<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script  src="/eStudyHub/javascipt/jquery-3.1.1.min.js"></script>
<script src="/eStudyHub/javascipt/studentRegistration.js"></script>
<link href="/eStudyHub/css/design1.css" rel="stylesheet" type="text/css" /></head>
<body>
<form name="previousschoolingForm">


<div class="form_table">
<div class="segment_header" style="width: auto; text-align: Left;">
					<h1 align="center" style="font-size: 30px; padding: 20px 1em;">Previous Schooling</h1>
				</div>

<table width="506" align="center">
<tr>
				<td width="218">Previous School Name</td>
  <td width="276"><input type="text" id="sPreviousSchoolName" required /></td> 
  </tr>
  <tr>
				<td>Category of School</td>
  <td width="276"><select id="sCategoryofSchool"> <option value="P">public</option>
  <option value="A">Academic</option>
  <option value="R">Private</option></select></td> 
  </tr>
  <tr>
				<td>Previous School Grade</td>
  <td width="276"><input type="text" id="sPreviousSchoolGrade" required /></td> 
  </tr>
    <tr>
				<td>Previous Grade Percentile/Marks</td>
  <td width="276"><input type="text" id="sPreviousSchoolMarks" required /></td> 
  </tr>

</table>
<table width="133" align="center">
 <td width="58"><a href="../eStudyHub/familyInformation.jsp">Skip</a></td>
<td width="63"><input type="button" value="Save"  onclick="saveStudentRegistrationDetails()" /></td>

</table>
</div>
</form>
</body>
</html>