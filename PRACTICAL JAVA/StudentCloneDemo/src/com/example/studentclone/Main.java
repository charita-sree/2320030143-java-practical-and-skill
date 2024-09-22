package com.example.studentclone;

public class Main {

	public static void main(String[] args) {
		 try {
	            Student student1 = new Student("Alice", 101, 85);

	            Student student2 = (Student) student1.clone();

	            System.out.println("Original Student: " + student1);
	            System.out.println("Cloned Student: " + student2);

	            student2.setName("Bob");
	            student2.setRollNumber(102);
	            student2.setMarks(90);

	            System.out.println("\nAfter modifying cloned student's details:");
	            System.out.println("Original Student: " + student1);
	            System.out.println("Cloned Student: " + student2);

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }

	}


