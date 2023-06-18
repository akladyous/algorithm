class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        if not any(map(bool, nums)):
            return '0'
        nums_str = list(map(str, nums))
        if len(nums_str) < 2:
            return ''.join(nums_str)
        for x in range(len(nums_str)):
            y = x + 1
            while y < len(nums):
                if int(nums_str[x] + nums_str[y]) < int(nums_str[y] + nums_str[x]):
                    nums_str[x], nums_str[y] = nums_str[y], nums_str[x]
                y+=1
        return ''.join(nums_str)