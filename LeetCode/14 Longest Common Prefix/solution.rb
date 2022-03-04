require 'debug'

def longest_common_prefix2(strs)
    prefix = ""
    for j in (0...strs.at(0).length)
        for word in strs
            return prefix if word[j] != strs[0][j] || j == word.length
        end
        prefix += strs[0][j]
    end
    prefix
end

puts longest_common_prefix2(["flower","flow","flight"])
puts longest_common_prefix2(["ab", "a"])