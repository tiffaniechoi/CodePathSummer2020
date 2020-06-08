#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'last_factorial_digit' function below that
# computes the factorial of n and returns the last digit
# of the factorial n.
# The function is expected to return an INTEGER.
# The function accepts INTEGER n as parameter.
#

def last_factorial_digit(n):
    if(n==1):
        return 1
    return (n*last_factorial_digit(n-1))%10

def main():
    n = int(input().strip())

    result = last_factorial_digit(n)

    print(result)
main()
