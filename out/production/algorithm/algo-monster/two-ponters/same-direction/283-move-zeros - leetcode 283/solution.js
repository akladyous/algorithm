
function moveZeros(nums = new Array){
    let left = 0;
    for(right = 0; right < nums.length; right++){
        if (nums[right] !== 0) {
            if(right > left){
                [nums[left], nums[right]] = [nums[right], nums[left]];
            };
            left++;
        };
    };
    return nums;
};

console.log(moveZeros([0,23,0,0,10,2,0,0,7]))
console.log(moveZeros([10,2,0,0,7]))