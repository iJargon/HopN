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
    <a href="home"><img src="http://gyazo.com/fb513813a699740c7cd2dbcac7cbcafd.png"><span class="by">by</span> <img src="http://i40.tinypic.com/o7n2xg.jpg" height="25"></a>
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
  <h3>Event List</h3>
  <div class="underBar"></div>
  <div id="steps">
    <div>
            <table border="1">            
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
                        <tr><td><br/></td></tr>
                        <tr><td><br/></td></tr>
                </#list>
            </table>
  </div>
</div>
  <div id="testimonials">
    <h3>Add Event</h3>  
  <div class="underBar"></div>
    
    <div id="columnLeft">
      <div class="row cf">
        <div>
            <table border="1">
                <tr>
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
                    <td><button onclick="addEvent()">Add</button></td>
                </tr>
            </table>
        </div>
      </div>
      <div class="row cf">
        
      </div>
      <div class="row cf">
        
      </div>
    </div>

      <div class="row cf">
        
        
      </div>
    </div>
    </div>
  </div>
<div id="whatWeAnalyze">
  <h3>Query Event</h3>
    <div class="underBar"></div>
  <div class="testimonialQuote">
            <input type="text" id="query_eventID"><button onclick="getEvent()">Get</button>
            <table border="1">
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
      <h6>Herp</h6>
      <ul>
        <li><a href="#">About</a></li>
        <li><a href="#">Sign Up</a></li>
        <li><a href="#">Login to your account</a></li>
        <li><a href="#">Plans & Pricing</a></li>
        <li><a href="#">Support</a></li>
      </ul>
    </div>
    <div class="contcol">
      <h6>Creators</h6>
      <ul>
        <li><a href="#">John Canalita</a></li>
        <li><a href="#">Nandita Chauhan</a></li>
        <li><a href="#">Gretchen Lai</a></li>
        <li><a href="#">Nicole Lee</a></li>
      </ul>
    </div>
    <div class="contcol">
      <h6>Derp</h6>
      <ul>
        <li><a href="#">Home</a></li>
        <li><a href="#">Brands</a></li>
        <li><a href="#">Investors</a></li>
        <li><a href="#">Contact Inteia</a></li>
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