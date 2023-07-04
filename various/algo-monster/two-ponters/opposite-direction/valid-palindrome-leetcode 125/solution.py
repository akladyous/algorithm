

from curses.ascii import isalnum, isalpha


def is_palindrome(s: str) -> bool:
    left, right = 0, len(s)-1
    while left < right:
        while left < right and not s[left].isalnum():
            left += 1
        while left < right and not s[right].isalnum():
            right -= 1 
        if s[left].lower() != s[right].lower():
            return False
        left += 1
        right -= 1 
    return True

print(is_palindrome("Do geese see God?"))
print(is_palindrome("Was it a car or a cat I saw?"))
print(is_palindrome(" A brown fox jumping over"))