

const insertionSort = (nums=new Array) => {
    for(let left= 0; left < nums.length; left ++){
        let minIndex = left;
        for(let right = left; right < nums.length; right ++){
            if(nums[right] < nums[minIndex]) {
                minIndex = right
            };
        };
        [nums[left], nums[minIndex]] = [nums[minIndex], nums[left]]
    };
    return nums;
};

console.log(insertionSort([4,2,1,3]))
console.log(insertionSort([3,2,0,9,4,7,10,5,1,6,8]))