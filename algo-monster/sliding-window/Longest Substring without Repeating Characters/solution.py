

def longest_substring_without_repeating_characters(s: str) -> int:
    left = right = result = 0
    window = set()
    while right < len(s):
        if not s[right] in window:
            window.add(s[right])
            right += 1
            # result = max(result, right - left)
            result = max(result, len(window))
        else:
            window.remove(s[left])
            left += 1
    return result

print(longest_substring_without_repeating_characters('abccabcabcc'))
print(longest_substring_without_repeating_characters('aaaabaaa'))
