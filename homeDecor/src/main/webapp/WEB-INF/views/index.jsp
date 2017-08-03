<html>
<body  style="background-image: url('./resources/images/bg.jpg');">

<jsp:include page="header.jsp"></jsp:include>


<h1 align="center">Home Decor!</h1>
<h4 align="center" ><kbd>Make Your House A Home</kbd> </h4>
<br></br>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img src="./resources/images/1.jpg" alt="Los Angeles">
    </div>

    <div class="item">
      <img src="./resources/images/3.jpg" alt="Chicago">
    </div>

    <div class="item">
      <img src="./resources/images/4.jpg" alt="New York">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<br></br>

 
  <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="./resources/images/8.jpg" target="_blank">
          <img src="./resources/images/8.jpg"  style="width:50% height=50%">
       
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="./resources/images/6.jpg" target="_blank">
          <img src="./resources/images/6.jpg" alt="Nature" style="width:50% height=50%">
         
        </a>
      </div>
    </div>
     <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="./resources/images/7.jpg" target="_blank">
          <img src="./resources/images/7.jpg"  style="width:50% height=50%">
       
          
        </a>
      </div>
    </div>
  </div>
</div>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
