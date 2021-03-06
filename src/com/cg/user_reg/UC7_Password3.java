package com.cg.user_reg;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UC7_Password3 {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
	valid_FirstName();
    valid_LastName();
    valid_Email();
    valid_MobileNo();
    valid_Password();
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
	if(Pattern.matches("^[a-zA-Z]+[.]?[a-zA-Z]*@[a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]*$",email))
		check=false;
	else {
		System.out.println("Invalid Email");
		System.out.println("Enter your Email ID: ");
	    email=sc.nextLine();
	 }	
    }
  }

public static void valid_MobileNo() {
	System.out.println("Enter your Mobile No.: ");
	String mobile=sc.nextLine();
	boolean check=true;
	while(check) {
	if(Pattern.matches("([1-9]{1,4})[\\s]([1-9])([0-9]{9})",mobile))
		check=false;
	else {
		System.out.println("Invalid Mobile");
		System.out.println("Enter your Mobile No.: ");
	    mobile=sc.nextLine();
	 }	
    }
   }

public static void valid_Password() {
	System.out.println("Enter your Password: ");
	String password=sc.nextLine();
	boolean check=true;
	while(check) {
	if(Pattern.matches(".{8,}",password))
		check=false;
	else {
		check=true;
		System.out.println("Minimum 8 characters required");
		System.out.println("Enter your Password: ");
		password=sc.nextLine();
	}
	if(Pattern.matches(".*[A-Z]+.*",password))
			check=false;
	else {
		    check=true;
			System.out.println("Atleast one upper case required");
			System.out.println("Enter your Password: ");
			password=sc.nextLine();

	 }	
	if(Pattern.matches(".*[0-9]+.*",password))
		check=false;
    else {
    	check=true;
		System.out.println("Atleast one number required");
		System.out.println("Enter your Password: ");
		password=sc.nextLine();

     }	
    }
   }
}
