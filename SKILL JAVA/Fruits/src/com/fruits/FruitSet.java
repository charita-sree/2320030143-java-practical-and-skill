package com.fruits;
import java.util.Set;
import java.util.TreeSet;

public class FruitSet {

	public static void main(String[] args) {
		 Set<String> fruits = new TreeSet<>();
	        
	        // Add fruits to the set
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");
	        fruits.add("Elderberry");
	        fruits.add("Fig");
	        fruits.add("Grape");

	        // Print out the fruits in alphabetical order
	        System.out.println("Fruits in alphabetical order:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	}

}
