package com.example.generic;

public class Main {

	public static void main(String[] args) {
		 Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
	        BinarySearch<Integer> intSearch = new BinarySearch<>();
	        int intKey = 7;
	        int intResult = intSearch.binarySearch(intArray, intKey);
	        System.out.println("Integer Key " + intKey + " found at index: " + intResult);

	        // Test with Double
	        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
	        BinarySearch<Double> doubleSearch = new BinarySearch<>();
	        Double doubleKey = 4.4;
	        int doubleResult = doubleSearch.binarySearch(doubleArray, doubleKey);
	        System.out.println("Double Key " + doubleKey + " found at index: " + doubleResult);

	        // Test with String
	        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};
	        BinarySearch<String> strSearch = new BinarySearch<>();
	        String strKey = "cherry";
	        int strResult = strSearch.binarySearch(strArray, strKey);
	        System.out.println("String Key \"" + strKey + "\" found at index: " + strResult);

	}

}
