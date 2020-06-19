#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'first_missing_positive_integer' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY integers as parameter.
#
# It will check the integer array and return the first 
# missing positive integer. 
#

def first_missing_positive_integer(integers):
   firstPosNum = 1, smallestNum = sys.maxsize, biggestNum = 0

    for i in integers:
        if(i < smallestNum and i > 0):
           smallestNum = i

        if(i > biggestNum):
            biggestNum = i


    for i in range(smallestNum, biggestNum+2):
        
        if(integers.count(i)==0):
            firstPosNum = i
            break

    return firstPosNum

def main():
    integers_count = int(input().strip())

    integers = []

    for _ in range(integers_count):
        integers_item = int(input().strip())
        integers.append(integers_item)

    result = first_missing_positive_integer(integers)

    print(result)

main()

