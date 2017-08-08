<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
 
        <html>
        <head>
        <body  style="background-image: url('./resources/images/bg.jpg');">


        
     
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
   
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <jsp:include page="header.jsp"></jsp:include> 
          
<div class="container">
  
  <form action="saveregister" method="post">
  
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
    </div>
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="name" class="form-control" id="name" placeholder="Enter name" name="name">
    </div>
      <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd">
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="address" class="form-control" id="address" placeholder="Enter address" name="address">
    </div>
      <div class="form-group">
      <label for="phone">Phone:</label>
      <input type="phone" class="form-control" id="phone" placeholder="Enter phone number" name="phone">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
            
          
           <br>
           <br>
           <br>
              <br>
           <br>
           <br>
           
     <jsp:include page="footer.jsp"></jsp:include>      
                    
        </body>



</html>