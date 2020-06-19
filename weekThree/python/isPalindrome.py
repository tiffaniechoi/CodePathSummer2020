#
# Complete the 'isPalindrome' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING a as parameter.
# Check if a is a palindrome and return 1 if it
# is a palindrome and 0 if it is not. 
#
#

def isPalindrome(a):

    ##make all lowercase for comparison
    a = a.lower()

    ##remove all punctuation marks and white spaces
    a = a.replace(",","")
    a = a.replace(".","")
    a = a.replace(" ","")

    ##/create a string that copies the input backwards to compare
    backwards = ""
    
    for i in range(len(a)-1,-1,-1):
        backwards+=a[i]

    if(backwards==a):
        return 1
    return 0
