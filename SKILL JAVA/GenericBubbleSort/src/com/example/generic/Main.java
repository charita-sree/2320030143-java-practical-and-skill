package com.example.generic;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		  Integer[] intArray = {5, 3, 8, 1, 2};
	        System.out.println("Before sorting Integer array: " + Arrays.toString(intArray));
	        BubbleSortUtil.bubbleSort(intArray);
	        System.out.println("After sorting Integer array: " + Arrays.toString(intArray));

	        Double[] doubleArray = {5.5, 3.3, 8.8, 1.1, 2.2};
	        System.out.println("Before sorting Double array: " + Arrays.toString(doubleArray));
	        BubbleSortUtil.bubbleSort(doubleArray);
	        System.out.println("After sorting Double array: " + Arrays.toString(doubleArray));

	        String[] strArray = {"banana", "apple", "cherry", "date"};
	        System.out.println("Before sorting String array: " + Arrays.toString(strArray));
	        BubbleSortUtil.bubbleSort(strArray);
	        System.out.println("After sorting String array: " + Arrays.toString(strArray));
	    }

	}

