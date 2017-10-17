package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> CourseList = new ArrayList<Course>();
		
		CourseList.add(new Course("John", "A", "Thompson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu", "CISC 181", 80));
		CourseList.add(new Course("Ryan", "J", "Muller", null, eMajor.COMPSI, "30 RiverSide DR", "3025449597", "rmuller@udel.edu", "CISC 181", 70));
		CourseList.add(new Course("Mary", "A", "Smith", null, eMajor.COMPSI, "105 RiverSide DR", "3026449597", "msmith@udel.edu", "CISC 181", 90));
	
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		
		SemesterList.add(new Semester("John", "A", "Thompson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu", "CISC 181", 80, null, null));
		SemesterList.add(new Semester ("Ryan", "J", "Muller", null, eMajor.COMPSI, "30 RiverSide DR", "3025449597", "rmuller@udel.edu", "CISC 181", 70, null, null));
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		
		StudentList.add(new Student("John", "A", "Thompson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("James", "A", "Johnson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Mike", "A", "Cuban", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Ann", "A", "Jones", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Kate", "A", "Smith", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Lauren", "A", "Doe", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Andrew", "A", "Goldberg", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("AJ", "A", "Smith", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Maria", "A", "Johnson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Steve", "A", "Li", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		StudentList.add(new Student("Michelle", "A", "Thompson", null, eMajor.COMPSI, "12 RiverSide DR", "3024449597", "jthompson@udel.edu"));
		
	
	}

	@Test
	public void test() {
		assertEquals(80, (CourseList.getGradePoints()/3));
	}
}