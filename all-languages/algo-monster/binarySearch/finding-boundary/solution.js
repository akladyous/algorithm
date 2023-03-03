
function find_boundary(array){
    left = 0
    right = array.length
    matchIndex = 0
    while(left <= right){
        let middle = Math.floor((left + right) / 2)
        if(array[middle]){
            matchIndex = middle
            right = middle - 1
        } else{
            left = middle + 1
        }
    };
    return matchIndex;
};

console.log(find_boundary([false, false, true, true, true, true]));