

function contains_nearby_duplicate(nums, k){
    const hashMap = new Map;
    for(let i= 0; i < nums.length; i++){
        let currValue = nums[i]
        if( hashMap.has(currValue) && Math.abs(i - hashMap.get(currValue)) <= k ){
            return true
        } else {
            hashMap.set(currValue, i)
        };
    };
    return false
};

console.log(contains_nearby_duplicate([1,2,3,1,2,3], 2))
console.log(contains_nearby_duplicate([1,2,3,1], 3))
console.log(contains_nearby_duplicate([1,0,1,1], 1))