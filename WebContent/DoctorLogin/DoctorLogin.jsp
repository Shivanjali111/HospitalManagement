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

</script>
</body>
</html>