require 'debug'
# solution one - 2 iteration
# Input: [2, 1, 5, 1, 3, 2], k=3 
# Output: 9
# Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.


def max_sub_array_of_size_k1(k, arr)
    max = 0
    for x in 0..arr.length - k
        sum = 0
        for y in x..x + k - 1
            sum += arr[y]
        end
        max = [max, sum].max
    end
    max
end

def max_sub_array_of_size_k2(k, arr)
    left, right ,max, sum = 0, 0, 0, 0
    while right < arr.length
        sum += arr[right]
        if right >= k -1
            max = [max, sum].max
            sum -= arr[left]
            left += 1
        end
        right += 1
    end
    max
end

puts max_sub_array_of_size_k2(3, [2, 1, 5, 1, 3, 2])