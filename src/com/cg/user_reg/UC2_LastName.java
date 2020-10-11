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
public class UC2_LastName {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
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
		System.out.println("Enter your Last name: ");
		String last_name=sc.nextLine();
		boolean check2=true;
		while(check) {
		if(Pattern.matches("[A-Z][a-zA-Z]{2,}",last_name))
			check=false;
		else {
			System.out.println("Invalid Last Name");
			System.out.println("Enter your Last Name: ");
		    last_name=sc.nextLine();
		 }	
	    }

		sc.close();

	}

}
