
def insertionSort(nums)
    for left in 0...nums.length
        minIndex = left
        for right in left...nums.length
            minIndex = right if nums[right] < nums[minIndex]
        end
        nums[left], nums[minIndex] = nums[minIndex], nums[left]
    end
    nums
end

p insertionSort([4,2,1,3])
p insertionSort([3,2,0,9,4,7,10,5,1,6,8])