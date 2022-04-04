package week3.day1.org.student;

import week3.day1.org.college.College;
import week3.day1.org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("The student name is Priya");
		
	}
	
	public void studentDepartment()
	{
		System.out.println("The student department is ECE");
		
	}
	
	public void studentID()
	{
		System.out.println("The student ID is 351741");
	}
	
	public void collegeName()
	{
		System.out.println("The student belongs to AC college");
		
	}
	
	public static void main(String args[])
		{
		
		Student myStudent = new Student();
	
		//methods from student class
		
		myStudent.studentName();
		myStudent.studentID();
		myStudent.studentDepartment();
		
		//methods from parent-Department class

		myStudent.deptName();
		
		//methods from grandparent-College class
		
		myStudent.collegeName();
		myStudent.collegeRank();
		myStudent.collegeCode();
		
		//Accessing college method by creating object for college class
		
		College myCollege = new College();
		myCollege.collegeName();
		
	}
	
}
