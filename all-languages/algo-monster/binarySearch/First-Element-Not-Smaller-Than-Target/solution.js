

function first_not_smaller(arr, target){
    let left = 0
    let right = arr.length
    let matchIndex = -1
    while(left <= right){
        let middle = Math.floor((left + right) / 2)
        if(arr[middle] >= target){
            matchIndex = middle
            right = middle - 1
        } else{
            left = middle + 1
        }
    }
    return matchIndex;
};

console.log(first_not_smaller([2, 3, 5, 7, 11, 13, 17, 19], 10))
