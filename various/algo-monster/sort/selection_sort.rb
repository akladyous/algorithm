nums = [5, 3, 1, 2, 4, 8, 6, 9, 7, 10]


def selection_sort(nums)
    for i in 0...nums.size
      min_value = i
      for j in i+1...nums.size
        if nums[j] < nums[min_value]
          min_value = j
        end
      end
      nums[i], nums[min_value] = nums[min_value], nums[i]
    end
    nums
end

p selection_sort(nums)
