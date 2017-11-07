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
        <div>
            <table border="1">            
                <tr>
                    <td>Username</td>
                    <td>Password</td> 
                    <td>Username</td> 
                    <td>Password</td>
                    <td>Phone</td>
                    <td>Delete</td>
                </tr>
                <#list users as user>
                        <tr>
                            <td>${user.userID}</td>
                            <td>${user.name}</td>
                            <td>${user.username}</td>
                            <td>${user.password}</td>
                            <td>${user.phone}</td>
                            <td><button onclick="deleteUserLogin('${user.userID}')">Delete</button></td>
                        </tr>
                </#list>
            </table>
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
                    <td>ID</td>
                    <td>Name</td> 
                    <td>Username</td>
                    <td>Password</td>
                    <td>Phone</td>                     
                    <td>Add</td>
                </tr>                
                <tr>
                    <td><input type="text" id="input_userID"></td>
                    <td><input type="text" id="input_name"></td>
                    <td><input type="text" id="input_username"></td>
                    <td><input type="text" id="input_password"></td>
                    <td><input type="text" id="input_phone"></td>                    
                    <td><button onclick="addUserLogin()">Add</button></td>
                </tr>
            </table>
        </div>
      </div>
    </div>
    <div id="columnRight">
       
      </div>
     
    </div>
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
    
</body>

</html>