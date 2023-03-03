'''
Given a sorted array of integers and a target integer, find the first occurrence of the target and return its index. Return -1 if the target is not in the array.

Input:

arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
target = 3
Output: 1
'''


from typing import List

def find_first_occurrence(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    result = -1
    while left <= right:
        middleIndex = (left + right) // 2
        if arr[middleIndex] == target:
            result = middleIndex
            right = middleIndex -1
        elif arr[middleIndex] < target:
            left = middleIndex + 1
        else:
            right = middleIndex - 1
    return result

print(find_first_occurrence([2, 3, 5, 7, 11, 13, 17, 19], 3))