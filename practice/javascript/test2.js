function binarySearch(array = new Array, target) {
    let left = 0
    let right = array.length - 1
    while (left <= right) {
        let middle = Math.floor((left + right) / 2)
        if (array[middle] == target) {
            return target
        };
        if (array[middle] < target) {
            left = middle + 1
        } else {
            right = middle - 1
        }
    };
    return -1;
};
console.log(binarySearch([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 4));
