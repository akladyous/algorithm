

def max_sub_array_of_size_k(k, arr):
    left, right, max_win, sum = 0, 0, 0, 0
    while right < len(arr):
        sum += arr[right]
        if right >= k - 1:
            max_win = max(max_win, sum)
            sum -= arr[left]
            left += 1
        right += 1
    return max_win


print(max_sub_array_of_size_k(3, [2, 1, 5, 1, 3, 2]))
