
def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    hashS = {}
    hashT = {}
    for x in range(len(s)):
        hashS[s[x]] = hashS.get(s[x], 0) + 1
        hashT[t[x]] = hashT.get(t[x], 0) + 1
    for c in hashS:
        if hashS[c] != hashT.get(c, 0):
            return False
    return True


print(isAnagram("anagram", "nagaram"))
