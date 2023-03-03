=begin
Finding Boundary with Binary Search
Prereq: Binary Search Introduction

An array of boolean values is divided into two sections; the left section consists of all false and the right section consists of all true. Find the boundary of the right section, i.e. the index of the first true element. If there is no true element, return -1.

Input: arr = [false, false, true, true, true]

Output: 2

Explanation: first true's index is 2.

=end

def find_boundary(array)
    leftIndex, rightIndex = 0, array.length-1
    boundaryIndex = -1
    while leftIndex <= rightIndex
        middleIndex = (leftIndex + rightIndex) / 2
        if array[middleIndex]
            boundaryIndex = middleIndex
            rightIndex = middleIndex - 1
        else
            leftIndex = middleIndex + 1
        end
    end
    return boundaryIndex
end
puts find_boundary([false, false, false, true, true, true])

#             0      1      2      3    4      5
# testcase [FALSE, FALSE, FALSE, TRUE, TRUE, TRUE]


#             0      1      2      3    4      5
# testcase [FALSE, FALSE, TRUE, TRUE, TRUE, TRUE]
#                          ↑ middle index
#                     ↑ middle index

