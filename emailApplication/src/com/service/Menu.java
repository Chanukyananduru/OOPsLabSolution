package com.service;

import java.util.Scanner;

import com.entity.Employee;

public class Menu {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name:");
		String firstname = sc.next();
		System.out.println("Enter the last name:");
		String lastname = sc.next();
		
		Employee emp = new Employee (firstname,lastname);
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int i = sc.nextInt();
		sc.close();
		
		switch (i){

        case 1: emp.setDept("Technical") ; break;
        case 2: emp.setDept("Admin") ; break;
        case 3: emp.setDept("HR") ; break;
        case 4: emp.setDept("Legal") ; break;
        
        default : System.out.println("Invalid entry!");

    }
		System.out.println("Generating credentials for "+ emp.getFirstName() +" "+ emp.getLastName() +" from "+ emp.getDept()+" Department...");
		
		CredentialService ser = new CredentialService ();
		
		ser.generateEmailAddress(emp.getFirstName(),emp.getLastName(),emp.getDept());
		ser.generatePassword();
		ser.showCredentials(emp.getFirstName());

		
	}

}
