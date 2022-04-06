from typing import List

def binary_search(array: List[int], target: int):
    left, right = 0, len(array)
    while left < right:
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
#           ↓
#[0,1,2,1,1,2,2]
#    ↑
print(remove_duplicates([0,0,1,1,1,2,2]))