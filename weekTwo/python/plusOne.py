#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusOne' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY digits as parameter.
# This function will take the value represented by the 
# array digits, add 1 to it, and return the resulting 
# array. 

def plusOne(digits):
    return helper(digits,len(digits)-1)

def helper(digits, index):
    if(digits[0]==0):
        digits.insert(0,1)
        return digits
    
    if(digits[index] < 9):
        digits[index]= digits[index] +1
        return digits

    digits[index]=0

    index-=1

    return helper(digits,index)

def main():
    digits_count = int(input().strip())

    digits = []

    for _ in range(digits_count):
        digits_item = int(input().strip())
        digits.append(digits_item)

    result = plusOne(digits)

    print(result)

main()
