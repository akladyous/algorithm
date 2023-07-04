require 'debug'

def searchInsert(nums, target)
    # debugger
    idx = 0
    while target > nums[idx] && idx < nums.length-1
        idx += 1
    end
    while idx <= nums.length-1
        if target <= nums[idx]
            return idx
        else
            return idx+ 1
        end
    end

end

puts searchInsert([1,3,5,6], 5)
puts searchInsert([1,3,5,6], 7)
puts searchInsert([1,3,5,6], 2)