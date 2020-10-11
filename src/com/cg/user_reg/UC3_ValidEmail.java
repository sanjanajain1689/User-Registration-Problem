/**
 * 
 */
package com.cg.user_reg;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author sanjana
 *
 */
public class UC3_ValidEmail {
	static Scanner sc =new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	valid_FirstName();
    valid_LastName();
    valid_Email();
	}
	
	
	public static void valid_FirstName() {
		System.out.println("Enter your First name: ");
		String first_name=sc.nextLine();
		boolean check=true;
		while(check) {
		if(Pattern.matches("[A-Z][a-zA-Z]{2,}",first_name))
			check=false;
		else {
			System.out.println("Invalid First Name");
			System.out.println("Enter your First Name: ");
		    first_name=sc.nextLine();
		 }	
	    }
	  }
	
	public static void valid_LastName() {
		System.out.println("Enter your Last name: ");
		String last_name=sc.nextLine();
		boolean check=true;
		while(check) {
		if(Pattern.matches("[A-Z][a-zA-Z]{2,}",last_name))
			check=false;
		else {
			System.out.println("Invalid Last Name");
			System.out.println("Enter your Last Name: ");
		    last_name=sc.nextLine();
		 }	
	    }
      }
	
	public static void valid_Email() {
		System.out.println("Enter your Email ID: ");
		String email=sc.nextLine();
		boolean check=true;
		while(check) {
		if(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",email))
			check=false;
		else {
			System.out.println("Invalid Email");
			System.out.println("Enter your Email ID: ");
		    email=sc.nextLine();
		 }	
	    }
	  }

}
