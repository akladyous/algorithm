
def findFirstDuplicate1(arr)
    arr.each{ |v|
        return v if arr.count(v) >= 2
    }
    -1
end

def findFirstDuplicate2(nums)
    nums.select.with_index do |v,i|
        nums.index(v) != i
    end
end

def findFirstDuplicate3(nums)
    for i in 1..nums.length
        return nums[i-1] if nums[i...].include?(nums[i-1])
    end
    -1
end

# puts findFirstDuplicate1([1,2,3,4,0,9,9])
puts findFirstDuplicate2([1,3,3,4,2,2,2])