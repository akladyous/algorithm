from typing import List

def remove_duplicates(arr: List[int]) -> int:
    # WRITE YOUR BRILLIANT CODE HERE
    slow = 0
    for fast in range(len(arr)):
        if arr[fast] != arr[slow]:
            slow += 1
            arr[slow] = arr[fast]
    return slow + 1

print(remove_duplicates([0,0,1,1,1,2,2]))