
var removeElement = function (nums, val) {
    let left = 0;
    for(right = 0; right < nums.length; right++){
        if(nums[right] !== val){
            nums[left] = nums[right];
            left ++;
        };
    };
    return left;
};
console.log(removeElement([3, 2, 2, 3], 3));
console.log(removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2));
