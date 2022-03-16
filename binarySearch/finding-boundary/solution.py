from turtle import end_fill
from typing import List

def find_boundary(array: List[int]):
    leftIndex, rightIndex = 0, len(array)-1
    boundaryIndex = -1
    while leftIndex <= rightIndex:
        middleIndex = (leftIndex + rightIndex) // 2
        if array[middleIndex]:
            boundaryIndex = middleIndex
            rightIndex = middleIndex -1
        else:
            leftIndex = middleIndex + 1
    return boundaryIndex


print(find_boundary([False, False, False, True, True, True]))

