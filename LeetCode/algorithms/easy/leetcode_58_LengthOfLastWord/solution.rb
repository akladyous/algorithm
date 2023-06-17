
def lengthOfLastWord(s)
    idx = s.length-1
    counter = 0
    while s[idx] == ' '
        idx -= 1
    end
    while idx >= 0 && s[idx] != ' '
        counter += 1
        idx -= 1
    end
    counter
end

puts lengthOfLastWord("   fly me   to   the moon  ")