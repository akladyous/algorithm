from typing import List

from numpy import sort

unsorted_list = [5, 3, 1, 2, 4]


def sort_list(unsorted_list: List[int]) -> List[int]:
    for i in range(len(unsorted_list)):
        current = i
        while current > 0 and unsorted_list[current] < unsorted_list[current - 1]:
            unsorted_list[current - 1], unsorted_list[current] = unsorted_list[current], unsorted_list[current - 1]
            current -= 1
    return unsorted_list


if __name__ == '__main__':
    # unsorted_list = [int(x) for x in input().split()]
    res = sort_list(unsorted_list)
    print(' '.join(map(str, res)))
