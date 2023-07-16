<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Raw Material</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #71daf5;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #2bd9b0;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 100%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
</head>
<body>
<form action="issueRaw" style="border:1px solid #ccc" method="post">
  <div class="container">
  <center>
    <h1>Issue Raw Material</h1>
    </center>
    <hr>

   <!--  <label for="name"><b>Enter RawMaterial Id</b></label>
    <input type="text" placeholder="Enter Raw Material Id" name="rid" required> -->
        

   <label for="name"><b>Enter Item Id</b></label>
    <input type="text" placeholder="Enter Item  Id" name="iid" required>
    
         <label for="mobile"><b>Issuer Name</b></label>
    <input type="text" placeholder="Enter Name" name="iname" required>
        
    <label for="email"><b>Enter Quantity</b></label>
    <input type="text" placeholder="Enter Quantity" name="iquantity" required>
    
    <label for="psw"><b>Date of Issue</b></label>
    <input type="date" placeholder="Enter Date" name="date" required>
 
    <div class="clearfix">
  
      <button type="submit" class="signupbtn">Submit</button>
      
    </div>
  </div>
</form>
</body>
</html>