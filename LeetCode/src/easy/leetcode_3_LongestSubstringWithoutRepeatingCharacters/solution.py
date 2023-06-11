
def lengthOfLongestSubstring(s: str):
    left = right = result = 0
    window = set()
    while right < len(s):
        if not s[right] in window:
            window.add(s[right])
            right += 1
            result = max(result, (right - left))
        else:
            window.remove(s[left])
            left += 1
    return result

print(lengthOfLongestSubstring("abcabcbb"))
print(lengthOfLongestSubstring("aaaabaaa"))
print(lengthOfLongestSubstring("abccabcabcc"))
