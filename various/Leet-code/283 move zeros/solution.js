
var moveZeroes = function (nums) {
    left = 0;
    for (let right = 0; right < nums.length; right++) {
        if (nums[right] !== 0) {
            if (right > left) {
                [nums[left], nums[right]] = [nums[right], nums[left]];
            }
            left++;
        }
    }
    return nums;
};
console.log(moveZeroes([0, 23, 0, 0, 10, 2, 0, 0, 7]));
console.log(moveZeroes([10, 2, 0, 0, 7]));