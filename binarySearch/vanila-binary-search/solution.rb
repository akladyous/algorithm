
def binarySearch(array, target)
    leftIndex, rightIndex = 0, array.length-1
    while leftIndex <= rightIndex
        middleIndex = (leftIndex + rightIndex) / 2
        return middleIndex if array[middleIndex] == target
        if array[middleIndex] < target
            leftIndex = middleIndex + 1
        else
            rightIndex = middleIndex - 1
        end
    end
    -1
end

puts binarySearch([1,3,6,8,9,10], 8)