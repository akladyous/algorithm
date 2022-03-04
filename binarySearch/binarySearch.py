from typing import List

def binary_search(array: List[int], target: int):
    left_index = 0
    right_index = len(array) - 1
    while left_index <= right_index:
        middle_index = left_index + (right_index - left_index) // 2
        potential_match = array[middle_index]

        if target == potential_match:
            return middle_index
        
        if target < middle_index:
            right_index = middle_index - 1
        else:
            left_index = middle_index + 1
    return -1

print(binary_search([1,2,3,4,5,6], 1))
