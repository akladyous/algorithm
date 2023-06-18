def max_sub_array(nums)
    currentMax = nums[0]
    currentSum = 0
    for num in nums
        currentSum = 0 if currentSum < 0
        currentSum += num
        currentMax = [currentMax, currentSum].max
    end
    currentMax
end