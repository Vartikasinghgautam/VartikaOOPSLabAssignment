package com.vartikasingh.departmentservices;

public class AdminDepartment extends SuperDepartment {
	/*
	 * departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD 


	 Welcome to Admin Department
Complete your documents submission
Complete by EOD 
Today is not a Holiday


	 */
	
public AdminDepartment()
	
	{
		
	}
		@Override
		public String departmentName()
		{
			return " Welcome to Admin Department";
		}
		@Override
		public String getTodaysWork()
		{
			return  " Complete your documents Submission ";		
		}
		@Override
		public String getWorkDeadline()
		{
		return "Complete by EOD";
		}
		@Override 
		public String isTodayAHoliday()
		{
			return " Today is not a holiday";
		}
	
}






