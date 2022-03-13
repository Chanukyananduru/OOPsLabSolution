package com.entity;

public class Employee {
	
	 private String firstName;
	 private String lastName; 
	 private String Dept;
	 

	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName (){
		return lastName;
	}
	
	public String getDept (){
		return Dept;
	}
	
	public void setDept (String Dept){
		this.Dept = Dept;
	}

}
