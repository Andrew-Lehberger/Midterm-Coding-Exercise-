package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

	public class Course extends Student {
		private UUID CourseID;
		private String CourseName;
		private int Gradepoints;
		private eMajor Major;
		
		 public UUID CourseID(){
		    	return this.CourseID;
		 }
		
		public String getCourseName ( )
	    {
	        return this.CourseName;
	    }
	    public void setCourseName (String CourseName)
	    {
	        this.CourseName = CourseName;    
	    }
	    public void setGradepoints(int Gradepoints) {
	    	this.Gradepoints = Gradepoints;
	    }
	    public int getGradepoints() {
	    	return this.Gradepoints;
	    }
	    
	    
	    public Course(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
				String Address, String Phone_number, String Email, String CourseName, int Gradepoints)
		{
			super(FirstName, MiddleName, LastName, DOB, Major, Address, Phone_number, Email);
			this.CourseID = UUID.randomUUID();
			this.CourseName = CourseName;
			this.Gradepoints = Gradepoints;
			this.Major = Major;
		
		
		
		
		
	}}


