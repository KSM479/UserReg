package com.Project;
import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testsetEmail() {
		String email= "ksm469@nyu.edu";
		User user1 = new User();
		user1.setEmail("ksm469@nyu.edu");
		assertEquals(email,user1.getEmail());
		System.out.println("Test for valid email passed");
	}
	@Test
	public void testsetPassword() {
		String password = "Kalpan12345!";
		User user1 = new User();
		user1.setPassword("Kalpan12345!");
		assertEquals(password,user1.getPassword());
		System.out.println("Test for valid password passed");
	}
	@Test
	public void testName() {
		String Name = "Kalpan Mehta";
		User user1 = new User();
		user1.setFirstName("Kalpan");
		user1.setLastName("Mehta");
		assertEquals(Name,user1.getFirstName()+" "+user1.getLastName());
		System.out.println("Test for valid name passed");
		
	}
	@Test
	public void testBirstDate() {
		int month = 7;
		int day = 30;
		int year = 1997;
		User user1 = new User();
		user1.setMonth(7);
		user1.setDay(30);
		user1.setYear(1997);
		assertEquals(month+"/"+day+"/"+year,user1.getMonth()+"/"+user1.getDay()+"/"+user1.getYear());
		System.out.println("Test for valid date of birth passed");
	}
	@Test
	public void testGender() {
		String gender = "male";
		User user1 = new User();
		user1.setGender("Male");
		assertEquals(gender,user1.getGender());
		System.out.println("Test for valid gender passed");
	}	
}