# require 'debug'

def isAnagram(s, t)
    # debugger
    return false unless s.length == t.length
    hashS = Hash.new(0)
    hashT = Hash.new(0)
    for i in 0...s.length
        hashS[s[i]] += 1
        hashT[t[i]] += 1
    end
    hashS.each{ |key, value| return false unless hashS[key] == hashT[key] }
    true
end

puts isAnagram("anagram", "nagaram")