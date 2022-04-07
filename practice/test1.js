function binarySearch(array = new Array(), target) {
    left = 0
    right = array.length
    while (left <= right){
        let middle = Math.floor((left + right) / 2)
        if(array[middle] === target) return middle
        if(array[middle] < target){
            right = middle + 1
        } else{
            left = middle + 1
        };
    };
    return -1
};

// console.log(binarySearch([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 6));

var lengthOfLastWord = function (s) {
    let pointer = s.length - 1;
    let wordLength = 0;
    while(s[pointer] === ' '){
        pointer --;
    };
    while(pointer >= 0 && s[pointer] !== ' '){
        wordLength ++;
        pointer --;
    };
    return wordLength;
};
console.log(lengthOfLastWord("Hello World"));