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


<div class="form_table">
<div class="segment_header" style="width: auto; text-align: Left;">
					<h1 align="center" style="font-size: 30px; padding: 20px 1em;">STUDENT EMERGENCY CONTACTS</h1>
			
</div>
<table width="380" align="center">
 <tr>
				<td>RelationShip</td>
  <td width="219"><select><option>Father</option>
  <option>Mother</option>
  <option>brother</option></select></td> 
  </tr>
  
<tr>
				<td>Name</td>
  <td><input type="text" id="smiddlename" /></td> 
  </tr>
     <tr>
				<td>landLine</td>
  <td width="219"><input type="text" id="sfirstname" required /></td> 
  </tr>
 
   <tr>
				<td>Mobile Number</td>
  <td width="219"><input type="text" id="sfirstname" required /></td> 
  </tr>
    <tr>
				<td>EmialId</td>
  <td><input type="text" id="smiddlename" /></td> 
    </tr>

</table>
<table align="center">   <tr> <td width="46"><input type="button" align="right" value="Save" id="ssave" onClick="saveStudentRegistrationDetails()" /></td></tr></table>
</div>
</body>
</html>