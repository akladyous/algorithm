def find_averages_of_subarrays1(k, arr)
    result = []
    for i in 0..arr.length - k
        sum = 0
        for j in i..i+k-1
            sum += arr[j] 
        end
        result.push(sum.to_f/k)
    end
    result
end

def find_averages_of_subarrays2(k, arr)
    result = Array.new(k)
    leftIndex, rightIndex, sum  = 0, 0, 0
    # debugger
    while rightIndex < arr.length
        sum += arr[rightIndex]
        if rightIndex >= k - 1
            result.push(sum.to_f / k)
            sum -= arr[leftIndex]
            leftIndex += 1
        end
        rightIndex += 1
    end
    result
end

p find_averages_of_subarrays2(5, [1, 3, 2, 6, -1, 4, 1, 8, 2])
