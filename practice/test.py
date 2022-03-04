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