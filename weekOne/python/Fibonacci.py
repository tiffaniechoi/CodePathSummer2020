#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'fibonacci' function below.
#
# The function accepts INTEGER n as parameter.
# and prints out the nth value of the fibonacci
# sequence
#

def fibonacci(n):
    print(helper(n))
    
def helper(n):
    if(n<=1):
        return n
    return helper(n-1) + helper(n-2)

def main():
    n = int(input().strip())
    fibonacci(n)
    
main()
