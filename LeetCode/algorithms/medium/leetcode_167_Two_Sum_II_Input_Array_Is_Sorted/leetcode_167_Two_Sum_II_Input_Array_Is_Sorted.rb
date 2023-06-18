# @param {Integer[]} numbers
# @param {Integer} target
# @return {Integer[]}
def two_sum(numbers, target)
    leftIndex, rightIndex = 0, numbers.length-1
    while leftIndex < rightIndex
        return [leftIndex + 1, rightIndex + 1] if numbers[leftIndex] + numbers[rightIndex] == target
        if numbers[leftIndex] + numbers[rightIndex] < target
           leftIndex += 1
        else
            rightIndex -= 1
        end
    end
end