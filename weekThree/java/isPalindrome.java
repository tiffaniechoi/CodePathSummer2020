
public class isPalindrome {
	/*
	 * Complete the 'isPalindrome' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts STRING a as parameter.
	 * Check if a is a palindrome and return 1 if it
	 * is a palindrome and 0 if it is not. 
	 *
	 */

	public static int is_Palindrome(String a) {

		//make all lowercase for comparison
		a = a.toLowerCase();

		//remove all punctuation marks and white spaces
		a = a.replace(",","");
		a = a.replace(".","");
		a = a.replace(" ","");

		//create a string that copies the input backwards to compare
		String backwards = "";
		for(int i = a.length()-1; i>=0; i--){
			backwards+=a.charAt(i);
		}

		if(backwards.equals(a)){
			return 1;
		}
		return 0;
	}

}
