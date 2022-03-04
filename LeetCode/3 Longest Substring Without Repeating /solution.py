
def lengthOfLongestSubstring(s: str):
    left = 0
    right = 0
    result = 0
    window = set()
    while right < len(s):
        if not s[right] in window:
            window.add(s[right])
            right += 1
            result = max(result, len(window))
        else:
            window.remove(s[left])
            left += 1
    return result

print(lengthOfLongestSubstring("abcabcbb"))
