package com.cisc181.core;


import java.util.Date;
import java.util.UUID;

public class Section extends Semester {
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public UUID CourseID(){
    	return this.CourseID;
	}
	public UUID SemesterID(){
    	return this.SemesterID;
	}
	public UUID SectionID(){
    	return this.SectionID;
	}
	public int getRoomID() {
    	return this.RoomID;
    }
	
	public Section(String FirstName, String MiddleName, String LastName, Date DOB, String Major, String Address,
			String Phone_number, String Email, String CourseName, int Gradepoints, Date StartDate, Date EndDate, int RoomID) {
		super(FirstName, MiddleName, LastName, DOB, Major, Address, Phone_number, Email, CourseName, Gradepoints, StartDate,
				EndDate);
		this.CourseID = UUID.randomUUID();
		this.SemesterID = UUID.randomUUID();
		this.SectionID = UUID.randomUUID();
		this.RoomID = RoomID;
		
	}
	

	
	
	

	

}
