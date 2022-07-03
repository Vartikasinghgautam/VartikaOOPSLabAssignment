package com.vartikasingh.driver;

import com.vartikasingh.departmentservices.AdminDepartment;
import com.vartikasingh.departmentservices.HRDepartment;
import com.vartikasingh.departmentservices.Techdepartment;

public class Driver {
	
	public static void main(String[] args) {
	
		
		AdminDepartment admindepartment = new AdminDepartment();
		System.out.println( admindepartment.departmentName());
		System.out.println( admindepartment. getTodaysWork());
		System.out.println( admindepartment. getWorkDeadline());
		System.out.println( admindepartment. isTodayAHoliday()); 
		System.out.println(); 
		
		HRDepartment hrdepartment = new HRDepartment();
		System.out.println( hrdepartment.departmentName());
		System.out.println( hrdepartment. doActivity());
		System.out.println( hrdepartment. getTodaysWork());
		System.out.println( hrdepartment. getWorkDeadline());
		System.out.println( hrdepartment. isTodayAHoliday());
		System.out.println();
		
		Techdepartment techdepartment = new Techdepartment();
		System.out.println( techdepartment.departmentName());
		System.out.println( techdepartment. getTodaysWork());
		System.out.println( techdepartment. getWorkDeadline());
		System.out.println(techdepartment. getTechStackInformation());
		System.out.println( techdepartment. isTodayAHoliday());
		
		 }
		

	}
