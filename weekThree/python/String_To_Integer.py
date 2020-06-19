#
# Complete the 'atoi' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING a as parameter.
# The function will convert the string parameter 
# into an integer, and return the result. 
#
#

def atoi(a):

    ##remove all white spaces
    a = a.replace(" ","")
    answer = ""
    neg = '-'

    for i in range(len(a)):

        ##if first character is not a digit return 0
        if(not a[i].isdigit() and i==0 and a[i]!=neg):
            return 0

        ##stop checking a string once it reaches an invalid value
        elif(not a[i].isdigit() and i!=0):
            break
        answer+=a[i]
    
    num = int(answer)

    ##check for out of range numbers
    if(num >= sys.maxsize):
        return sys.maxsize
    elif(num <= -91283472332):
        return -2147483648
    return num
