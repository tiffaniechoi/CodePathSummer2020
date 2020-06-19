import java.util.*;
public class SingleNumber {
	
	 /*
     * Complete the 'singleNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY nums as parameter.
     * Find the integer in the array that only occurs once 
     * and return that integer. 
     *
     */

    public static int singleNumber(List<Integer> nums) {
    	int temp = 0;

    	List<Integer> counter = new ArrayList<>();
    	List<Integer> answer = new ArrayList<>();
    	for(int i : nums) {
    		if(counter.contains(i)){
    			answer.add(i);
    		}
    		counter.add(i);
    	}
    	for(int i : nums) {
    		if(!answer.contains(i)) {
    			temp = i;
    		}
    	}
    	return temp;
    	
    }

	public static void main(String[] args) {
		
	}

}
