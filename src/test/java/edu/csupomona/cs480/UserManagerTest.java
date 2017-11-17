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
		user.setUserID("mk2");
		user.setName("Matthew Kim");
		user.setPassword("king");
		user.setPhone("218-459-0254");
		usermanager.updateUser(user);
		
		assertEquals("Matthew Kim", usermanager.getUser("mk2").getName());
	}
	
	@Test
	public void updateUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setUserID("jd2");
		user.setName("John Doe");
		user.setPassword("alsdfbaekf");
		user.setPhone("524-896-1345");
		usermanager.updateUser(user);
		
		assertEquals("524-896-1345", usermanager.getUser("jd2").getPhone());
	}
	
	@Test
	public void deleteUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setUserID("mk1");
		user.setName("Mary Kate");
		user.setPassword("twin1");
		user.setPhone("123-456-7890");
		usermanager.updateUser(user);
		usermanager.deleteUser(user.getUserID());
		
		assertNull(usermanager.getUser(user.getUserID()));
	}

}
