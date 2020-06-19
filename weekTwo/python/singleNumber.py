#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'singleNumber' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY nums as parameter.
# Find the integer in the array that only occurs once 
# and return that integer. 

def singleNumber(nums):
    temp = 0

    counter = []
    answer = []

    for i in nums:
        if(counter.count(i) > 0):
            answer.append(i)

        counter.append(i)

    for i in nums:
        if(answer.count(i)==0):
            temp = i

    return temp

def main():
    nums_count = int(input().strip())

    nums = []

    for _ in range(nums_count):
        nums_item = int(input().strip())
        nums.append(nums_item)

    result = singleNumber(nums)

    print(result)
    
main()

    
        
