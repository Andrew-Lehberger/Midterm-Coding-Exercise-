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
	ArrayList StaffMembers = new ArrayList();
	Staff_Test.add("Mike", "J", "Smith", 07/12/1985, "1 Main St", "3024558974", "msmith@udel.edu", "Tues 3pm", 4, 95000, 02/14/2016), MR);


	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
