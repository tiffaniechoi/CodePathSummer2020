import java.util.ArrayList;
import java.util.List;

public class largestPrimeFactor {
	
	/**
	 * Computes the largest prime factor of a given input
	 * 
	 * @param int n
	 * @return the largest prime factor of n (int) or None
	 */
	public static int largest_Prime_Factor(int n) {
		
		//edge case
		if(n <2) {
			return 0;
		}
		
		int potentialPrimeFactor = 2;
		
		List<Integer> primeFactors = new ArrayList<>();
		
		while(potentialPrimeFactor<=n) {
			if(n%potentialPrimeFactor==0) {
				
				/* ppf divides evenly into `n`, so divide it into 
				`n` and add it to the list of prime factors. */
				
				n /= potentialPrimeFactor;
				primeFactors.add(potentialPrimeFactor);
			} else {
				
				/* ppf doesn't divide evenly into `n`, so check the 
				 * next number.
				 */
				potentialPrimeFactor++;
			}
		}
		return primeFactors.get(primeFactors.size()-1);
	}

	public static void main(String[] args) {
		System.out.println(largest_Prime_Factor(5));
		System.out.println(largest_Prime_Factor(26));
		System.out.println(largest_Prime_Factor(13195));

	}

}
