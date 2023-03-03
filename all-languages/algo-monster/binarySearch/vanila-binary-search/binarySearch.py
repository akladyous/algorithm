from typing import List

def binary_search(array: List[int], target: int):
    left, right = 0, len(array) - 1
    while left <= right:
        middle = (left + right) // 2
        # middle1 = left + (right - left) // 2
        if array[middle] == target:
            return middle
        if array[middle] < target:
            left = middle + 1
        else:
            right = middle -1
    return -1

print(binary_search([1,2,3,4,5,6], 4))
