<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   
 
</head>
<body>


<div class="navbar navbar-inverse" role="navigation">  
    <div class="navbar-header">  
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myidname">  
            <span class="icon-bar"></span>  
            <span class="icon-bar"></span>  
            <span class="icon-bar"></span>  
        </button>  
        <span class="navbar-brand"></span>  
    </div>  
    <div class="navbar-collapse collapse" id="myidname">  
        <ul class="nav navbar-nav">  
            <li>  
                <a href="./">Home</a>  
            </li>  
            <li>  
                <a href="adding">Admin</a>  
            </li>  
            <li>  
                <a href="#">
          <span class=span class="glyphicon glyphicon-earphone"></span>
       </a>  
            </li>  
             <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Category List
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <c:forEach var="c" items="${clist}" >
          <li><a href="#"><c:out value="${c.name}"/></a></li>
       </c:forEach>
          </ul>
          </li>
            <li>  
                <a href="register">Register</a>  
            </li>  
            <li>  
                <a href="login">Login</a>  
            </li>  
        </ul>  
    </div> 
    </div>
</body>
</html>