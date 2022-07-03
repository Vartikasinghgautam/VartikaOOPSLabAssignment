package com.vartikasingh.departmentservices;

public class Techdepartment extends SuperDepartment {
	/*
	 * departmentName will return “ Tech Department “
getTodaysWork will return  “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”
		
		
 Welcome to Tech Department
Complete coding of Module 1
Complete by EOD 
 Core Java 
Today is not a Holiday

	 */
	
	public Techdepartment()
	
	{
		
	}
	@Override
		public String departmentName()
		{
			return " Welcome to Tech Department";
		}
	@Override
		public String getTodaysWork()
		{
			return  " Complete coding of Module 1 ";		
		}
	@Override
		public String getWorkDeadline()
		{
			return " Complete by EOD";
		}
		
		public String getTechStackInformation()
		{
			return " Core Java";
		}
		@Override
		public String isTodayAHoliday()
		{
			return " Today is not a holiday";
		}


}

