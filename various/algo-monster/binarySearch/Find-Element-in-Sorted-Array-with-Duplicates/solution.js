

function find_first_occurrence(arr, target){
    let left = 0;
    let right = arr.length
    let matchIndex = -1
    while(left <= right){
        let middle = Math.floor((left + right) / 2);
        if(arr[middle] === target){
            matchIndex = middle;
            right = middle - 1;
        } else if(arr[middle] < target){
            left = middle + 1;
        } else{
            right = middle - 1;
        }
    };
    return matchIndex;
}


console.log(find_first_occurrence([2, 3, 5, 7, 11, 13, 17, 19], 3))