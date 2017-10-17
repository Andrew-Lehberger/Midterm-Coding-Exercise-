package com.cisc181.core;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception{
	private Person p;
	
	public PersonException(Person p) {
		super("Person Exception");
		this.p = p;
	}
	
	public Person getp() {
		return p;
	}
	
	public void isExcpetion(Person p)throws PersonException {
		if (p.PrintAge() > 100){
			throw new PersonException(p);
		
		}
		}
	String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
	Pattern pattern = Pattern.compile(regex);
	
	public void isPhoneException(Person p)throws PersonException{
		if( Matcher matcher = pattern.matcher(p.getPhone())) {
			throw new PersonException(p);
		}
	}
		
		}
	
	


