package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Section {
		private UUID SectionID;
		private UUID StudentID;
		private UUID EnrollmentID;
		private double grade;
		
		public UUID GetSectionID(){
	    	return this.SectionID;
		}
		public UUID GetStudentID(){
	    	return this.StudentID;
		}
		public UUID GetEnrollmentID(){
	    	return this.EnrollmentID;
		}
		public double GetGrade() {
	    	return this.grade;
	    }
		public void SetGrade(double grade) {
			this.grade = grade;
		}
		
		private Enrollment() {
			
		}
		
		public Enrollment(UUID StudentID, UUID SectionID) {
			this.StudentID = StudentID;
			this.SectionID = SectionID;
			
			}
		
			
			
		}
		
			
		}
		
		
		

	

}
