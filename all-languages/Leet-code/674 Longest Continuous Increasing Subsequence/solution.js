// 674. Longest Continuous Increasing Subsequence
// Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.

// A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

// Example 1:

// Input: nums = [1,3,5,4,7]
// Output: 3
// Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
// Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
// 4.
// Example 2:

// Input: nums = [2,2,2,2,2]
// Output: 1
// Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
// increasing.

function findLengthOfLCIS(nums = []) {
    let result = 1;
    let anchor = 0;
    for (let index = 1; index < nums.length; index++) {
        if (nums[index - 1] >= nums[index]) anchor = index;
        result = Math.max(result, index - anchor + 1);
    }
    return result;
};
console.log(findLengthOfLCIS([1, 3, 5, 4, 7]))


/*
    1-Sliding Window: start at index [0] of by setting the "anchor" = 0.
    2-Sliding Window expands until hit last the last element in the array.
    3-keep "anchor" set to 0 until the left element is greater than or equal
      to the right element in the sliding window.
      [3,4] -> sliding window
      ⬇-> anchor = 0
     [1,3,5,4,7]
        ⬆ -> index = 1
    4-otherwise set "anchor" to the current index
          ⬇-> anchor = 2
     [1,3,5,4,X]
          ⬆ -> index = 2
    5-on each iteration set the result to the MAX of "result" itself
      and the current "index" minus the "anchor"
          ⬇-> anchor = 2
      [1,3,5,4,7]
          ⬆ -> index = 2
                             ⬇result = 2
                                 ⬇ index = 2
                                         ⬇ set to one since JS index start from 0
      result = Max number of (2, (2 - 2 + 1)) == 2;
                              ⬆ size of sliding window
        */