<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql"  uri="http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>

<title> North Sea Parts Integrated System </title>
<link rel="shortcut icon" type="image" href="${pageContext.request.contextPath}/static/images/favicon.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/foundation.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" />
<script src="${pageContext.request.contextPath}/static/js/vendor/modernizr.js"></script>
</head>
<body>

<div class="contain-to-grid sticky">
  <nav class="top-bar" data-topbar data-options="sticky_on: large">
  
  <ul class="title-area">
    <li class="name">
      <h1 style="letter-spacing:3px; border-right:thin solid grey; padding-right:10px;">NORTH SEA PARTS</h1>
    </li>
     <!-- Remove the class "menu-icon" to get rid of menu icon. Take out "Menu" to just have icon alone -->
    <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
  </ul>

	<!-- Left Nav Section -->
    <section class="top-bar-section">
    
    <ul class="left">
    <li class="has-dropdown">
    <a href="#"><spring:message code="label.title"/></a>
    <ul class="dropdown">
          <li><a href="dfsfs">Kumpletong Piesa at Kumpletong Serbisyo</a></li>
          <li><a href="dfs">Contact Us</a></li>
    </ul>
    </ul>
    
    <ul class="left">
    <li class="has-dropdown">
    <a href="#">Change Language</a>
    <ul class="dropdown">
          <li><a href="#">First link in dropdown</a></li>
          <li><a href="#">First link in dropdown</a></li>
          <li><a href="#">First link in dropdown</a></li>
    </ul>
    </ul>
    
    <ul class="right">
    	<li class="active"><a href="${pageContext.request.contextPath}/login">Sign In</a></li>
    	<li class="active"><a href="${pageContext.request.contextPath}/register">Register</a></li>
    </ul>
    
    </section>

  </nav>
    <ul class="breadcrumbs">
    	<li></li>
	    <li><a href="#">Home</a></li>
	    <!--  
	    <li><a href="#">Features</a></li>
	    <li class="unavailable"><a href="#">Gene Splicing</a></li>
	    <li class="current"><a href="#">Cloning</a></li>
	    -->
	    <li></li>
	</ul>
	
</div>
