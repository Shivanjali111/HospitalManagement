<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
		<script src="../js/jquery-3.3.1.js"></script>
		<script src="../bootstrap.min.js"></script>
		<link href='../fullcalendar/fullcalendar.min.css' rel='stylesheet' />
		<link href='../fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />
		<script src='../fullcalendar/lib/moment.min.js'></script>
		<script src='../fullcalendar/fullcalendar.min.js'></script>
		<link rel="stylesheet" href="../css/DoctorLogin.css?v={222}">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
    <!-- Sidebar -->
    <div class="col-lg-2">
    <nav id="sidebar">
        <div class="sidebar-header">
            <h3>Menu</h3>
        </div>

        <ul class="list-unstyled components">
            <li class="active">
                <a href="#MyDashboard">My Dashboard</a>   
            </li>
            <li>
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
   
</div>
	<script>

  $(document).ready(function() {
	
	
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
      events:{
    	  url: 'events.json',
      }
    });

  });

</script>
</body>
</html>