<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

  <div class="container">

<p>
<h3>Running Test Details</h3>
</p>
<a href="/automationdashboard.html" class="btn btn-default btn-sm pull-right">
          <span class="glyphicon glyphicon-share-alt"></span> Dashboard Page
 </a>


<table class="table table-hover table-striped table-bordered">
<thead>
<tr>

<th>Test Name</th>
<th>Status</th>
<th>Error Details</th>
<th>Run DateTime</th>

</tr>
</thead>
<c:forEach items="${dashboardTestRun}" var="dashboardTestRun">
<tr>
<td>${dashboardTestRun.methodName} </td>
<td>${dashboardTestRun.status} </td>
<td>${dashboardTestRun.errorMessage} </td>
<td>${dashboardTestRun.creationdate} </td>
</tr>

</c:forEach>

<tbody>
</tbody>
</table>