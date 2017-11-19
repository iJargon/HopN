<html>

<head>
    <title>CPP HopN Login/Sign Up</title>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>    
    <script src="/js/login-control.js"></script>
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
  <h1>Login or Sign Up!</h1>
  <h2>[insert pun or something here idk]</h2>
</div>
<div id="columnRight">

</div>
<div id="howItWorks">
  <h3>Login</h3>
  <div class="underBar"></div>
  <div id="steps">
    <div>
      <div id="columnLeft">
      <div class="row cf">
      <div class="icon">
          <img src="http://gyazo.com/3a986abda46bbe7bf0d2f5411e40ee5b.png">
        </div>
        <div>
            <table border="1">
                <tr>
                    <td>Username</td>
                    <td>Password</td>                     
                    <td>Login</td>
                </tr>                
                <tr>
                    <td><input type="text" id="query_id"></td>
                    <td><input type="text" id="user_password"></td>                   
                    <td><button onclick="getUserLogin()">Login</button></td>
                </tr>
            </table>
        </div>
      </div>
    </div>
  </div>
</div>
  <div id="testimonials">
    <h3>Sign Up</h3>
    <div class="underBar"></div>
    
    <div id="columnLeft">
      <div class="row cf">
      <div class="icon">
          <img src="http://gyazo.com/3a986abda46bbe7bf0d2f5411e40ee5b.png">
        </div>
        <div>
            <table border="1">
                <tr>
                    <td>Username</td>
                    <td>Name</td> 
                    <td>Password</td>
                    <td>Phone</td>                     
                    <td>Add</td>
                </tr>                
                <tr>
                    <td><input type="text" id="input_userID"></td>
                    <td><input type="text" id="input_name"></td>
                    <td><input type="text" id="input_password"></td>
                    <td><input type="text" id="input_phone"></td>                    
                    <td><button onclick="addUserLogin()">Add</button></td>
                </tr>
            </table>
        </div>
      </div>
    </div>
     
    </div>
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
    
</body>

</html>