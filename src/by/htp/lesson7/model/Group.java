package by.htp.lesson7.model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private Student[] students;
	private int studentsCounter;

	public void setStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void addStudents(Student student) {
		if (this.students != null) {
			if (studentsCounter < students.length) {
				students[studentsCounter] = student;
				studentsCounter++;
			} else {
				// Мы уперлись в размер старого массива(он заполнен) и теперь мы создаем новый
				// массив
				Student[] studgroup = new Student[this.students.length + 1];
				for (int i = 0; i < this.students.length; i++) {
					studgroup[i] = this.students[i];
				}
				this.students = studgroup;
				this.students[studentsCounter] = student;
				studentsCounter++;
			}
		} else {
			this.students = new Student[5];
			this.students[0] = student;
			studentsCounter++;
		}
	}

	public void printStudents() {

		SimpleDateFormat sdfbd = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdfjy = new SimpleDateFormat("yyyy");

		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				int n = i + 1;
				System.out.println("Student #" + n + " " + this.students[i].name + " " + this.students[i].surname
						+ " BirthDate:" + sdfbd.format(this.students[i].birthDate) + " JoinDate:"
						+ sdfjy.format(this.students[i].joinYear) + " Age:" + this.students[i].age);
			}

		}

	}

	public void avrAge() {
		int summ = 0;
		int notnull = 0;
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				summ = summ + this.students[i].age;
				notnull++;
			}
		}
		summ = summ / notnull;
		System.out.println("\nAverage age = " + summ);
	}

	public void joinNumberByYear() {
		int number = 0;
		String JoinDate;
		SimpleDateFormat sdfjy = new SimpleDateFormat("yyyy");

		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {
				JoinDate = sdfjy.format(this.students[i].joinYear);
				if (JoinDate.equals("2015")) {
					number++;
				}

			}
		}
		System.out.println("Number of students in this Year = " + number);

	}

	public void mostJoined() {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String JoinDate;

		SimpleDateFormat sdfjy = new SimpleDateFormat("yyyy");

		for (int i = 0; i < this.students.length; i++) {

			if (this.students[i] != null) {
				JoinDate = sdfjy.format(this.students[i].joinYear);

				switch (JoinDate) {
				case "2015":
					a++;
					break;
				case "2016":
					b++;
					break;
				case "2017":
					c++;
					break;
				case "2018":
					d++;
					break;
				}

			}
		}
		
		int max = a;
		int maxyear = 2015;
		if(b>max) {
			max = b;
			maxyear = 2016;
		}else if(c>max) {
			max = c;
			maxyear = 2017;
		}else if(d>max) { 
			max = d;
			maxyear = 2018;
		}
				
		System.out.println("Max number of Joined was in " + maxyear + " with number = " + max);

	}

	public void bubbleSortAge() {
		for (int i = this.students.length-1; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				if(this.students[j+1] !=null)
				if(this.students[j].age > this.students[j+1].age) {
					Student tmp = this.students[j];
					this.students[j] = this.students[j+1];
					this.students[j+1] = tmp;
				}
				
			}
			
		}
		
	}
	
	public void insertionSortAge() {
		
		for(int i = 1; i <  this.students.length; i++) {
			if(this.students[i] != null) {
				Student key = this.students[i];
				int j = i-1;
			
				while(j >= 0 && this.students[j].age >key.age) {
					this.students[j+1] = this.students[j];
					j = j-1;
				}
				
				this.students[j+1] = key;
			}
		}
	}
	
	public void selectionSortAge() { 
		int min = 0; 
		int min_i = 0;
		
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i] != null) {
				min = this.students[i].age;
				min_i = i;
			}
			for(int j = i + 1; j < this.students.length; j++) {
					if(this.students[j] != null && this.students[j].age < min) {
						min = this.students[j].age;
						min_i = j;
					}
			}
			if (i != min_i && this.students[i] != null) {
				Student tmp = this.students[i];
				this.students[i] = this.students[min_i];
				this.students[min_i] = tmp;
			}
			
		}
	}
	
	public void quickSortAge() {
		Arrays.sort(students ,new Comparator<Student>() {
			
			@Override
			public int compare(Student l, Student r) {
				if(l == null) {
					return 1;
				}else if(r == null){
					return -1;
				} else
				{
					return l.age-r.age;	
				}
			}
		});
	}
	
	
	
}
