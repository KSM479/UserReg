package com.Project;
import java.time.LocalDate;
import java.util.*;

import com.Project.User;
import com.Project.UserDAO;

public class accountUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the Account sign up page.\n");
		
		System.out.println(" ******** \n");
		
		User new_user = new User();
		Scanner scan = new Scanner(System.in);
		
		inputFirstName(new_user, scan);
		inputLastName(new_user, scan);
		inputEmailAddress(new_user, scan);
		inputPassword(new_user, scan);
		inputDay(new_user, scan);
		inputMonth(new_user, scan);
		inputYear(new_user, scan);
		inputGender(new_user, scan);
		
		
		System.out.println("******* \n "
				+ "User created successfully!");
		
	    UserDAO users = new UserDAO();
	    users.addUser(new_user);
	    users.printUserInfo(new_user);
	}
	
	private static void inputFirstName(User new_user, Scanner scan) {
		System.out.println("Please enter your first name:");
		while (true) {
			String s = scan.next();
			new_user.setFirstName(s);
			if (s.toLowerCase().equals(new_user.getFirstName())) {
				break;
			}
			System.out.println("Please enter a valid first name: ");
		}
		System.out.println();
	}
	
	private static void inputLastName(User new_user, Scanner scan) {
		System.out.println("Please enter your Last name:");
		while (true) {
			String s = scan.next();
			new_user.setLastName(s);
			if (s.toLowerCase().equals(new_user.getLastName())) {
				break;
			}
			System.out.println("Please enter a valid Last name: ");
		}
		System.out.println();
	}
	
	private static void inputEmailAddress(User new_user, Scanner scan) {
		System.out.println("Please enter your Email Address:");
		while (true) {
			String s = scan.next();
			new_user.setEmail(s);
			if (s.equals(new_user.getEmail())) {
				break;
			}
			System.out.println("Please enter a valid Email Address");
		}
		System.out.println();
	}
	
	private static void inputPassword(User new_user, Scanner scan) {
		System.out.println("Please enter your Password:");
		while (true) {
			String s = scan.next();
			new_user.setPassword(s);
			if (s.equals(new_user.getPassword())) {
				break;
			}
			System.out.println("Please enter a valid Password");
		}
		System.out.println();
	}
	private static void inputDay(User new_user, Scanner scan) {
		int day = 0;
		System.out.println("Please enter your birth year: ");
		day = scan.nextInt();
		new_user.setDay(day);
	}
	private static void inputMonth(User new_user, Scanner scan) {
		int month = 0;
		System.out.println("Please enter your birth year: ");
		month = scan.nextInt();
		new_user.setMonth(month);
	}
	private static void inputYear(User new_user, Scanner scan) {
		int year = 0;
		System.out.println("Please enter your birth year: ");
		year = scan.nextInt();
		new_user.setYear(year);
	}
	

	
	private static void inputGender(User new_user, Scanner scan) {
		System.out.println("Please choose a gender: ");
		String s = scan.next();
		new_user.setGender(s);
	
	}

}