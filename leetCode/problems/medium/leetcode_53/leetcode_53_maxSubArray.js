var maxSubArray = function(nums) {
    currentMax = nums[0]
    currentSum = 0
    for(let n of nums){
        if(currentSum < 0){
            currentSum = 0
        };
        currentSum += n
        currentMax = Math.max(currentMax, currentSum)
    };
    return currentMax;
};