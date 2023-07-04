class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        currentMax = nums[0]
        currentSum = 0
        for num in nums:
            if currentSum < 0:
                currentSum = 0
            currentSum += num
            currentMax = max(currentMax, currentSum)
        return currentMax