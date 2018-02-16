package by.htp.lesson7.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.lesson7.model.Group;
import by.htp.lesson7.model.Student;

public class MainApp {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub

		//BirthDate format
		SimpleDateFormat sdfbd = new SimpleDateFormat("dd-MM-yyyy");
		//JoinDate format
		SimpleDateFormat sdfjy = new SimpleDateFormat("yyyy");
		
		//Init birth dates 
		Date br_date1 = sdfbd.parse("01-01-1987");
		Date br_date2 = sdfbd.parse("02-02-1992");
		Date br_date3 = sdfbd.parse("03-03-1998");
		Date br_date4 = sdfbd.parse("03-03-2000");
		
		//Init ages
		int age1 = 30;
		int age2 = 26;
		int age3 = 20;
		int age4 = 18;
		
		//Init years of entry
		Date join_year1 = sdfjy.parse("2015");
		Date join_year2 = sdfjy.parse("2016");
		Date join_year3 = sdfjy.parse("2017");
		Date join_year4 = sdfjy.parse("2018");
		
		//Init students
		Student stud1 = new Student("Name1", "Surname1", br_date1, age1, join_year1);
		Student stud2 = new Student("Name2", "Surname2", br_date2, age2, join_year2);
		Student stud3 = new Student("Name3", "Surname3", br_date3, age3, join_year3);
		Student stud4 = new Student("Name4", "Surname4", br_date4, age4, join_year4);
		
		//Init group (filling)
		Group gr = new Group();
		gr.addStudents(stud1);
		gr.addStudents(stud2);
		gr.addStudents(stud3);
		gr.addStudents(stud4);
		
		//Print students list 
		gr.printStudents();
		//Avg age of the students
		gr.avrAge();
		//How many hoined in 2015
		gr.joinNumberByYear();
		//In which year most of them joined
		gr.mostJoined();
		
		System.out.println("\nAfter sorting: ");
		
		//Buble sorting
//		gr.bubbleSortAge();
		
		//Insertion sorting
//		gr.insertionSortAge();
		
		//Selection sorting
//		gr.selectionSortAge();
		
		//Quick sorting
		gr.quickSortAge();
		
		
		//Print students list after the sorting
		gr.printStudents();
		
	}

}
