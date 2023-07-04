from typing import List

def binary_search(array: List[int], target: int):
    left, right = 0, len(array)
    while left <= right:
        middle = (left + right) // 2
        if array[middle] == target:
            return middle
        if array[middle] < target:
            right = middle - 1
        else:
            left = middle + 1
    return -1
# print(binary_search([1,2,3,4,5,6], 4))


def find_boundary(arr: List[bool]) -> int:
    left, right = 0, len(arr) - 1
    matchIndex = -1
    while left <= right:
        middle = (left + right) // 2
        if arr[middle]:
            matchIndex = middle
            right = middle - 1
        else:
            left = middle + 1
    return matchIndex
# print(find_boundary([False, False, True, True, True, True]))
# print(find_boundary([False, False, False, False, False, True]))


def first_not_smaller(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    matchIndex = -1
    while left <= right:
        middleIndex = (left + right) // 2
        if arr[middleIndex] >= target:
            matchIndex = middleIndex
            right = middleIndex - 1
        else:
            left = middleIndex + 1
    return matchIndex

# print(first_not_smaller([2, 3, 5, 7, 11, 13, 17, 19],20))


def lengthOfLongestSubstring(s: str):
    left, right, result = 0, 0, 0
    window = []
    while right < len(s):
        if not s[right] in window:
            window.append(s[right])
            result = max(result, len(window))
            right += 1
        else:
            window.remove(s[left])
            left += 1
    return result
# print(lengthOfLongestSubstring("abcabcbb"))
# print(lengthOfLongestSubstring("aaaabaaa"))
# print(lengthOfLongestSubstring("abccabcabcc"))


def remove_duplicates(arr: List[int]) -> int:
    left = 0
    for right in range(len(arr)):
        if arr[right] != arr[left]:
            left += 1
            arr[left] = arr[right]
    return left + 1
# print(remove_duplicates([0,0,1,1,1,2,2]))

def removeElement(nums: List[int], val: int) -> int:
    left = 0
    for right in range(len(nums)):
        if nums[right] != val:
            nums[left] = nums[right]
            left += 1
    return left
# print(removeElement([3,2,2,3], 3))
# print(removeElement([0,1,2,2,3,0,4,2], 2))


def two_sum_sorted1(arr: List[int], target: int) -> List[int]:
    for x in range(len(arr)):
        for y in range(len(arr)):
            if arr[x] + arr[y] == target:
                return x,y
# print(two_sum_sorted1([2, 3, 5, 8, 11, 15], 13))


def two_sum_sorted(arr: List[int], target: int) -> List[int]:
    left, right = 0, len(arr) - 1
    while left < right:
        if arr[left] + arr[right] == target:
            return arr[left], arr[right]
        if arr[left] + arr[right] < target:
            left += 1
        else:
            right -= 1
# print(two_sum_sorted([2, 3, 5, 8, 11, 15], 13))

def twoSum(nums: List[int], target: int) -> List[int]:
    hashMap = {}
    for i, n in enumerate(nums):
        diff = target - n
        if diff in hashMap:
            return [hashMap[diff], i]
        hashMap[diff] = i
    return 10
# print(twoSum([2,7,11,15], 9))
# print(twoSum([3,2,4], 6))
# print(twoSum([3,3], 6))


def singleNumber(self, nums: List[int]):
    singleNumber = nums[0]
    for x in range(1, len(nums)):
        

print(singleNumber([2, 2, 1]))
print(singleNumber([4, 1, 2, 1, 2]))
print(singleNumber([1]))
