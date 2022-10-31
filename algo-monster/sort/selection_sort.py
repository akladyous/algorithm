from typing import List

unsorted_list = [5, 3, 1, 2, 4, 8, 6, 9, 7, 10]
"""
first loop starts from 0 -> left
first supposed to be min_value so, track it with name of min_value
second loop starts from left + 1
left = 5 - right 3
if
    1- unsorted_list[j] -> (3) < unsorted_list[min_value] -> (5)
then
    min_value = j  -> point the min_value equal to the right index
    now minimum value is 3
    keep goin' j+= 1 so unsorted_list[j] = 1
    if unsorted_list[j] -> 1 less then unsorted_list[min_value] -> 3
    yes it is so
    min_value = J


meaning -> 3(right) < 5(min_value) -> then
compare every element starting from j
if unsorted_list[j] < unsorted_list[min_index] -> swap
"""


def selection_sort(unsorted_list: list[int]) -> list[int]:
    for i in range(len(unsorted_list)):
        min_value = i
        for j in range(i, len(unsorted_list)):
            if unsorted_list[j] < unsorted_list[min_value]:
                min_value = j
        unsorted_list[i], unsorted_list[min_value] = unsorted_list[min_value], unsorted_list[i]
    return unsorted_list


if __name__ == '__main__':
    print(selection_sort(unsorted_list))
