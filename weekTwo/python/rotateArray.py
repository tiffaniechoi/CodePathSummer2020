#!/bin/python3

import copy

#
# Complete the 'rotate_array' function below.
#
# The function accepts following parameters:
#  1. INTEGER_ARRAY input_array
#  2. INTEGER k
#  And will rotate the input_array to the right by 
#  k steps. The resulting array will be returned.
#

def rotate_array(input_array, k):
    if(k > len(input_array)):
        return input_array

    temp = []
    temp = copy.deepcopy(input_array)

    count = 0

    for i in range(k, len(temp)):
        input_array[i] = temp[count]
        count+=1

    for i in range(k):
        input_array[i] = temp[count]
        count+=1

    return input_array

def main():

    input_array_count = int(input().strip())

    input_array = []

    for _ in range(input_array_count):
        input_array_item = int(input().strip())
        input_array.append(input_array_item)

    k = int(input().strip())

    result = rotate_array(input_array, k)

    print(result)

main()
