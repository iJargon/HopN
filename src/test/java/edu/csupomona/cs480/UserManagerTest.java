package edu.csupomona.cs480;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.csupomona.cs480.data.User;
import edu.csupomona.cs480.data.provider.FSUserManager;
import edu.csupomona.cs480.data.provider.UserManager;

public class UserManagerTest {

	@Test
	public void getUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setId("010294782");
		user.setName("Matthew Kim");
		user.setMajor("Psychology");
		usermanager.updateUser(user);
		
		assertEquals("Matthew Kim", usermanager.getUser("010294782").getName());
	}
	
	@Test
	public void updateUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setId("010551438");
		user.setName("John Doe");
		user.setMajor("ECE");
		usermanager.updateUser(user);
		
		assertEquals("ECE", usermanager.getUser("010551438").getMajor());
	}
	
	@Test
	public void deleteUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setId("010350834");
		user.setName("Mary Kate");
		user.setMajor("Hospitality");
		usermanager.updateUser(user);
		usermanager.deleteUser(user.getId());
		
		assertNull(usermanager.getUser(user.getId()));
	}

}
