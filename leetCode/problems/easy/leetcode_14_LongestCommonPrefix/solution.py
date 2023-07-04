def longest_common_prefix1(strs):
    res = ''
    for i in range(len(strs[0])):
        for s in strs:
            if i == len(s) or s[i] != strs[0][i]:
                return res
        res += strs[0][i]
    return res


def longest_common_prefix2(strs):
    prefix = ""
    for x in range(len(strs[0])):
        for word in strs:
            if strs[0][x] != word[x] or x == len(word):
                return prefix
        prefix += strs[0][x]
    return prefix

print(longest_common_prefix2(["flower","flow","flight"]))
print(longest_common_prefix1(["ab", "a"]))