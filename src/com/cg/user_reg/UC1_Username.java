package com.cg.user_reg;
import java.util.*;
import java.util.regex.Pattern;

public class UC1_Username {
 public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your first name: ");
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
	sc.close();
  }
}
