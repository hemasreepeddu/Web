<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>

<u>Employee Registration Form</u>
<form action="EmployeeController" method="post">  
Employee Name:
 <input type="text" name="Employee name"><br>
 
Department
  <select>
   <option value="Department">Department</option>
  <option value="HR">HR</option>
  <option value="Finance">Finance</option>
</select><br>

Address
  <input type="text" name="Address" > <br>
  
 Mobile
 <input type="text" name="Mobile"> <br>
 
 Register
 <input type="submit" value="Register"><br>
 <input type="hidden" name="action" value="register"/>

 </form>

</body>
</html>