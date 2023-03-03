
def findFirstDuplicate(nums):
    for i in range(0, len(nums)-1):
        # print(nums[])
        if nums[i] in nums[i+1: len(nums)]:
            return nums[i]

print(findFirstDuplicate([3,1,3,4,2]))