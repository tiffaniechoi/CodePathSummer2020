import java.util.Scanner;

public class PowerOfThree {
	/*
	 * Complete the 'isPowerOfThree' function below.
	 *
	 * This function checks if n is a power of 3 and 
	 * returns true if it is and false if it is not. 
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER n as parameter.
	 *
	 */

	public static boolean isPowerOfThree(int n) {
		if(n==1){
			return true;
		} else if (n==0){
			return false;
		} else {
			return n%3==0 && isPowerOfThree(n/3);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		boolean result = isPowerOfThree(n);

		System.out.print(result);

		input.close();
		
	}
}
