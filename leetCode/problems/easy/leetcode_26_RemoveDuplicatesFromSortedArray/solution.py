from typing import List

def removeDuplicates(nums: List[int]) -> int:
    left = 0
    for right in range(len(nums)):
        if nums[right] != nums[left]:
            left += 1
            nums[left] = nums[right]
    return left + 1
print(removeDuplicates([0,0,1,1,1,2,2]))