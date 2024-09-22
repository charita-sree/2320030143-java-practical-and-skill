package com.student;

public class MainApp {

	public static void main(String[] args) {
		 StudentInformationSystem sis = new StudentInformationSystem();

	        Student student1 = new Student("John Doe", 20, "S12345");
	        Student student2 = new Student("Jane Doe", 21, "S54321");

	        sis.registerStudent(student1);
	        sis.registerStudent(student2);

	        Course mathCourse = new Course("Math 101", "MTH101");
	        Course physicsCourse = new Course("Physics 101", "PHY101");

	        sis.addCourse(mathCourse);
	        sis.addCourse(physicsCourse);

	        sis.enrollStudentInCourse(student1, mathCourse);
	        sis.enrollStudentInCourse(student2, physicsCourse);

	        System.out.println("Registered Students:");
	        for (Student student : sis.getAllStudents()) {
	            System.out.println("Name: " + student.getName() + ", ID: " + student.getStudentID());
	        }

	        System.out.println("\nAvailable Courses:");
	        for (Course course : sis.getAllCourses()) {
	            System.out.println("Course: " + course.getCourseName() + ", Code: " + course.getCourseCode());
	        }
	    
	}

}
