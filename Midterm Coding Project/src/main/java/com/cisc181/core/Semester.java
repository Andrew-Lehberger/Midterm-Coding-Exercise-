package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester extends Course {
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public UUID SemesterID(){
    	return this.SemesterID;
	}
	public Date getStartDate ( )
	{
    return this.StartDate;
	}
	public void setStartDate (Date StartDate)
	{
    this.StartDate = StartDate;    
	}
	public Date getEndDate ( )
	{
    return this.EndDate;
	}
	public void setEndDate (Date EndDate)
	{
    this.EndDate = EndDate;    
	}
	

	public Semester(String FirstName, String MiddleName, String LastName, Date DOB, String Major, String Address,
			String Phone_number, String Email, String CourseName, int Gradepoints, Date StartDate, Date EndDate) {
		super(FirstName, MiddleName, LastName, DOB, Major, Address, Phone_number, Email, CourseName, Gradepoints);
		this.SemesterID = UUID.randomUUID();
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		
	}

}
