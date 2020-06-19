import java.util.*;

public class RotateArray {

	/*
	 * Complete the 'rotate_array' function below.
	 *
	 * The function accepts following parameters:
	 * 1. INTEGER_ARRAY input_array
	 * 2. INTEGER k
	 * And will rotate the input_array to the right by 
	 * k steps. The resulting array will be returned.
	 */

	public static List<Integer> rotate_array(List<Integer> input_array, int k) {
		if(k > input_array.size()) {
			return input_array;
		}

		List<Integer> temp = new ArrayList<>();
		temp.addAll(input_array);
		int count = 0;
		
		for(int i = k; i < temp.size(); i++) {
			input_array.set(i, temp.get(count));
			count++;
		}
		for(int i = 0; i < k; i++) {
			input_array.set(i, temp.get(count));
			count++;
		}

		return input_array;
	}

	public static void main(String[] args) {
		List<Integer> input_array = new ArrayList<>();
		
		for(int i = 1; i < 9; i++) {
			input_array.add(i);
		}

		System.out.println(rotate_array(input_array, 4));

	}

}
