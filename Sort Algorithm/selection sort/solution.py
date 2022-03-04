
from select import select


def selectionSort(array):
    for left in range(len(array)):
        minValueAtIndex = left
        for right in range(left + 1, len(array)):
            if array[minValueAtIndex] > array[right]:
                minValueAtIndex = right
        array[minValueAtIndex], array[left] = array[left], array[minValueAtIndex]
    return array


print(selectionSort([8, 5, 2, 9, 5, 6, 3]))
