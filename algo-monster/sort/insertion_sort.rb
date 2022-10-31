unsorted_list = [5, 3, 1, 2, 4, 8, 6, 9, 7, 10]

def insertion_sort(nums)
  for i in 0...nums.length
    current = i
    while current > 0 && nums[current] < nums[current - 1]
      nums[current - 1], nums[current] = nums[current], nums[current -1]
      current -= 1
    end
  end
  nums
end
p insertion_sort(unsorted_list)
