
def twoSum(nums, target):
    hashMap = {}
    for i, n in enumerate(nums):
        diff = target - n
        if diff in hashMap:
            return [hashMap[diff], i]
        hashMap[n] = i
    return

print(twoSum([2,7,11,15], 9))