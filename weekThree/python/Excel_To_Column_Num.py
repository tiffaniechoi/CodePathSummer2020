#
# Complete the 'excel_column_to_number' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING column as parameter.
#
# Given a column as represented in excel, return
# its corresponding column number. 
#

def excel_column_to_number(column):
    num = 0
    for i in range(len(column)):

        ##base 26
        num*=26

        ##ASCII table ranges from 0-127, and A is ASCII(65), 
        ## so subtract 64 to mark starting point                    
        num+=ord(column[i])-64

    return num
