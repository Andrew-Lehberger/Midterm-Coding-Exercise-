package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import antlr.collections.List;



public class Staff_Test {
	
	@Test
	public void test1() {
		
	
	ArrayList<Staff> StaffMembers = new ArrayList<Staff>();
	
	StaffMembers.add(new Staff("Mike", "J", "Smith", Person.getDOB(), "1 Main St", "3024558974", "msmith@udel.edu", "Tues 3pm", 4, 95000.00, null, eTitle.MR));
	StaffMembers.add(new Staff("Mary", "E", "Jones", Person.getDOB(), "4 Oak St", "3024758074", "mjones@udel.edu", "Tues 3pm", 4, 105000.00, null, eTitle.MRS));
	StaffMembers.add(new Staff("Karen", "M", "Miller", Person.getDOB(), "20 Main St", "3024058111", "kmiller@udel.edu", "Thurs 3pm", 4, 75000.00, null, eTitle.MS));
	StaffMembers.add(new Staff("Tom", "A", "Rodgers", Person.getDOB(), "570 Maple Rd", "3028762309", "trodgers@udel.edu", "Thurs 3pm", 4, 175000.00, null, eTitle.MR));
	StaffMembers.add(new Staff("Jose", "R", "Lopez", Person.getDOB(), "17 Main St", "3025055174", "jlopez@udel.edu", "Tues 1pm", 4, 100000.00, null, eTitle.MR));

	assertEquals(110,000, (StaffMembers.getSalary()/5));
	
	try {
			Staff.DOB.isEmpty();
			Staff.hireDate.isEmpty();}
		
		catch(PersonException p) {
			
		}
		
		
		
	}
	
	}
	
	
			



}
