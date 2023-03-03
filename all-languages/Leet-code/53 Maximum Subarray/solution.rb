require 'debug'

def max_sub_array1(nums)
    currentMax = nums[0]
    debugger
    for i in 0..nums.length-1
        for j in i..nums.length-1
            currentSum = 0
            for k in i..j
                currentSum += nums[k]
            end
            currentMAx = [currentMax, currentSum].max
        end
    end
    currentMax
end
# [-2, 1, -3, 4, -1, 2, 1, -5, 4]
#  ↑__________________________↑
#      ↑______________________↑
#         ↑___________________↑
#            ↑________________↑
#               ↑_____________↑
#                   ↑_________↑
#                       ↑_____↑
#                          ↑__↑
def max_sub_array2(nums)
    currentMax = nums[0]
    for i in 0..nums.length-1
        currentSum = 0
        for j in i..nums.length-1
            currentSum += nums[j]
            currentMax = [currentMax, currentSum].max
        end
    end
    currentMax
end

def max_sub_array3(nums)
    currentMax = nums[0]
    currentSum = 0
    for num in nums
        currentSum = 0 if currentSum < 0
        currentSum += num
        currentMax = [currentMax, currentSum].max
    end
    currentMax
end

puts max_sub_array3([-2,1,-3,4,-1,2,1,-5,4])