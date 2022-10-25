require 'debug'

def bs(nums, target)
  left, right = 0, nums.length - 1
  while left < right
    middle = (left + right) / 2
    return middle if nums[middle] == target
    if nums[middle] < target
      left = middle + 1
    else
      right = middle - 1
    end
  end
end

puts bs([1,2,3,4,5,6,7,8,9,10], 8)

def two_sum2(nums, target)
  left, right = 0, nums.length - 1
  while left < right
    return [left+1 , right+1].to_s if nums[left] + nums[right] == target
    if nums[left] + nums[right] > target
      right -= 1
    else
      left += 1
    end
  end
end

# puts two_sum2([2,7,11,15], 9)
# puts two_sum2([2,3,4], 6)
# puts two_sum2([-1,0], -1)
