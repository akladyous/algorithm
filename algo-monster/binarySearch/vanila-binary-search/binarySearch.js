function binarySearch(array = new Array(), target) {
    let leftIdx = 0;
    let rightIdx = array.length - 1;
    while (leftIdx <= rightIdx) {
        let middleIdx = Math.floor((leftIdx + rightIdx) / 2)

        if (array[middleIdx] == target) {
            return middleIdx;
        }

        if(array[middleIdx] < target){
            leftIdx = middleIdx + 1;
        } else{
            rightIdx = middleIdx - 1;
        };
    }
    return -1;
}

console.log(binarySearch([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 6));
