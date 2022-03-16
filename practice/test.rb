# require 'debug'

def findFirstDuplicate1(nums)
    # debugger
    nums.each{ |v| return v if nums.count(v) > 1 }
    -1
end
def findFirstDuplicate2(nums)
    for i in 1..nums.length
        return nums[i-1] if nums[i...].include?(nums[i-1])
    end
    -1
end
# puts findFirstDuplicate2([1,2,3,4,5,6,1])

def reverseString(str)
    i = str.length - 1
    newString = ''
    while i >= 0
        newString += str[i]
        i -= 1
    end
    newString
end
# puts reverseString('paolo')

def smallestString(arr=[])
    smallest = 0
    arr.each_index{ |i| smallest = i if arr[i].length < arr[smallest].length}
    return smallest
end
# puts smallestString(['ciao', 'come', 'stai', '?'])

def twoSum(nums, target)
    hash_map = {}
    for i in 0..nums.length
        diff = target - nums[i].to_i
        if !hash_map.has_key?(diff)
            hash_map[nums[i]] = i
        else
            return [hash_map[diff], i]
        end
    end
end

# p  twoSum([2,7,11,15], 9)

def length_of_longest_substring(s)
    left, right, max = 0 ,0 ,0
    window = []
    while right < s.length
        if !window.include?(s[right])
            window.push(s[right])
            # max = [max, right - left + 1]
            max = [max, window.length].max
            right += 1
        else
            window.delete(s[left])
            left +=1
        end
    end
    return max
end

# p length_of_longest_substring("abcabcbb")

def reverseNum(x)
    flag = false
    result = 0
    if x.negative?
        x = - x
        flag = true
    end
    
    while x.positive?
        digit = x % 10
        x = x / 10
        result = (result * 10) + digit
    end
    return 0 if result >= 2.pow(31) -1 || result <= -2.pow(31)
    flag ? - result : result
end
# puts reverseNum -12345


# [-2,1,-3,4,-1,2,1,-5,4]

def max_sub_array(nums)
    currentMAx = nums[0]
    debugger
    for i in 0..nums.length-1
        for j in i..nums.length-1
            currentSum = 0
            for k in i..j
                currentSum += nums[k]
            end
            currentMAx = [currentMAx, currentSum].max
        end
    end
    currentMAx
end

# puts max_sub_array([-2,1,-3,4,-1,2,1,-5,4])


def length_of_last_word(s)
    idx , counter = s.length-1, 0
    while s[idx] == ' '
        idx -= 1
    end
    while idx >= 0 &&  s[idx] != ' '
        counter += 1
    end
    counter
end

# p length_of_last_word("   fly me   to   the moon  ")

def selectionSort(nums)
    # debugger
    for i in 0...nums.length
        current = i
        while current > 0 && nums[current] < nums[current-1]
            nums[current], nums[current-1] = nums[current-1], nums[current]
            current -= 1
        end
    end
    nums
end

# p selectionSort([3,2,0,9,4,7,10,5,1,6,8])


def length_of_longest_substring(s)
    left, right, max = 0, 0, 0
    window = []
    while right < s.length
        if window.include?(s[right])
            window.delete(s[left])
            left += 1
        else
            window.append(s[right])
            max = [max, window.length].max
            right += 1
        end
    end
    max
end

# puts length_of_longest_substring("abcabcbb")
# puts length_of_longest_substring("bbbbb")
# puts length_of_longest_substring("pwwkew")

