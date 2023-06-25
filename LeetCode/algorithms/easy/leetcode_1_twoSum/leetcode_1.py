from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}
        for i, num in enumerate(nums):
            diff = target - num
            if diff in hashMap:
                return [hashMap[diff], i]
            hashMap[num] = i
        return []

    def twoSum_brute_force(self, nums: List[int], target: int) -> List[int]:
        for left in range(len(nums)):
            for right in range(left + 1, len(nums)):
                if nums[left] + nums[right] == target:
                    return [left, right]
        return None


def test_twoSum():
    solution = Solution()

    # Test Case 1
    nums1 = [2, 7, 11, 15]
    target1 = 9
    result1 = solution.twoSum(nums1, target1)
    expected1 = [0, 1]
    assert result1 == expected1, f"Expected {expected1}, but got {result1}"

    # Test Case 2
    nums2 = [3, 2, 4]
    target2 = 6
    result2 = solution.twoSum(nums2, target2)
    expected2 = [1, 2]
    assert result2 == expected2, f"Expected {expected2}, but got {result2}"

    # Test Case 3
    nums3 = [3, 3]
    target3 = 6
    result3 = solution.twoSum(nums3, target3)
    expected3 = [0, 1]
    assert result3 == expected3, f"Expected {expected3}, but got {result3}"

    print("All test cases passed!")


test_twoSum()
