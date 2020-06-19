
public class XOR_Cipher {

	public static String xor_Cipher(String str, int encodingNum) {

		//new encrypted string
		String newStr = ""; 

		//perform XOR operation on all char in string
		for (int i = 0; i < str.length(); i++)  { 
			newStr+= Character.toString((str.charAt(i) ^ encodingNum)); 
		} 

		return newStr; 
	}

	public static void main(String[] args) {
		System.out.println(xor_Cipher("cat",5)); //fdq

	}

}
