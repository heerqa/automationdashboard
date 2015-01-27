<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

  <div class="container">

<p>
<h3>Automation Dashboard</h3>
</p>



<table class="table table-hover table-striped table-bordered">
<thead>
<tr>

<th>Test Class</th>
<th>Running Test Name</th>
<th>Total Tests</th>
<th>Current Test</th>
<th>Passed Tests</th>
<th>Failed Tests</th>
<th>Browser</th>
<th>Activity Log</th>
<th>Run Startedon</th>

</tr>
</thead>
<c:forEach items="${dashboard}" var="dashboard">
<tr>
<td><a href=#>
          <span class="glyphicon glyphicon-trash" onclick="deleteSingleRow('${dashboard.id}')"></span>
        </a> &nbsp;&nbsp;<a href="runningtestdetails/${dashboard.id}">${dashboard.testclassname} </td>
<td>${dashboard.running_method_name} </td>
<td>${dashboard.totaltests} </td>
<td>${dashboard.currenttest} </td>
<td>${dashboard.test_passed } </td>
<td>${dashboard.test_failed} </td>
<td>${dashboard.browsername} </td>
<td><a href="activitylog/${dashboard.id}">running test logs </td>
<td>${dashboard.rundate} </td>

</tr>

</c:forEach>

<tbody>
</tbody>
</table>

<button class="btn btn-lg btn-primary" id="refresh" type="submit" onClick="refreshDashboard()" >Refresh Dashboard</button>

<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Delete Dashboard</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete Dashboard</h4>
      </div>
      <div class="modal-body">
        Are you sure you want to delete the Dashboard? This action cannot be undone!
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">NO</button>
        <button type="button" class="btn btn-primary"  onClick="deletDashboard()" >Delete</button>
      </div>
    </div>
  </div>
</div>

<script>
function refreshDashboard(){
location.href="<spring:url value="/automationdashboard.html"/>";	
}

window.setInterval( "refreshDashboard()", 35000);

function deleteSingleRow(id){
	$(document).ready(function(){
		  
	    $.ajax({url:"/deletesingletest/"+id+".html",success:function(result){
	    	refreshDashboard();
	    }
	  });
	});	
	
	
}

function deletDashboard(){
	$(document).ready(function(){
		  
		    $.ajax({url:"deletdashboard.html",success:function(result){
		    	refreshDashboard();
		    }
		  });
		});	
	
}
</script>