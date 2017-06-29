<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<title>Insert title here</title>
<link href="/eStudyHub/css/design1.css" rel="stylesheet" type="text/css" />
<script  src="/eStudyHub/javascipt/jquery-3.1.1.min.js"></script>
<script src="/eStudyHub/javascipt/studentRegistration.js"></script>

</head>
<body>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title></title>

</head>
<body>
<form name="studentRegisterform">
<div class="form_table">
<div class="segment_header" style="width: auto; text-align: Left;">
					<h1 align="center" style="font-size: 30px; padding: 20px 1em;">STUDENT REGISTRATION FROM</h1>
				</div>

<table width="531" align="center">
  <th width="226" height="21"><div align="left">
					<span class="Estilo9">STUDENT PROFIL DETAILS:</span>
				</div></th>
  <tr></tr>
  <tr>
				<td class="text_field">Student’s Legal First Name<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td width="293"><input type="text" id="sfirstname" class="text_field" required /></td> 
  </tr>
    <tr>
				<td>Student’s Legal Middle Name</td>
  <td><input type="text" id="smiddlename" /></td> 
    </tr>
    <tr>
				<td>Student’s Legal Last Name<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="slastname" /></td> 
    </tr>
   
    <tr>
				<td>Student’s Preferred Name<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="spreferredname" /></td> 
   
			<tr>
				<td>Gender<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td>Female<input type="radio" name="sgender" id="female" value="F"/> Male
    <input type="radio" name="sgender" id="male" value="M"/></td>
    </tr>
								   <tr>
				<td>DateofBirth<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="sdateofbirth" />(DD/MM/YYYY)</td> 
    </tr>
									   <tr>
				<td>Place Of Birth<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="splaceofbirth" /></td> 
    </tr>
	 <tr>
				<td height="25">Student Race<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><select id="sStudentrace">
  <option value="W">White</option>
  <option value="B">Black</option>
  <option value="A">Asian</option>
   </select></td> 
    </tr>
										   <tr>
				<td>Student Live with<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="slivewith" /></td> 
    </tr>
									   <tr>
				<td>Aadhar Card<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="saadharcard" /></td> 
    </tr>
										   <tr>
				<td>Religion<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="sreligion" /></td> 
    </tr>
											   <tr>
				<td>Caste<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="scaste" /></td> 
    </tr>
											   <tr>
				<td>Category<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="scategory" /></td> 
    </tr>
												   <tr>
				<td>RTE Candidate<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td>Yes<input type="radio" name="sRTEcandidate" id="RTEyes" value="Y"/>No<input
					type="radio" name="sRTEcandidate" id="RTEno" value="N"/></td>
    </tr>	
<tr>
			</tr>	
    <tr>
				<td>Address Line 1<b class="icon_ired" style="color: #FF0000">*</b></td>
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
				<td>Town/City<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="stownORcity" /></td> 
    </tr>
		   <tr>
				<td>District<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="sdistrict" /></td> 
    </tr>
			   <tr>
				<td>State<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
				   <tr>
				<td>State<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
					   <tr>
				<td>Country</td>
  <td><input type="text" id="scountry" /></td> 
    </tr>
						   <tr>
				<td>	Zip code/Postal Code<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="spostalcode" /></td> 
    </tr>
					   <tr>
				<td>Home Phone Number<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="shomephone" /></td> 
    </tr>
						   <tr>
				<td>Mobile Number<b class="icon_ired" style="color: #FF0000">*</b></td>
  <td><input type="text" id="smobilenumber" /></td> 
    </tr>

</table>
<table width="133" align="center">
 <td width="58"><a href="../eStudyHub/previousSchoolingInformation.jsp">Next</a></td>
<td width="63"><input type="button" value="Save" id="ssave" onclick="saveStudentRegistrationDetails()" /></td>


</table>
</div>
</form>
</body>

</html>