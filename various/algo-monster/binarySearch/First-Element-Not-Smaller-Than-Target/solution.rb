=begin
Given an array of integers sorted in increasing order and a target, find the index of the first element in the array that is larger than or equal to the target. Assume that it is guaranteed to find a satisfying number.

Input:

arr = [1, 3, 3, 5, 8, 8, 10]
target = 2
Output:

1
Explanation: the first element larger than 2 is 3 which has index 1.
=end

def first_not_smaller(array, target)
    leftIndex, rightIndex = 0, array.length-1
    matchIndex = -1
    while leftIndex <= rightIndex
        middleIndex = (leftIndex + rightIndex) / 2
        if array[middleIndex] >= target
            matchIndex = middleIndex
            rightIndex = middleIndex - 1
        else
            leftIndex = middleIndex + 1
        end

    end
    matchIndex
end

puts first_not_smaller([1,3,3,5,8,8,10],2)