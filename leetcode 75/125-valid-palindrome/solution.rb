=begin

125. Valid Palindrome
Easy

3238

4957

Add to List

Share
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
=end

# helper methods for is_palindrome
def alphanumeric?(character)
        return !character.match(/\A[a-zA-Z0-9]*\z/).nil?
        # return  ('a'.ord..'z'.ord).include?(character.ord) ||
        #         ('A'.ord..'Z'.ord).include?(character.ord) || 
        #         ('0'.ord..'9'.ord).include?(character.ord)

        # return  character.ord.between?('a'.ord, 'z'.ord) ||
        #         character.ord.between?('A'.ord, 'Z'.ord) ||
        #         character.ord.between?('0'.ord, '9'.ord)
end
def is_palindrome(s)
    left, right = 0, s.length-1
    while left < right
        while left < right && !alphanumeric?(s[left])
            left += 1
        end
        while right > left && !alphanumeric?(s[right])
            right -= 1
        end
        return false if s[left].downcase != s[right].downcase
        left, right = left + 1, right - 1
    end
    true
end

puts is_palindrome("A man, a plan, a canal: Panama")
puts is_palindrome("race a car")
puts is_palindrome(" ")