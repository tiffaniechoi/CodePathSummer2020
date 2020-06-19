#!/bin/python3

import math
import os
import random
import re
import sys
#
# Complete the 'merge_overlapping_intervals' function below.
#
# The function is expected to return a 2D_INTEGER_ARRAY.
# The function accepts 2D_INTEGER_ARRAY intervals as parameter.
# The function will go through the intervals, merge any 
# intervals that overlap, sort, and return the final array.

def merge_overlapping_intervals(intervals):

    index = 0
    intervals = sorted(intervals, key=lambda x: x[0])
    
    for i in intervals:
        
        if i[0] > intervals[index][1]:
            index+=1
            intervals[index] = i
        else:
            intervals[index] = [intervals[index][0], i[1]]
  
    return intervals[:index+1]
