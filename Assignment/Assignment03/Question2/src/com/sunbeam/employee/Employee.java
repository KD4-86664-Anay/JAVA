package com.sunbeam.employee;

public class Employee {
String firstName;
String lastName;
double salary;
public Employee(String firstName, String lastName, double salary) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	if(salary<0)
	{
		
	}else {
		this.salary = salary;	
	}
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
