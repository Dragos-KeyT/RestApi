package tests;

import org.testng.annotations.Test;

public class TestUserDetails {
	
	@Test
	public void testUser() {
		
		User user =  new User();
		user.setCity("Iasi");
		user.setFirstName("Ion");
		user.setLastName("Popescu");
		
		
		System.out.println(user.getCity());
		
	}

}
