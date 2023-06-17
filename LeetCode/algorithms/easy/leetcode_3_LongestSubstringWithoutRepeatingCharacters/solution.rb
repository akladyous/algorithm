=begin
3. Longest Substring Without Repeating Characters
Medium

22122

993

Add to List

Share
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
=end

# require 'set'

def length_of_longest_substring(s)
    left, right, max = 0, 0, 0
    window = []
    while right < s.length
        if window.include?(s[right])
            window.delete(s[left])
            left += 1
        else
            window.push(s[right])
            max = [max, window.length].max
            right += 1
        end
    end
    window
end

# with SET
# def length_of_longest_substring(s)
#     debugger
#     left, right, window_size = 0, 0, 0
#     window_set = Set.new
#     while right < s.length
#         if window_set.include?(s[right])
#             window_set.delete(s[left])
#             left += 1
#         else
#             window_set.add(s[right])
#             window_size = [window_size, window_set.length].max
#             right += 1
#         end
#     end
#     window_size
# end

puts length_of_longest_substring("abcabcbb")