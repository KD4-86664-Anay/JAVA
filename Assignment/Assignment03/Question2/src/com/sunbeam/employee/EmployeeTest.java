package com.sunbeam.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Raja","Ram",-10000);
		System.out.println("Yearly:"+e1.getSalary()*12);
		Employee e2=new Employee("Ram","Madhav",50000.00);
		System.out.println("Yearly:"+e2.getSalary()*12);
		
		
		e1.setSalary(e1.salary+=e1.salary/10);
		System.out.println("Yearly:"+e1.getSalary()*12);

		e2.setSalary(e2.salary+=e2.salary/10);
		System.out.println("Yearly:"+e2.getSalary()*12);
		
	}

}
