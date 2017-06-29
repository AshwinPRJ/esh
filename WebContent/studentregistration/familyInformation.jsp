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
					<h1 align="center" style="font-size: 30px; padding: 20px 1em;">STUDENT FAMILY INFORMATION</h1>
				</div>


<table align="center"> <tr>
				<td>RelationShip</td>
  <td width="256"><select><option>Father</option>
  <option>Mother</option>
  <option>StepFather</option></select></td> 
  </tr>
  
   <tr>
				<td>Student’s Legal Middle Name</td>
  <td><input type="text" id="smiddlename" /></td> 
    </tr>
    
    
				<tr>
				<td>Do you have legal Custody of child</td>
  <td>Yes<input type="radio" name="sRTEcandidate" id="RTEyes" value="Y"/>No<input
					type="radio" name="sRTEcandidate" id="RTEno" value="N"/></td>
    </tr>	
   <tr>
				<td>Legal First Name</td>
  <td width="256"><input type="text" id="sfirstname" required /></td> 
  </tr>
    <tr>
				<td>Legal Middle Name</td>
  <td><input type="text" id="smiddlename" /></td> 
    </tr>
    <tr>
				<td>Legal Last Name</td>
  <td><input type="text" id="slastname" /></td> 
    </tr>
    <tr>
				<td>Address Line 1</td>
  <td><input type="text" id="saddress1" /></td> 
    </tr>	
	   <tr>
				<td>Address Line 2</td>
  <td><input type="text" id="saddress2" /></td> 
    </tr>
	   <tr>
				<td>Address Line 3</td>
  <td><input type="text" id="saddress3" /></td> 
    </tr>
		   <tr>
				<td>Town/City</td>
  <td><input type="text" id="stownORcity" /></td> 
    </tr>
		   <tr>
				<td>District</td>
  <td><input type="text" id="sdistrict" /></td> 
    </tr>
			   <tr>
				<td>State</td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
				   <tr>
				<td>State</td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
					   <tr>
				<td>Country</td>
  <td><input type="text" id="scountry" /></td> 
    </tr>
						   <tr>
				<td>	Zip code/Postal Code</td>
  <td><input type="text" id="spostalcode" /></td> 
    </tr>
					   <tr>
				<td>Home Phone Number</td>
  <td><input type="text" id="shomephone" /></td> 
    </tr>
						   <tr>
				<td>Mobile Number</td>
  <td><input type="text" id="smobilenumber" /></td> 
    </tr>
   
   <td width="248"><a href="../eStudyHub/emergencyContacts.jsp">Next</a></td>
  </table>
  </div>
</body>
</html>