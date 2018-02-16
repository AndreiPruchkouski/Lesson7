package by.htp.lesson7.model;

import java.util.Date;

public class Student {

	String name;
	String surname;
	Date birthDate;
	int age;
	Date joinYear;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, Date birthDate, int age, Date joinYear) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.age = age;
		this.joinYear = joinYear;
		
	}
	
	
	
}
