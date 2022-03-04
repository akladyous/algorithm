require 'debug'
# require 'set'

def length_of_longest_substring(s)
    # debugger
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
    window_size
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