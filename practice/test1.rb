
def binarySearch(array, target)
    left, right = 0, array.length
    while left <= right
        middle = (left + right) / 2
        return middle if array[middle] == target
        if array[middle] < target
            right = middle - 1
        else
            left = middle + 1
        end
    end
    -1
end

puts binarySearch([1,3,6,8,9,10], 8)