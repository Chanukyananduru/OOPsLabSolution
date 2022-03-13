package com.service;

import java.util.Random;

public class CredentialService {
	
	private String email;
	private char[] password;
	
	void generatePassword(){
		String values = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789!@#$%^&~`?><,./=-|*()_+";
		Random rand = new Random();
		char[] password = new char[8];
		for (int i=0; i<8; i++) {
			password[i]= values.charAt(rand.nextInt(values.length()));
		}
	
		this.password = password;
		
	}
	
	 void generateEmailAddress(String firstName, String lastName, String Dept ) {
		this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + Dept.toLowerCase() +".greatlearning.com";
	}
	
	void showCredentials(String firstName) {
		System.out.println("Dear "+ firstName + ", your credentials are as follows:");
		System.out.println("Your email is: "+ email);
		System.out.println("Your password is: ");
		System.out.println(password);
		
	}
}
