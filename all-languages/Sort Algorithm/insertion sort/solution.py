from typing import List

def insertionSort(unsorted_list: List[int]) -> List[int]:
    n = len(unsorted_list)
    for i in range(n):
        min_index = i
        for j in range(i, n):
            if unsorted_list[j] < unsorted_list[min_index]:
                min_index = j
        unsorted_list[i], unsorted_list[min_index] = unsorted_list[min_index], unsorted_list[i]
    return unsorted_list


print(insertionSort([4,2,1,3]))
print(insertionSort([9, 10, 0, 2, 4, 9, 5, 1, 7, 3]))
