package com.gmail.s.granovskiy;

import java.util.Scanner;
import com.gmail.s.granovskiy.MyException;

public class Main {

	public static void main(String[] args) {
		// creating group object
		Group group = new Group();
			
		/*  creating 11 objects of Student class using constructor  */ 
		Student student1 = new Student(000001, "Mike", "Tomson", 22, true, true);
		Student student2 = new Student(000002, "Tina", "Dobson", 21, false, false);
		Student student3 = new Student(000003, "Lina", "Sheer", 22, false, false);
		Student student4 = new Student(000004, "Luka", "Sheer", 21, true, false);
		Student student5 = new Student(000005, "Luka", "Saheer", 21, true, false);
		Student student6 = new Student(000006, "Tom", "Taheer", 21, true, true);
		Student student7 = new Student(000007, "Ted", "Liber", 20, true, false);
		Student student8 = new Student(000010, "Rick", "Trauben", 20, true, false);
		Student student9 = new Student(000011, "Rob", "Tratilaus", 20, true, false);
		Student student10 = new Student(000012, "Rick", "Macron", 20, true, false);
		Student student11 = new Student(000013, "Steeve", "Gorilla", 21, true, true);
		
		/*  try/catch and work with exception  */
		try { 
				group.addStudent(student1);
				group.addStudent(student2);
				group.addStudent(student3);
				group.addStudent(student4);
				group.addStudent(student5);
				group.addStudent(student6);
				group.addStudent(student7);
				group.addStudent(student8);
				group.addStudent(student9);
				group.addStudent(student10);
				group.addStudent(student11);
				
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		/*  see the state of the group object after adding 11 student objects */
		System.out.println(group);
		
		/*  calling method deleteStudent  */
		group.deleteStudent(000005);
		
		/*  see the state of the group object after deleting a student */
		System.out.println(group);
		
		/*  creating new object: student53 of Student class  */
		Student student53 = new Student(000053, "Mike", "Tyson", 58, true, true);
		
		/*  adding object student53 to the group object with try/catch  */
		try { 
			group.addStudent(student53);
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		/*  see the state of the group object after adding student53 */
		System.out.println(group);

		System.out.println();
		
		/*  calling method searchStudent and printing what the method returns  */
		System.out.println("The searched student is found: " + group.searchStudent("Dobson"));
		
		/*  Starting dialog with a user  */
		System.out.println();
		System.out.print("Do you want to enter more student data? Please, type: Y/N.");
		
		/*  scanner work   */
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println();
		
		/*  conditional statement  */
		if(word.equals("Y")) {
			System.out.print("OK! Let's get started! ");
			System.out.println(group.getInfoAndAddStudent());  //  calling method getStudentInfo() from Group class
		}else {
			System.out.println("Well... Maybe next time...  :).  Good-bye! ");
		}	
		
		/*  see the state of the group object after adding new student object */
		System.out.println(group);
		
		sc.close();
	}

}
