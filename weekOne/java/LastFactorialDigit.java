import java.util.Scanner;

public class LastFactorialDigit {
	/*
	 * Complete the 'last_factorial_digit' function below that
	 * computes the factorial of n and returns the last digit
	 * of the factorial n.
	 * The function is expected to return an INTEGER.
	 * The function accepts INTEGER n as parameter.
	 */

	public static int last_factorial_digit(int n) {
		if(n==1){
			return 1;
		}
		return (n* last_factorial_digit(n-1))%10;
	}


	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

        int result = last_factorial_digit(n);
        
        System.out.print(result);
        
        input.close();


	}

}
