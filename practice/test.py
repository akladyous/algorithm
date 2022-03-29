from typing import List

def countLetters(string: str, letter: str):
    counts = {}
    for char in string:
        if letter in counts:
            counts[letter] += 1
        else:
            counts[letter] = 1
    return counts[letter]


# print(countLetters('aaa', 'a'))


def isPalindrome(x: int) -> bool:
    # Base condition
    if x < 0:
        return False
    # Store the number in a variable
    number = x
    # This will store the reverse of the number
    reverse = 0
    while number:
        reverse = reverse * 10 + number % 10
        number //= 10
    return x == reverse

# print(isPalindrome(121))



def binary_search(arr: List[int], target: int) -> int:
    leftIndex, rightIndex = 0, len(arr) - 1
    while leftIndex <= rightIndex:
        middleIndex = (leftIndex + rightIndex) // 2
        if arr[middleIndex] == target:
            return middleIndex
        if arr[middleIndex] < target:
            leftIndex = middleIndex + 1
        else:
            rightIndex = middleIndex - 1
    return -1

# print(binary_search([1,2,3,4,5,6], 4))

def find_boundary(arr: List[bool]) -> int:
    left, right = 0, len(arr) - 1
    buondaryIndex = -1
    while left <= right:
        middleIndex = (left + right) // 2
        if arr[middleIndex]:
            right = middleIndex - 1
            buondaryIndex = middleIndex
        else:
            left = middleIndex + 1
    return buondaryIndex

# print(find_boundary([False, False, True, True, True, True]))

def first_not_smaller(arr: List[int], target: int) -> int:
    left, right = 0, len(arr) - 1
    buondaryIndex = -1
    while left <= right:
        middleIndex = (left + right) // 2
        if arr[middleIndex] >= target:
            buondaryIndex = middleIndex
            right = middleIndex - 1
        else:
            left = middleIndex + 1
    return buondaryIndex


# print(first_not_smaller([2, 3, 5, 7, 11, 13, 17, 19], 6))


def remove_duplicates(arr: List[int]) -> int:
    left = 0
    for right in range(len(arr)):
        if arr[right] != arr[left]:
            left += 1
            arr[left] = arr[right]
    return left + 1
# print(remove_duplicates([0, 0, 1, 1, 1, 2, 2]))

def move_zeros(nums: List[int]) -> None:
    left = 0
    for right in range(len(nums)):
        if nums[right] != 0:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
    return nums

# print(move_zeros([1,0,2,0,0,7]))
# print(move_zeros([0,0,2,1,0,0,7]))

def two_sum_sorted1(arr: List[int], target: int) -> List[int]:
    for x in range(len(arr)):
        for y in range(len(arr)):
            if arr[x] + arr[y] == target:
                return arr[x], arr[y]


def two_sum_sorted2(arr: List[int], target: int) -> List[int]:
    left, right = 0, len(arr) - 1
    while left < right:
        if arr[left] + arr[right] == target:
            return arr[left], arr[right]
        if (arr[left] + arr[right]) < target:
            left += 1
        else:
            right -= 1

print(two_sum_sorted1([2, 3, 5, 8, 11, 15], 5))
print(two_sum_sorted2([2, 3, 5, 8, 11, 15], 13))