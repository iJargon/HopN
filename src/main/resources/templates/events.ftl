<html>

<head>
    <title>CPP HopN Events Page</title>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>    
    <script src="/js/event-control.js"></script>
    <link rel="stylesheet" href="/css/stylesheet.css">
</head>

<body>    
    <div id="header" class="cf">
  <div id="logo">
    <a href="home"><img src="http://i63.tinypic.com/rrrsyw.jpg" height="40"><span class="by">by</span><img src="http://i63.tinypic.com/w14s4w.jpg" height="25"></a>
  </div>
  <div id="menu">
    <ul>
      <li class="button signup"><a href="login">Sign Up</a></li>
      <li class="button login"><a href="login">Login</a></li>
      <li class="lastLink menuLink"><a href="#">About</a></li>
      <li class="menuLink"><a href="events">Look for Events</a></li>
      <li class="menuLink"><a href="home">Home</a></li>
  </div>
</div>
<div id="splashBar">
  <h1>Current Events Available</h1>
  <h2>[insert pun or something here idk]</h2>
</div>
<div id="columnRight">

</div>
<div id="howItWorks">
  <h3>Events List</h3>
  <div class="underBar"></div>
  <div id="steps">
            <table border="1" width="100%">            
                <tr>
                    <td>ID</td>
                    <td>Name</td> 
                    <td>Location</td> 
                    <td>Date</td>
                    <td>Start Time</td>
                    <td>End Time</td>
                    <td>Delete</td>
                </tr>
                <tr><td><br/></td></tr>
                <#list events as event>
                        <tr>
                            <td>${event.eventID}</td>
                            <td>${event.name}</td>
                            <td>${event.location}</td>
                            <td>${event.date}</td>
                            <td>${event.start_time}</td>
                            <td>${event.end_time}</td>
                            <td><button onclick="deleteEvent('${event.eventID}')">Delete</button></td>
                        </tr>
                        <tr>
                        	    <td>${event.driver}</td>
                            <td>${event.p1}</td>
                            <td>${event.p2}</td>
                            <td>${event.p3}</td>
                            <td>${event.p4}</td>
                        </tr>
                        <tr>
                        		<td><button onclick="driverEvent('${event.eventID}')">Driver</button></td>
                        		<td><button onclick="p1Event('${event.eventID}')">Passenger 1</button></td>
                        		<td><button onclick="p2Event('${event.eventID}')">Passenger 2</button></td>
                        		<td><button onclick="p3Event('${event.eventID}')">Passenger 3</button></td>
                        		<td><button onclick="p4Event('${event.eventID}')">Passenger 4</button></td>
                        </tr>
                        <br/><br/>
                </#list>
            </table>
</div>
  <div id="testimonials">
    <h3>Create an Event</h3>  
  <div class="underBar"></div>
  
  <div id="steps">
            <table border="1">     
				<tr>
					<td>
						<br/>
					</td>
				</tr>			
                <tr >
                    <td>Event ID</td>
                    <td>Name</td> 
                    <td>Location</td>                     
                    <td>Date</td>
                    <td>Start Time</td>
                    <td>End Time</td>
                </tr>
                <tr>
                    <td><input type="text" id="input_eventID"></td>
                    <td><input type="text" id="input_event_name"></td>
                    <td><input type="text" id="input_event_location"></td>
                    <td><input type="text" id="input_event_date"></td> 
                    <td><input type="text" id="input_event_start_time"></td> 
                    <td><input type="text" id="input_event_end_time"></td>                     
                </tr>
                <tr align="middle">
                    <td colspan="6"><button onclick="addEvent()">Add</button></td>
                </tr>
            </table>
</div>
    </div>
    </div>
  </div>
<div id="whatWeAnalyze">
  <h3>Search for an Event</h3>
    <div class="underBar"></div>
  <div class="testimonialQuote">
            <input type="text" id="query_eventID"><button onclick="getEvent()">Get</button>
            <table border="1" width="100%">
                <tr>
                    <td>Event ID</td>
                    <td>Name</td>
                    <td>Location</td>
                    <td>Date</td>
                    <td>Start Time</td>
                    <td>End Time</td>
                </tr>
                <tr>
                    <td><label id="result_eventID"></td>
                    <td><label id="result_event_name"></td>
                    <td><label id="result_location"></td>
                    <td><label id="result_date"></td>
                    <td><label id="result_start_time"></td>
                    <td><label id="result_end_time"></td>
                </tr>
            </table>
            </div>
</div>
<div id="map">
  <div class="container cf">
    <div class="contcol">
      <h6>More</h6>
      <ul>
        <li><a href="home">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Contact Support</a></li>
      </ul>
    </div>
    <div class="contcol">
      <h6>Creators</h6>
      <ul>
        <li><a href="https://www.facebook.com/Valan12" target="_blank">John Canalita</a></li>
        <li><a href="https://www.facebook.com/nandita.chauhan.9" target="_blank">Nandita Chauhan</a></li>
        <li><a href="https://www.facebook.com/gretchy.lai" target="_blank">Gretchen Lai</a></li>
        <li><a href="https://www.facebook.com/nicolelee2412" target="_blank">Nicole Lee</a></li>
      </ul>
    </div>
    <div class="contcol">
      <h6>User</h6>
      <ul>
        <li><a href="login">Sign Up</a></li>
        <li><a href="login">Login to your account</a></li>
      </ul>
    </div>
  </div>
  <div class="container copy">
    &copy; 2017 HopN Web Service. All Rights Reserved.
  </div>
</div>
    </div>    

    </div>
    
    
</body>

</html>