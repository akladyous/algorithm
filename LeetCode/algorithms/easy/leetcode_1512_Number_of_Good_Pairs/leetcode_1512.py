class Solution:
    # big O(n)
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = {}
        res = 0
        for num in nums:
            if num in count:
                res += count[num]
            count[num] = count.get(num, 0) + 1
        return res

    # big O(n)
    def solution_II(self, nums: List[int]) -> int:
        res = 0
        count = [0] * 101
        for a in nums:
            res += count[a]
            count[a] += 1
        return res

    # big O(n^2)
    def solution_I(self, nums: List[int]) -> int:
        pairs = []
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    pairs.append([nums[i], nums[j]])
        return len(pairs)
