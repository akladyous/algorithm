var findMaxAverage = function(nums, k) {
    let maxAvg = new Array();
    let left = right = windowSum = 0;
    while (right < nums.length){
        windowSum += nums[right];
        if(right >= k-1){
            maxAvg.push(windowSum/k);
            windowSum -= nums[left];
            left ++;
        };
        right ++;
    }
    return Math.max(...maxAvg)
};
