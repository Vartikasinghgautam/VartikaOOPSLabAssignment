package com.vartikasingh.departmentservices;

public class HRDepartment extends SuperDepartment {
	/*
	 * departmentName will return “ Hr Department “
getTodaysWork will return  “ Fill today’s worksheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
	doActivity “team Lunch”
	
	
	 Welcome to HR Department
team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD 
Today is not a Holiday

	
		 */
		
	public HRDepartment()
		
		{
			
		}
		@Override
		public String departmentName()
		{
				return " Welcome to HR Department";
		}
		
		public String doActivity()
		{
			return " team Lunch";
		}
		@Override
		public String getTodaysWork()
		{
			return  " Fill today's timesheet and mark your attendance ";		
		}
		@Override
		public String getWorkDeadline()
		{
			return " Complete by EOD";
		}
		@Override
		public String isTodayAHoliday()
		{
			return " Today is not a holiday";
		}
	
	
	}


