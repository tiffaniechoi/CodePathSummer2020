import java.util.*;


public class PlusOne {

	/*
     * Complete the 'plusOne' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY digits as parameter.
     * This function will take the value represented by the 
     * array digits, add 1 to it, and return the resulting 
     * array. 
     *
     */
	
	public static List<Integer> plusOne(List<Integer> digits) {
		
		return helper(digits,digits.size()-1);
		
    }
	
	public static List<Integer> helper(List<Integer> digits, int index) {
		if(digits.get(0)==0) {
			digits.add(0,1);
			return digits;
		}
		if(digits.get(index) < 9) {
			digits.set(index, digits.get(index) +1);
			return digits;
		}
		
		digits.set(index, 0);
		
		index--;
		
		
		
		return helper(digits,index);
	}

	public static void main(String[] args) {
		List<Integer> digits = new ArrayList<>();
		digits.add(1);
		digits.add(2);
		digits.add(3);
		digits.add(9);
		System.out.println(plusOne(digits));

	}

}
