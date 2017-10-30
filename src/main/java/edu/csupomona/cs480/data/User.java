package edu.csupomona.cs480.data;

//import java.util.Date;


/**
 * The basic user object.
 */
public class User {

    private String userID;
    private String name;
    private String username;
    private String password;
    private String phone;
    
    /** The timestamp when the user is being created */
    //private String creationTime = new Date(System.currentTimeMillis()).toString();

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getCreationTime() {
//		return creationTime;
//	}
//
//	public void setCreationTime(String creationTime) {
//		this.creationTime = creationTime;
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
