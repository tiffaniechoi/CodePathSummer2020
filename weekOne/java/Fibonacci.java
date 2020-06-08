import java.util.Scanner;

public class Fibonacci {
	/*
	 * Complete the 'fibonacci' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 * and prints out the nth value of the fibonacci
	 * sequence
	 *
	 */

	public static void fibonacci(int n) {
		System.out.println(helper(n));
	}
	public static int helper(int n){
		if(n<=1){
			return n;
		}
		return helper(n-1) + helper (n-2);
	}


	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

        fibonacci(n);
        
        input.close();


	}

}
