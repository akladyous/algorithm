from typing import List

def two_sum_sorted(arr: List[int], target: int) -> List[int]:
    left, right = 0, len(arr) - 1
    while left < right:
        if arr[left] + arr[right] == target:
            return arr[left] , arr[right]
        if arr[left] + arr[right] < target:
            left += 1
        else:
            right -=1 


print(two_sum_sorted([2, 3, 5, 8, 11, 15], 13))