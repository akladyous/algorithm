=begin
283. Move Zeroes
Easy

8505

230

Add to List

Share
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
=end

def move_zeroes(nums)
    left = 0
    for right in 0...nums.length
        if nums[right] != 0
            nums[right], nums[left] = nums[left], nums[right]
            left += 1
        end
    end
    nums
end

puts move_zeroes([0,1,0,3,12]);nil
puts move_zeroes([0]);nil