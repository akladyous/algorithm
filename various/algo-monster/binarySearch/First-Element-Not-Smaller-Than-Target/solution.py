from typing import List

def first_not_smaller(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    buondaryIndex = -1
    while left <= right:
        middleIndex = (left + right) // 2
        if arr[middleIndex] >= target:
            buondaryIndex = middleIndex
            right = middleIndex - 1
        else:
            left = middleIndex + 1
    return buondaryIndex


print(first_not_smaller([2, 3, 5, 7, 11, 13, 17, 19], 6))