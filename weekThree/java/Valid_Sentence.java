
public class Valid_Sentence {

	/*
	 * Complete the 'isValid' function below.
	 *
	 * The function is expected to return a BOOLEAN.
	 * The function accepts STRING sentence as parameter.
	 * The function will check if the sentence is valid 
	 * and return true or false accordingly. 
	 *
	 */

	public static boolean isValid(String sentence) {

		//a valid sentence has an uppercase on the 1st letter & a punctuation at the end
		if(Character.isUpperCase(sentence.charAt(0)) && isPunctuation(sentence.charAt(sentence.length()-1))){
			return true;
		}
		return false;
	}
	
	/**
	 * This method will check if the char is a punction or not
	 * 
	 * @param char c
	 * @return true or false
	 */
	public static boolean isPunctuation(char c){
		if(c=='?' || c=='.' || c=='!'){
			return true;
		}
		return false;
	}


}
