package com.vartikasingh;

import java.util.Scanner;

import com.vartikasingh.main.Employee;

public class Driver {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Vartika", "Singh");
		
		CredentialService cs = new CredentialService();
		String generateEmail;
		String generatedPassword;
		
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatedPassword();
			cs.showCredential(employee, generateEmail, generatedPassword);
			break;
		case 2:
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			generatedPassword = cs.generatedPassword();
			cs.showCredential(employee, generateEmail, generatedPassword);
			break;
		case 3:
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			generatedPassword = cs.generatedPassword();
			cs.showCredential(employee, generateEmail, generatedPassword);
			break;
		case 4:
			generateEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatedPassword();
			cs.showCredential(employee, generateEmail, generatedPassword);
			break;
			
			
		default: 
			System.out.println("Please choose the correct option");
			sc.close();
		}
	}
		

	}


