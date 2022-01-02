#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    g=l=z=0
    for i in range(len(arr)):
        if(arr[i]>0):
            g+=1
        elif(arr[i]<0):
            l+=1
        else:
            z+=1
    print("{:.6f}".format(g/len(arr)))
    print("{:.6f}".format(l/len(arr)))
    print("{:.6f}".format(z/len(arr)))


if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
