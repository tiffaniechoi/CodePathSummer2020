#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'CountPrimes' function below.
#
# This function will count the number of prime 
# values that occur that are less then n and return
# the result. 
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER n as parameter.
#

def CountPrimes(n):
    count = 0
    for i in range(2,n):
        if(isPrime(i)):
            count+=1
    return count

def isPrime(n):
    for i in range(2,n):
        if(n%i==0):
            return False
    return True

def main():
    n = int(input().strip())

    result = CountPrimes(n)
    
    print(result)

main()
