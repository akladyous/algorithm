

def longestPalindrome(s: str):
    result = ''
    resultLen = 0
    for i in range(len(s)):
        l,r = i, i
        while i >= 0 and r < len(s) and s[i] == s[r]:
            if(r - l + 1) > resultLen:
                result = s[l : r + 1]
                resultLen = r - l + 1
            l -= 1
            r += 1
        
        l, r = i, i + 1
        while i >= 0 and r < len(s) and s[l] == s[r]:
            if(r - l + 1) > resultLen:
                result = s[l : r + 1]
                resultLen = r - l + 1
            l -= 1
            r += 1
    return result

print(longestPalindrome('babad'))
