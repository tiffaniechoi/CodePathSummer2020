import java.util.ArrayList;
import java.util.List;

public class First_Missing_Positive_Integer {

	/*
	 * Complete the 'first_missing_positive_integer' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER_ARRAY integers as parameter.
	 * It will check the integer array and return the first 
	 * missing positive integer. 
	 */

	public static int first_missing_positive_integer(List<Integer> integers) {

		int firstPosNum = 1, smallestNum = Integer.MAX_VALUE, biggestNum = 0;
		
		for(int i : integers) {
			if(i < smallestNum && i >0) {
				smallestNum = i;
			}
			if(i > biggestNum) {
				biggestNum = i;
			}
		}

		for(int i = smallestNum; i <= biggestNum+1; i++) {
			if(!integers.contains(i)) {
				firstPosNum = i;
				break;
			}
		}
		return firstPosNum;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(-1);
		list.add(1);

		System.out.println(first_missing_positive_integer(list));
	}

}
