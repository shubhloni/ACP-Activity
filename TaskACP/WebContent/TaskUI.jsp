<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
</head>
<body>

<form method="post" action='TaskUI'>
<br><br>
<div align="center">
<h2>ACP ACTIVITY - Servlet Implementation</h2>
<br><br>
<h3><b>Registration Form</b></h3>
<br>
<table width="20%">
<tr>
  <td>First name*</td>
  <td>:  &emsp;<input type="text" name="fName" placeholder="First name.." required><br></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Last name*</td>
  <td>:  &emsp;<input type="text" name="lName" placeholder="Last name.." required><br></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Email*</td>
  <td>:  &emsp;<input type="text" name="Email" placeholder="Email ID.." required><br></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Mobile*</td>
  <td>:  &emsp;<input type="text" name="Mobile" placeholder="Mobile No.." required><br></td> 
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>College*</td>
  <td>:  &emsp;<input type="text" name="College" placeholder="College name.." required><br></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Branch*</td>
  <td>:  &emsp;<input type="text" name="Branch" placeholder="Studying branch.." required><br></td>
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Year*</td>
  <td>:  &emsp;<input type="text" name="Year" placeholder="Studying year.." required><br></td>          
</tr>
<tr>
<td><br></td>
</tr>
<tr>
  <td>Address*</td> 
  <td>:  &emsp;<input type="textarea" name="Address" placeholder="Your address.." required><br></td>          
</tr>
<tr>
  <td><br><br></td>
</tr>
<tr>
  <td colspan="2" align="center"> 
  	<input type="submit" value="Submit" style="color:green">
  	<input type="reset" value="Clear" style="color:red"> 
  </td>
</tr>
</table>
</div>
</form>


</body>
</html>