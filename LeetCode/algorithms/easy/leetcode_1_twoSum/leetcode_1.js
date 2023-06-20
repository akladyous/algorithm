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
result = twoSum2([2, 7, 11, 15], 9);
console.log(result);

result = twoSum2([3, 1, 5, 6, 4, 3], 6);
console.log(result);

result = twoSum2([3, 2, 4], 6);
console.log(result);
