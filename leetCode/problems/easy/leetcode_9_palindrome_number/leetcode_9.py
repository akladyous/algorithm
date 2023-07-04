class Solution:
    def isPalindrome(self, x: int) -> bool:
        reversedNumber = 0
        originalNumber = x
        while x > 0:
            leastSignificantDigit = x % 10
            reversedNumber = reversedNumber * 10 + leastSignificantDigit
            x //= 10
        return originalNumber == reversedNumber


def test_isPalindrome():
    solution = Solution()

    # Test Case 1
    x1 = 121
    result1 = solution.isPalindrome(x1)
    expected1 = True
    assert result1 == expected1, f"Expected {expected1}, but got {result1}"

    # Test Case 2
    x2 = 12321
    result2 = solution.isPalindrome(x2)
    expected2 = True
    assert result2 == expected2, f"Expected {expected2}, but got {result2}"

    # Test Case 3
    x3 = 12345
    result3 = solution.isPalindrome(x3)
    expected3 = False
    assert result3 == expected3, f"Expected {expected3}, but got {result3}"

    print("All test cases passed!")


test_isPalindrome()
