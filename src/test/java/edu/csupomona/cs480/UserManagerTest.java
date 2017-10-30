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
		user.setUsername("KARDBM");
		user.setPassword("king");
		user.setPhone("218-459-0254");
		usermanager.updateUser(user);
		
		assertEquals("Matthew Kim", usermanager.getUser("010294782").getName());
	}
	
	@Test
	public void updateUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setId("010551438");
		user.setName("John Doe");
		user.setUsername("j0hnd0e");
		user.setPassword("alsdfbaekf");
		user.setPhone("524-896-1345");
		usermanager.updateUser(user);
		
		assertEquals("524-896-1345", usermanager.getUser("010551438").getPhone());
	}
	
	@Test
	public void deleteUserTest() {
		UserManager usermanager = new FSUserManager();
		User user = new User();
		user.setId("010350834");
		user.setName("Mary Kate");
		user.setUsername("mknoashley");
		user.setPassword("twin1");
		user.setPhone("123-456-7890");
		usermanager.updateUser(user);
		usermanager.deleteUser(user.getId());
		
		assertNull(usermanager.getUser(user.getId()));
	}

}
