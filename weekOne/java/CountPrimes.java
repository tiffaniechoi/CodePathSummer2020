import java.util.Scanner;

/*
 * Complete the 'CountPrimes' function below.
 *
 * This function will count the number of prime 
 * values that occur that are less then n and return
 * the result. 
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */
public class CountPrimes {
	public static int CountPrimeNum(int n) {
		int count = 0;
		for(int i = 2; i < n; i++){
			if(isPrime(i)){
				count++;
			}
		}
		return count;
	}

	public static boolean isPrime(int n) {
		for(int i = 2; i < n; i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		
		System.out.println("Enter number: ");
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

        int result = CountPrimeNum(n);
        
        System.out.print(result);
        
        input.close();

       
	}
}