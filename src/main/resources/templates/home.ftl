<html>

<head>
    <title>CS480 Demo Web Service</title>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>    
    <script src="/js/home-control.js"></script>
</head>

<body>    
    
    <div>
        This is a simple page to demonstrate the web UI development. 
        The key tools and techniques used include:
        <ul>
            <li>HTML - Obviously</li>
            <li><a href="http://freemarker.org/">FreeMarker</a></li>
            <li><a href="http://jquery.com/">JQuery</a></li>
            <li><a href="http://api.jquery.com/jquery.ajax/">JQuery - AJAX</a></li>
        </ul>
    </div>

    <hr>

    <div>
        <div>
            <label>User List</label>
            <table border="1">            
                <tr>
                    <td>ID</td>
                    <td>Name</td> 
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
                            <td><button onclick="deleteUser('${user.userID}')">Delete</button></td>
                        </tr>
                </#list>
            </table>
        </div>
        
        <hr>
        
        <div>
            <label>Add User</label>
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
                    <td><button onclick="addUser()">Add</button></td>
                </tr>
            </table>
        </div>

        <hr>

        <div>
            <label>Query User</label>
            <input type="text" id="query_id"><button onclick="getUser()">Get</button>
            <table border="1">
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Username</td>
                    <td>Password</td>
                    <td>Phone</td>
                </tr>
                <tr>
                    <td><label id="result_userID"></td>
                    <td><label id="result_name"></td>
                    <td><label id="result_username"></td>
                    <td><label id="result_password"></td>
                    <td><label id="result_phone"></td>
                </tr>
            </table>
        </div>
    </div>
    
    <hr>
    
</body>

</html>