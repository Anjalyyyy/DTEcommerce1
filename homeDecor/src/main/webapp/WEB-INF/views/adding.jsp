<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">

/* Style the tab */
div.tab {
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
div.tab button {
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    transition: 0.3s;
}

/* Change background color of buttons on hover */
div.tab button:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
div.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #ccc;
    border-top: none;
}
.file {
  visibility: hidden;
  position: absolute;
}

</style>
</head>
 <body  style="background-image: url('./resources/images/bg.jpg');">
 <jsp:include page="header.jsp"></jsp:include> 
 <br>
 </br>
 
 <div style="width: 50%;height: 50%;" >
 <center>
<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'Category')">Category</button>
  <button class="tablinks" onclick="openCity(event, 'Products')">Products</button>
  <button class="tablinks" onclick="openCity(event, 'Supplier')">Supplier</button>
</div>
</center>
<div id="Category" class="tabcontent">
     <form action="saveCategory" method="post">
  <div class="form-group">
    <label for="categoryName">Category Name:</label>
    <input type="categoryName" class="form-control" id="name">
  </div>
  <button type="submit" class="btn btn-default">ADD</button>
</form>
</div>
<form action="saveProduct" method="post">
<div id="Products" class="tabcontent">
<form>
  <div class="form-group">
    <label for="productName">Prodcut Name:</label>
    <input type="productName" class="form-control" id="productName">
  </div>
  <div class="form-group">
    <label for="productDescription">Product Description:</label>
    <input type="productDescription" class="form-control" id="productDescription">
  </div>
  <div class="form-group">
    <label for="productPrice">Product Price:</label>
    <input type="productPrice" class="form-control" id="productPrice">
  </div>
  <div class="form-group">
    <label for="productImage">Product Image:</label>
    <input type="Image" class="form-control" id="productImage">
  </div>
  <div>
   <button class="browse btn btn-primary input-lg" type="button"><i class="glyphicon glyphicon-search"></i> Browse</button>
      </span>
    </div>
   <div class="form-group">
    <label for="productStock">Product Stock:</label>
    <input type="productStock" class="form-control" id="productStock">
  </div>
   <button type="submit" class="btn btn-default">ADD</button>
  
</form>
</div>

<div id="Supplier" class="tabcontent">
<form action="savesupplier" method="post">
 <div class="form-group">
    <label for="supplierId">Supplier Id:</label>
    <input type="supplierId" class="form-control" id="supplierId" name="id">
  </div>
 <div class="form-group">
    <label for="supplierName">Supplier Name:</label>
    <input type="supplierName" class="form-control" id="name" name="name">
  </div>
  <div class="form-group">
    <label for="supplierAddress">Supplier Address:</label>
    <input type="supplierAddress" class="form-control" id="address" name="address">
  </div>
   <button type="submit" class="btn btn-default">ADD</button>
  </form>
</div>
</div>

<script type="text/javascript">
function openCity(evt, cityName) {
    // Declare all variables
    var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }

    // Show the current tab, and add an "active" class to the button that opened the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}
$(document).on('click', '.browse', function(){
	  var file = $(this).parent().parent().parent().find('.file');
	  file.trigger('click');
	});
	$(document).on('change', '.file', function(){
	  $(this).parent().find('.form-control').val($(this).val().replace(/C:\\fakepath\\/i, ''));
	});
</script>
</body>
</html>
