
public class String_To_Integer {

	/*
	 * Complete the 'atoi' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts STRING a as parameter.
	 * The function will convert the string parameter 
	 * into an integer, and return the result. 
	 * 
	 */

	public static int atoi(String a) {

		//remove all white spaces
		a = a.replace(" ","");

		String answer = "";
		char neg = '-';

		for(int i = 0; i < a.length(); i++){

			//if first character is not a digit return 0
			if(!Character.isDigit(a.charAt(i)) && i==0 && a.charAt(i)!=(neg)){
				return 0;
			}

			//stop checking a string once it reaches an invalid value
			else if(!Character.isDigit(a.charAt(i)) && i!=0){
				break;
			}
			answer+=a.charAt(i);
		}
		
		int num = 0;
		try{
			num = Integer.parseInt(answer);

			//check for num out of range 
		} catch (NumberFormatException e){
			if(answer.charAt(0)==neg){
				return Integer.MIN_VALUE;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		return num;
	}

}
