from typing import List


def moveZeroes(nums: List[int]) -> None:
    left = 0
    for right in range(len(nums)):
        if nums[right] != 0:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1 
    return nums
print(moveZeroes([1, 0, 2, 0, 0, 7]))
print(moveZeroes([0, 0, 2, 1, 0, 0, 7]))
