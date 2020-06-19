
public class Excel_To_Column_Num {
	/*
     * Complete the 'excel_column_to_number' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING column as parameter.
     * Given a column as represented in excel, return
     * its corresponding column number. 
     *
     */

    public static int excel_column_to_number(String column) {
        int num = 0;
        for(int i = 0; i < column.length(); i++){

            //base 26
            num*=26;

            /*ASCII table ranges from 0-127, and A is ASCII(65), so subtract 64 to mark                       
             * starting point*/
            num +=column.charAt(i)-64;
        
        }
        return num;
    }


}
