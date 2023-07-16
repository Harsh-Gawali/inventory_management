
<%@page import="com.r3sys.modal.IssueMaterial"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %><%-- <%@ page import="java.util.*" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title></title>
  </head>
  <body><center>
  <h2>RawMaterial Table</h2></center>
  <hr>
    <table class="table">
  <thead class="thead-dark">
  
    <tr>
      <th scope="col">Issuer Id</th>
      <th scope="col">Date</th>
      <th scope="col">Material</th>
      <th scope="col">Issuer Name</th>
      <th scope="col">Quantity</th>
      <th scope="col">Raw id</th>
     
    </tr>
  </thead>
  <%
  List<IssueMaterial> issueMaterial=(List<IssueMaterial>)request.getAttribute("issueMaterial");
  for(IssueMaterial im : issueMaterial)
  {
  %>
  <tbody>
    <tr>
      <th scope="row"><%=im.getIid()%></th>
      <td><%=im.getDate()%></td>
      <td><%=im.getImaterialname()%></td>
      <td><%=im.getIname()%></td>
      <td><%=im.getIquantity()%></td>
       <td><%=im.getRid()%></td>
    
    </tr>
  </tbody>
  <%} %>
</table>
<center>
<a href="issuedashboard"><button type="button" class="btn btn-outline-danger">Back</button></a></center>



    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 	
  </body>
</html>