from typing import List

unsorted_list = [5, 3, 1, 2, 4, 8, 6, 9, 7, 10]


def bubble_sort(unsorted_list: List[int]) -> List[int]:
    n = len(unsorted_list)
    for i in reversed(range(n)):
        swapped = False
        for j in range(i):
            if unsorted_list[j] > unsorted_list[j + 1]:
                unsorted_list[j], unsorted_list[j + 1] = unsorted_list[j + 1], unsorted_list[j]
                swapped = True
        if not swapped:
            return unsorted_list
    return unsorted_list


print(bubble_sort((unsorted_list)))
