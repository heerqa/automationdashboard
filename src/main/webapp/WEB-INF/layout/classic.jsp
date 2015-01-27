<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesex" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Latest compiled and minified CSS -->
<!-- Latest compiled and minified CSS -->
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Optional: Include the jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!-- Optional: Incorporate the Bootstrap JavaScript plugins -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>


<title><tiles:getAsString name="title"></tiles:getAsString>  </title>
<link rel="icon" 
      type="image/png" 
      href="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQNavDPRnSjAh1s0kXgox4CTCmcaHKSO5JYEEMAvNa5aRWtPEaFVg">
<style>
/* GLOBAL STYLES
-------------------------------------------------- */
/* Padding below the footer and lighter body text */

body {
  padding-bottom: 40px;
  color: #5a5a5a;
}


/* CUSTOMIZE THE NAVBAR
-------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper {
  position: absolute;
  top: 0;
  right: 0;
  left: 0;
  z-index: 20;
}

/* Flip around the padding for proper display in narrow viewports */
.navbar-wrapper > .container {
  padding-right: 0;
  padding-left: 0;
}
.navbar-wrapper .navbar {
  padding-right: 15px;
  padding-left: 15px;
}
.navbar-wrapper .navbar .container {
  width: auto;
}


/* CUSTOMIZE THE CAROUSEL
-------------------------------------------------- */

/* Carousel base class */
.carousel {
  height: 500px;
  margin-bottom: 60px;
}
/* Since positioning the image, we need to help out the caption */
.carousel-caption {
  z-index: 10;
}

/* Declare heights because of positioning of img element */
.carousel .item {
  height: 500px;
  background-color: #777;
}
.carousel-inner > .item > img {
  position: absolute;
  top: 0;
  left: 0;
  min-width: 100%;
  height: 500px;
}


/* MARKETING CONTENT
-------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .col-lg-4 {
  margin-bottom: 20px;
  text-align: center;
}
.marketing h2 {
  font-weight: normal;
}
.marketing .col-lg-4 p {
  margin-right: 10px;
  margin-left: 10px;
}


/* Featurettes
------------------------- */

.featurette-divider {
  margin: 80px 0; /* Space out the Bootstrap <hr> more */
}

/* Thin out the marketing headings */
.featurette-heading {
  font-weight: 300;
  line-height: 1;
  letter-spacing: -1px;
}


/* RESPONSIVE CSS
-------------------------------------------------- */

@media (min-width: 768px) {
  /* Navbar positioning foo */
  .navbar-wrapper {
    margin-top: 20px;
  }
  .navbar-wrapper .container {
    padding-right: 15px;
    padding-left: 15px;
  }
  .navbar-wrapper .navbar {
    padding-right: 0;
    padding-left: 0;
  }

  /* The navbar becomes detached from the top, so we round the corners */
  .navbar-wrapper .navbar {
    border-radius: 4px;
  }

  /* Bump up size of carousel content */
  .carousel-caption p {
    margin-bottom: 20px;
    font-size: 21px;
    line-height: 1.4;
  }

  .featurette-heading {
    font-size: 50px;
  }
}

@media (min-width: 992px) {
  .featurette-heading {
    margin-top: 120px;
  }
}

 </style>
</head>
<body>
<tilesex:useAttribute name="current"/>
 <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
      <!--     <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
             <a class="navbar-brand" href="#">Heer Software</a>
          </div> -->
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
             <%--  <li class="${current=='home' ? 'active' : ' '} "><a href='<spring:url value="/home.html"/>'>Home</a></li> --%>
              
              
              <li class="${current=='automationdashboard' ? 'active' : ' '} "> <a href='<spring:url value="/automationdashboard.html"/>'>Automation Dashboard</a></li>
             
              <security:authorize access="! isAuthenticated()">
              	<li class="${current=='login' ? 'active' : ' '} "><a href='<spring:url value="/login.html"/>'>Login</a></li>
              </security:authorize>
              
              <security:authorize access="isAuthenticated()">
              	<li><a href='<spring:url value="/logout"/>'>Logout</a></li>
              </security:authorize>
              
              <!-- <li><a href="#">About</a></li> -->
             <%--  <li class="${current=='contact' ? 'active' : ' '} "><a href='<spring:url value="/contact.html"/>'>Contact Us</a></li> --%>
              </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
      </div>
      
<tiles:insertAttribute name="body"/>

<center>
<br><br>
<tiles:insertAttribute name="footer"/>
</center>

</body>
</html>