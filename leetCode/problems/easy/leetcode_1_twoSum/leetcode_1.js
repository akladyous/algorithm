var twoSum = function (nums = [], target) {
  const indices = new Map();
  for (let i = 0; i < nums.length; i++) {
    diff = target - nums[i];
    if (indices.has(diff)) {
      return [indices.get(diff), i];
    }
    indices.set(nums[i], i);
  }
};

var twoSum2 = function (nums, target) {
  for (let left = 0; left < nums.length; left++) {
    for (let right = left + 1; right < nums.length; right++) {
      if (nums[left] + nums[right] == target) {
        return new Array(left, right);
      }
    }
  }
};

/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSumSortedArray = function (numbers, target) {
  let left = 0;
  let right = numbers.length - 1;
  while (left < right) {
    const sum = numbers[left] + numbers[right];
    if (sum === target) {
      return [left + 1, right + 1];
    } else if (sum > target) {
      right--;
    } else {
      left++;
    }
  }
};

result = twoSum([2, 7, 11, 15], 9);
console.log(result);
result = twoSum([3, 1, 5, 6, 4, 3], 6);
console.log(result);
result = twoSum([3, 2, 4], 6);
console.log(result);
console.log('-'.repeat(50));

result = twoSum2([2, 7, 11, 15], 9);
console.log(result);
result = twoSum2([3, 1, 5, 6, 4, 3], 6);
console.log(result);
result = twoSum2([3, 2, 4], 6);
console.log(result);
console.log('-'.repeat(50));
