package com.example.generic;

public class FloatComparable implements ComparableValue<Float>{
	 public Float findMax(Float[] array) {
	        Float max = array[0];
	        for (Float value : array) {
	            if (value > max) {
	                max = value;
	            }
	        }
	        return max;
	    }

	    @Override
	    public Float findMin(Float[] array) {
	        Float min = array[0];
	        for (Float value : array) {
	            if (value < min) {
	                min = value;
	            }
	        }
	        return min;
	    }

}
