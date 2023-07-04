=begin

Find Element in Sorted Array with Duplicates
Prereq: Vanilla Binary Search and Finding Boundary with Binary Search

Given a sorted array of integers and a target integer, find the first occurrence of the target and return its index. Return -1 if the target is not in the array.

Input:

arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]
target = 3
Output:

1
Explanation: First occurrence of 3 is at index 1.

=end

def find_first_occurrence(array, target)
    leftIndex, rightIndex = 0, array.length - 1
    matchingIndex = -1
    if array[middleIndex] == target
        matchingIndex = middleIndex
        rightIndex = middleIndex - 1
    else
        leftIndex = middleIndex + 1
    end
    matchingIndex
end