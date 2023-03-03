
var removeDuplicates = function (nums) {
    let left = 0;
    for (let right = 0; right < nums.length; right++) {
        if (nums[right] !== nums[left]) {
            left++;
            nums[left] = nums[right];
        }
    }
    return left + 1;
};

console.log(remove_duplicates([0, 0, 1, 1, 1, 2, 2]));