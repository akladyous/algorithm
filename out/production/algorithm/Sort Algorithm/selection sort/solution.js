function selectionSort1(nums = new Array()) {
    for (let leftIndex = 0; leftIndex < nums.length; leftIndex++) {
        let minValueAtIndex = leftIndex;

        for ( let rightIndex = leftIndex + 1; rightIndex < nums.length; rightIndex++) {
            if (nums[rightIndex] < nums[minValueAtIndex]) {
                minValueAtIndex = rightIndex;
            }
        }
        if (minValueAtIndex != leftIndex) {
            let temp = nums[leftIndex];
            nums[leftIndex] = nums[minValueAtIndex];
            nums[minValueAtIndex] = temp;
        }
    }
    return nums;
}

const sort_list = function(list=new Array){
    for(let idx=0; idx < list.length; idx++){
        let current = idx;
        while(current > 0 && list[current] < list[current-1]){
            [list[current], list[current-1]] = [list[current-1], list[current]]
            current--;
        }
    }
    return list;
};



console.log(selectionSort2([23, 3, 5, 2, 1, 0, 56, 2, 11, 4]));
console.log(selectionSort2([4,2,1,3]));