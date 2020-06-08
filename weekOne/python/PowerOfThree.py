#!/bin/python3

import math
import os
import random
import re
import sys



# Complete the 'isPowerOfThree' function below.
#
# This function checks if n is a power of 3 and 
# returns true if it is and false if it is not. 
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER n as parameter.
#
#

def isPowerOfThree(n):
    if(n==1):
        return True
    elif(n==0):
        return False
    else:
        return isPowerOfThree(n/3)

def main():
    n = int(input().strip())

    result = isPowerOfThree(n)

    print(result)

main()
