require 'set'

def contains_duplicate(nums)
    hashSet = Set.new
    for i in 0..nums.length
        unless hashSet.include?(nums[i])
            hashSet.add(nums[i])
        else
            return true
        end
    end
    false
end

puts contains_duplicate [1,2,3,1]