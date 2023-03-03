from typing import List

def removeElement(nums: List[int], val: int) -> int:
    left = 0
    for right in range(len(nums)):
        if nums[right] != val:
            nums[left] = nums[right]
            left += 1
    return left


print(removeElement([3, 2, 2, 3], 3))
print(removeElement([0,1,2,2,3,0,4,2], 2))
