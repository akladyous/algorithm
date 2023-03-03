

var findMaxAverage1 = function (nums, k) {
    let maxAvg = -(10**4);
    for(let left=0; left <= nums.length-k; left++){
        let windowSum = 0;
        for(let right=left; right < left+k; right++){
            windowSum += nums[right]
        };
        maxAvg = Math.max(maxAvg, windowSum / k);
    };
    return maxAvg;

};

var findMaxAverage2 = function (nums, k) {
    let maxAvg = [];
    for (let left = 0; left <= nums.length - k; left++) {
        let windowSum = 0;
        for (let right = left; right < left + k; right++) {
            windowSum += nums[right];
        }
        maxAvg.push(windowSum/k);
    }
    return Math.max(...maxAvg);
};

var findMaxAverage = function (nums, k) {
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
    return Math.max(...maxAvg);
};


let x = [
    8860, -853, 6534, 4477, -4589, 8646, -6155, -5577, -1656, -5779, -2619,
    -8604, -1358, -8009, 4983, 7063, 3104, -1560, 4080, 2763, 5616, -2375, 2848,
    1394, -7173, -5225, -8244, -809, 8025, -4072, -4391, -9579, 1407, 6700,
    2421, -6685, 5481, -1732, -8892, -6645, 3077, 3287, -4149, 8701, -4393,
    -9070, -1777, 2237, -3253, -506, -4931, -7366, -8132, 5406, -6300, -275,
    -1908, 67, 3569, 1433, -7262, -437, 8303, 4498, -379, 3054, -6285, 4203,
    6908, 4433, 3077, 2288, 9733, -8067, 3007, 9725, 9669, 1362, -2561, -4225,
    5442, -9006, -429, 160, -9234, -4444, 3586, -5711, -9506, -79, -4418, -4348,
    -5891,
];
console.log(findMaxAverage(x, 93));
console.log(findMaxAverage([-1], 1));
console.log(findMaxAverage([5], 1));
console.log(findMaxAverage([1, 12, -5, -6, 50, 3], 4));