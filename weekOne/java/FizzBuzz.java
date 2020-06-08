import java.util.Scanner;

public class FizzBuzz {
	/*
	 * Complete the 'FizzBuzz' function below.
	 * This function takes in integer n as a parameter
	 * and prints out its value, fizz if n is divisible
	 * by 3, buzz if n divisible by 5, and fizzbuzz 
	 * if n is divisible by 3 and 5. 
	 *
	 */

	public static void FizzBuzzer(int n) {
		for(int i = 1; i <=n ; i++){
			if(i%3==0 && i%5!=0){
				System.out.println("fizz");
			} else if (i%5==0 && i%3!=0){
				System.out.println("buzz");
			} else if (i%3==0 && i%5==0){
				System.out.println("fizzbuzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
        
        FizzBuzzer(n);
        
        input.close();

	}

}
