<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, tables.Patients" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
		<script src="js/jquery-3.3.1.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<link href='fullcalendar/fullcalendar.min.css' rel='stylesheet' />
		<link href='fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />
		<script src='fullcalendar/lib/moment.min.js'></script>
		<script src='fullcalendar/fullcalendar.min.js'></script>
		<link rel="stylesheet" href="css/DoctorLogin.css?v={222}">
<title>Insert title here</title>
</head>
<body>
<%
	HttpSession session1=request.getSession(false);
		List<Patients> patientList=(List)session1.getAttribute("patientList");
	%>
	<div class="container-fluid">
    <!-- Sidebar -->
    <div class="col-lg-2">
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Menu</h3>
        </div>

        <ul class="list-unstyled components">
            <li class="active" id="dashboardTab">
                <a href="#MyDashboard">My Dashboard</a>   
            </li>
            <li id="patientDetailsTab">
                <a href="#">Patient Details</a>
            </li>
            <li>
                <a href="#">Portfolio</a>
            </li>
        </ul>

    </nav>
    </div>
    
    <div id="calendar" class="col-lg-10 col-lg-offset-2">	
    </div>
    
    <div id="patientDetailsPanel" class="col-lg-10 col-lg-offset-2">
    	<table>
	    	<tr>
	    		<th>Patient Id</th>
	    		<th>Patient Name</th>
	    		<th>Gender</th>
	    		<th>DOB</th>
	    	</tr>
	    	
	    	<%for(int i=0;i<patientList.size();i++){ 
	    		Patients patient=patientList.get(i);
	    	%>
		    	<tr>
		    		<th><%=patient.getPatient_id() %></th>
		    		<th><%=patient.getFirst_name()+' '+patient.getLast_name() %></th>
		    		<th><%=patient.getGender() %></th>
		    		<th><%=patient.getDob() %></th>
		    	</tr>
	    	<%} %>
    	</table>
    </div>
   
</div>
	<script>

  $(document).ready(function() {
	
	$("#patientDetailsPanel").hide();
    $('#calendar').fullCalendar({
    	header: {
        left: 'prev,next today',
        center: 'title',
        right: 'month,basicWeek,basicDay'
      },
      defaultDate: '2018-03-12',
      navLinks: true, // can click day/week names to navigate views
      editable: true,
      eventLimit: true, // allow "more" link when too many events
      events: [
        {
          title: 'All Day Event',
          start: '2018-03-01'
        },
        {
          title: 'Long Event',
          start: '2018-03-07',
          end: '2018-03-10'
        },
        {
          id: 999,
          title: 'Repeating Event',
          start: '2018-03-09 16:00:00'
        },
        {
          id: 999,
          title: 'Repeating Event',
          start: '2018-03-16 16:00:00'
        },
        {
          title: 'Conference',
          start: '2018-03-11',
          end: '2018-03-13'
        },
        {
          title: 'Meeting',
          start: '2018-03-12 10:30:00',
          end: '2018-03-12 12:30:00'
        },
        {
          title: 'Lunch',
          start: '2018-03-12 12:00:00'
        },
        {
          title: 'Meeting',
          start: '2018-03-12 14:30:00'
        },
        {
          title: 'Happy Hour',
          start: '2018-03-12 17:30:00'
        },
        {
          title: 'Dinner',
          start: '2018-03-12 20:00:00'
        },
        {
          title: 'Birthday Party',
          start: '2018-03-13 07:00:00'
        },
        {
          title: 'Click for Google',
          url: 'http://google.com/',
          start: '2018-03-28'
        }
      ]
    });

  });
  
  $("#patientDetailsTab").click(function(){
		$("#calendar").hide();
		$("#patientDetailsPanel").show();
	});
  
  $("#dashboardTab").click(function(){
	  $("#patientDetailsPanel").hide();
		$("#calendar").show();
		
	});

</script>
</body>
</html>