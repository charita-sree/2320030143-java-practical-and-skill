package java;
import java.util.Set;
import java.util.HashSet;

public class MaxValueInSet {

	public static void main(String[] args) {
		 Set<Integer> numbers = new HashSet<>();
	        numbers.add(10);
	        numbers.add(25);
	        numbers.add(7);
	        numbers.add(18);

	        Integer max = findMax(numbers);

	        System.out.println("The maximum value in the set is: " + max);
	    }

	    public static Integer findMax(Set<Integer> set) {
	        if (set.isEmpty()) {
	            return null; 
	        }

	        Integer max = null;
	        for (Integer number : set) {
	            if (max == null || number > max) {
	                max = number;
	            }
	        }

	        return max;
	}

}
