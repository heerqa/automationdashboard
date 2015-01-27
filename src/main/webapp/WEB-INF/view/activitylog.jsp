<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

  <div class="container">

<p>
<h3>Running Test Live Updates</h3>
</p>
<a href="/automationdashboard.html" class="btn btn-default btn-sm pull-right">
          <span class="glyphicon glyphicon-share-alt"></span> Dashboard Page
 </a>


<table class="table table-hover table-striped table-bordered">
<thead>
<tr>
<th>Time</th>
<th>Current Activity</th>


</tr>
</thead>
<c:forEach items="${activityLog}" var="activityLog">
<tr>
<td>${activityLog.date} </td>
<td>${activityLog.currentactivity} </td>


</tr>

</c:forEach>

<tbody>
</tbody>
</table>
<script>


function getActivityLog(){
	location.reload(); 
	
}

window.setInterval( "getActivityLog()", 10000);
</script>