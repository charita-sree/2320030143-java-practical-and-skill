package com.student;
import java.util.ArrayList;
import java.util.List;

public class StudentInformationSystem {
	  private List<Student> students = new ArrayList<>();
	    private List<Course> courses = new ArrayList<>();

	    public void registerStudent(Student student) {
	        students.add(student);
	    }

	    public void addCourse(Course course) {
	        courses.add(course);
	    }

	    public void enrollStudentInCourse(Student student, Course course) {
	        System.out.println("Enrolling " + student.getName() + " in " + course.getCourseName());
	    }

	    public List<Student> getAllStudents() {
	        return students;
	    }

	    public List<Course> getAllCourses() {
	        return courses;
	    }
	

}
