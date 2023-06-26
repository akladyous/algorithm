/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function (nums) {
  const count = {};
  let res = 0;
  for (const num of nums) {
    if (num in count) {
      res += count[num];
    }
    count[num] = (count[num] || 0) + 1;
  }
  return res;
};

// big O(n)
function solution_II(nums) {
  let res = 0;
  const count = new Array(101).fill(0);
  for (const a of nums) {
    res += count[a];
    count[a] += 1;
  }
  return res;
}

// big O(n^2)
function solution_I(nums) {
  const pairs = [];
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] === nums[j]) {
        pairs.push([nums[i], nums[j]]);
      }
    }
  }
  return pairs.length;
}

const nums1 = [1, 2, 3, 1, 1, 3];
console.log(numIdenticalPairs(nums1)); // Output: 4

const nums2 = [1, 1, 1, 1];
console.log(numIdenticalPairs(nums2)); // Output: 6

const nums3 = [1, 2, 3];
console.log(numIdenticalPairs(nums3)); // Output: 0
