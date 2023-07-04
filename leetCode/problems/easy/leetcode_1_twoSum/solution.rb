
require 'debug'

def twoSum(nums, target)
    # debugger
    hash_map = Hash.new
    nums.each_with_index{
        |value, index|
        diff = target - value
        if hash_map.has_key?(diff)
            return [hash_map[diff], index]
        end
        hash_map.store(value, index)
    }

end

puts twoSum([2,7,11,15], 9)