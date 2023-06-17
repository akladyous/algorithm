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

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double globalMax = Double.NEGATIVE_INFINITY; // Decision holder, which will be compared against localMax
        double localMax = 0; // Sum of one group of k elements


        // Iterate through the whole array elements
        for(int i = 0; i < nums.length; ++i){

            // Add up all k elements of a particular group
            localMax+=nums[i];
            // If k number of elements are summed up
            // check whether their average is greater than the max average so far
            if(i >= k-1){
                // if so, new max average will be assigned
                globalMax = Math.max(globalMax, localMax/k);
                // In order to calculate new k number of elements
                // remove first value of 1....k elements from the localMax
                localMax -= nums[i-k+1];
            }
        }
        // Going to be maximum average
        return globalMax;
    }
}