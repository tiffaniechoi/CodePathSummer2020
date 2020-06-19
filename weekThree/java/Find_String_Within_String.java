
public class Find_String_Within_String {
	/*
	 * Complete the 'isSubstring' function below.
	 *
	 * The function is expected to return a BOOLEAN.
	 * The function accepts following parameters:
	 *  1. STRING str1
	 *  2. STRING str2
	 * The function will check if str1 is a substring 
	 * of str2 and return true or false accordingly. 
	 *
	 */

	public static boolean isSubstring(String str1, String str2) {

		//check if str1 is a substring of str2 
		if(str2.contains(str1)){
			return true;
		}
		return false;
	}


}
