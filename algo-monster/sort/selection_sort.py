from typing import List

unsorted_list = [5, 3, 1, 2, 4, 8, 6, 9, 7, 10]
"""
min_value = 5
compare every element starting from j
if unsorted_list[j] < unsorted_list[min_index] -> swap

"""


def selection_sort(unsorted_list: list[int]) -> list[int]:
    for i in range(len(unsorted_list)):
        min_index = i
        for j in range(i, len(unsorted_list)):
            if unsorted_list[j] < unsorted_list[min_index]:
                min_index = j
        unsorted_list[i], unsorted_list[min_index] = unsorted_list[min_index], unsorted_list[i]
    return unsorted_list


if __name__ == '__main__':
    print(selection_sort(unsorted_list))
