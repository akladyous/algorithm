class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        duplicate_nums = list()
        for num in nums:
            if nums[abs(num)-1] < 0:
                duplicate_nums.append(abs(num))
            nums[abs(num)-1] = -nums[abs(num)-1]
        return duplicate_nums