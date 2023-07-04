from typing import List

def remove_duplicates(arr: List[int]) -> int:
    leftIndex = 0
    for rightIndex in range(len(arr)):
        if arr[rightIndex] != arr[leftIndex]:
            leftIndex += 1
            arr[leftIndex] = arr[rightIndex]
    return leftIndex + 1
print(remove_duplicates([0,0,1,1,1,2,2]))