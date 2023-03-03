// find first duplicate
const findFirstDuplicate1 = (nums = new Array()) => {
    for (let i = 0; i < nums.length - 2; i++) {
        if (nums.includes(nums[i], i + 1)) {
            return nums[i];
        }
    }
    return -1;
};
const findFirstDuplicate2 = (nums = new Array()) => {
    return (
        nums.find((value, index, array) => array.indexOf(value) != index) || -1
    );
};


function findFirstDuplicate3(nums) {
    const match = new Map();
    for (i = 0; i < nums.length; i++) {
        if (match.has(nums[i])) {
            return nums[i];
        } else {
            match.set(nums[i], i);
        }
    }
    return -1;
}

console.log(findFirstDuplicate1(nums));
