package tests;

import org.testng.annotations.Test;

public class TestPerson {

	@Test
	public void testPerson() {
		
		Person person1 = new Person("Bob", "bob@bob.com", 25);
		System.out.println(person1);
		
		
		Person person2 = new Person();
		person2.setAge(30);
		person2.setEmail("oana@oana.com");
		person2.setName("oana");
		System.out.println(person2);
	}
	
	
}
