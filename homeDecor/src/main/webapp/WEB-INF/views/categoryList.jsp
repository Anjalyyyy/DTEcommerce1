<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link rel="stylesheet"
href="<c:url value="resources/css/bootstrap.css"/>">
<script src="<c:url value="resources/js/jquery.min.js"/>"></script>
<style>
body {
margin-top: 50px;
padding-top: 50px;
}
.button {
background-color: #4CAF50; /* Green */
border: none;
color: white;
padding: 15px 32px;
text-align: center;
text-decoration: none;
display: inline-block;
font-size: 16px;
margin: 4px 2px;
cursor: pointer;
}
.button4 {
border-radius: 50px;
}
</style>
<title>Admin - Categories</title>
</head>
<body style="background-color: #e6ffff">
<jsp:include page="header.jsp" />
<%-- 
<div class="row">
<div class="col-sm-1">
<a href="admin" class="button button4"><span><span
class=" glyphicon glyphicon-triangle-left"></span></span>Back</a>
</div>
<div class="col-sm-3">
<h2 style="text-align: center;">CATEGORY DETAILS</h2>
<table class="table">
<tr>
<td>Category ID</td>
<c:choose>
<c:when test="${!empty category.id}">
<td><form:input type="text" path="id" name="id"
disabled="true" readonly="true" /></td>
</c:when>
<c:otherwise>
<td><form:input type="text" path="id" name="id"
maxlength="20" required="true"/></td>
</c:otherwise>
</c:choose>
</tr>

<tr>
<form:input path="id" hidden="true" />
<td>Category Name</td>
<td><form:input type="text" path="name" name="name"
maxlength="30" required="true"/></td>
</tr>

<tr>
<td>Category Description</td>
<td><form:input type="text" path="description"
name="description" maxlength="500" required="true"/></td>
</tr>

<tr>
<c:if test="${!empty category.name}">
<td><input class="btn btn-success" type="submit" value="Edit Category" /></td>
</c:if> --%>

<table class="table">
    <thead>
      <tr>
        <th>Category ID</th>
        <th>Category Name</th>
        <th>Category Description</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${clist}" >
      <tr>
        <td><c:out value="${c.cid}"/></td>
        <td><c:out value="${c.name}"/></td>
        <td><c:out value="${c.description}"/></td>
      </tr>      
      </c:forEach>
    </tbody>
  </table>

${clist}