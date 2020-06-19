
import java.util.ArrayList;
import java.util.List;

/** 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, 
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * (Project Euler Problem #7)
 * 
 * @author tiffanie choi
 *
 */
public class nthPrime {

	public static int nth_Prime(int n) {
		List<Integer> primesList = new ArrayList<>();

		int curr = 2;

		while(primesList.size() < n) {
			if(isPrime(curr,primesList)) {
				primesList.add(curr);
			}
			curr++;
		}

		return primesList.get(n-1);
	}

	public static boolean isPrime(int n, List<Integer> primesList) {
		for(int i: primesList) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(nth_Prime(10001));

	}

}


