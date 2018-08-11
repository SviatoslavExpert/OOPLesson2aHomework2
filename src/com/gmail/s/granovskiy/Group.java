package com.gmail.s.granovskiy;

import java.util.Arrays;
import java.util.Scanner;
import com.gmail.s.granovskiy.MyException;

public class Group {
	
	/*  empty array for 10 elements  */
	private Student[] studentsArray = new Student[15];
	
	/*  constructors  */
	public Group(Student[] studentsArray) {
		super();
		this.studentsArray = studentsArray;
	}

	public Group() {
		super();
	}
	
	/*  getters and setters  */
	public Student[] getStudentsArray() {
		return studentsArray;
	}

	public void setStudentsArray(Student[] studentsArray) {
		this.studentsArray = studentsArray;
	}
	
	
	/* method addStudent  */
	public void addStudent(Student student) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] == null) {
				studentsArray[i] = student;
				System.out.println(student.getLastName() + " is added to group.");
				return;
			}
		}
		throw new MyException();
	}
	
	
	/*  method deleteStudent  */
	public boolean deleteStudent(long number) { 
		for (int i = 0; i < studentsArray.length; i++) {
			if(studentsArray[i] != null && studentsArray[i].getId() == number) {
				System.out.println();
				System.out.println(studentsArray[i].getLastName() + " is deleted from the group.");
				studentsArray[i] = null;
				return true;
			}
		}
		return false;
	} 
	
	/*  method searchStudent  */
	public Student searchStudent(String searchedLastName) {
		for (Student student : studentsArray) {
			if (student != null && student.getLastName().equals(searchedLastName)) {
				return student;
			}
		}
		return null;
	}
	
	/*  method getStudentInfo  */
	public Student getInfoAndAddStudent() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Please, enter student's ID.");
		student.setId(sc.nextInt());
		
		System.out.println("Please, enter student's first name.");
		student.setFirstName(sc.next());
		
		System.out.println("Please, enter student's last name.");
		student.setLastName(sc.next());
		
		System.out.println("Please, enter student's age.");
		student.setAge(sc.nextInt());
		
		System.out.println("Please, enter if the student has passed the exams: true or false");
		student.setExamPassed(sc.nextBoolean());
		
		System.out.println("Please, enter if the student is getting the scolarship: true or false");
		student.setScholarshipReceived(sc.nextBoolean());
		
		System.out.println("Thank you. The data is entered.");
		System.out.println();
		
		
		sc.close();
		
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] == null) {
				studentsArray[i] = student;
				System.out.println(student.getFirstName() + " " + student.getLastName() + " added to group.");
				i = studentsArray.length;
			}
		}
		return student;
	}

	@Override
	public String toString() {
		System.out.println();
		return "Group [studentsArray=" + Arrays.toString(studentsArray) + "]";
	}
}
