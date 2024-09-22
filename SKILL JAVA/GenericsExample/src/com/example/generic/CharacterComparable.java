package com.example.generic;

public class CharacterComparable implements ComparableValue<Character>{
	 public Character findMax(Character[] array) {
	        Character max = array[0];
	        for (Character value : array) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	    }

	    @Override
	    public Character findMin(Character[] array) {
	        Character min = array[0];
	        for (Character value : array) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	    }

}
