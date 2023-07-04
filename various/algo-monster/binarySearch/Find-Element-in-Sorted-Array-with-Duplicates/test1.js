function binarySearch(array = new Array(), target) {
    debugger
    let left = 0;
    let right = array.length - 1;
    while (left <= right){
        let middle = Math.floor((left + right) / 2)
        if(array[middle] === target){
            return middle;
        }
        if(array[middle] < target){
            left = middle + 1;
        } else {
            right = middle - 1;
        }
    }
    return -1;
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
// console.log(lengthOfLastWord("Hello World"));

var twoSum = function (nums, target) {
    let hashMap = new Map();
    for(let i = 0; i < nums.length; i++){
        let diff = target - nums[i];
        if(hashMap.has(diff)){
            return [hashMap.get(diff), i];
        };
        hashMap.set(nums[i], i);
    };
};
// console.log(twoSum([2, 7, 11, 15], 17));
function lengthOfLongestSubstring(s = new String()){
    let left = 0
    let right = 0
    let result = 0
    window = new Set()
    while(right < s.length){
        if(!window.has(s[right])){
            window.add(s[right])
            right ++
            result = Math.max(result, window.size)
        } else{
            window.delete(s[left])
            left ++
        }
    }
    return result
}
console.log(lengthOfLongestSubstring("abcabcbb"));