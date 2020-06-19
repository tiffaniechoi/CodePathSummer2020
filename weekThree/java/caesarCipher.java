
public class caesarCipher {
	/**
	 * Ancient messages were encrypted in a very simple way - 
	 * by assigning each letter a value and "rotating" that letter by a 
	 * given number - this is called a "Caesar Cipher" 
	 * 
	 * a = 1, b = 2, c = 3 etc
	 * after you apply a rotation of 3
	 * "abc" becomes "def", "cat" becomes "fdw"
	 */
	
	/**
	 * This method will encrypt a string using a given number as a 
	 * Caesar Cipher
	 * 
	 * all inputs will be lower case
	 * 
	 * @param String str
	 * @param int offset
	 * @return new encrypted string 
	 */
	public static String caesar_Cipher(String str, int offset) {
		String newStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			
			int num = curr-97;
			
			int newNum = (num + offset)%26;
			
			char newChar = (char) (newNum+97);
			
			newStr+=newChar;
			
		}
		return newStr;
	}

	public static void main(String[] args) {
		System.out.println(caesar_Cipher("acf",4)); //egj
		System.out.println(caesar_Cipher("zcf",25)); //ybe
		

	}

}
