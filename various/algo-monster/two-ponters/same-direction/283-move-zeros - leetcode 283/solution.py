from typing import List

def move_zeros(nums: List[int]) -> None:
    leftIndex = 0
    for rightIndex in range(len(nums)):
        if nums[rightIndex] != 0:
            nums[leftIndex], nums[rightIndex] = nums[rightIndex], nums[leftIndex]
            leftIndex += 1
    return nums
print(move_zeros([1,0,2,0,0,7]))
print(move_zeros([0,0,2,1,0,0,7]))