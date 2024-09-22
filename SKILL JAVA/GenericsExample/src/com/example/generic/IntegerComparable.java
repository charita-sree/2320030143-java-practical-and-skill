package com.example.generic;

public class IntegerComparable implements ComparableValue<Integer> {
	 public Integer findMax(Integer[] array) {
	        Integer max = array[0];
	        for (Integer value : array) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	    }

	    @Override
	    public Integer findMin(Integer[] array) {
	        Integer min = array[0];
	        for (Integer value : array) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	    }

}
