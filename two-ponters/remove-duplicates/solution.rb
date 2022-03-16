

def remove_duplicates(nums)
    left = 1
    for right in 1...nums.length
        if nums[right] != nums[right - 1]
            nums[left] = nums[right]
            left += 1
        end
    end
    left
end

puts remove_duplicates([1,1,2])
puts remove_duplicates([0,0,1,1,1,2,2,3,3,4])