

def lengthOfLastWord(s):
    idx = len(s)-1
    counter = 0
    while s[idx] == ' ':
            idx -= 1
    while idx >= 0 and s[idx] != ' ':
        counter += 1
        idx -= 1
    return counter


print(lengthOfLastWord("   fly me   to   the moon  "))
