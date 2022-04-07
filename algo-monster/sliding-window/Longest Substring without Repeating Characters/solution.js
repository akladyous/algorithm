function lengthOfLongestSubstring(s = new String()) {
    let left = right = result = 0;
    let window = new Set();
    while(right < s.length){
        if(!window.has(s[right])){
            window.add(s[right])
            right ++;
            result = Math.max(result, window.size)
        } else{
            window.delete(s[left])
            left ++;
        };
    };
    return result;
}

console.log(lengthOfLongestSubstring("abcabcbb"));
console.log(lengthOfLongestSubstring("abccabcabcc"));
console.log(lengthOfLongestSubstring("aaaabaaa"));
console.log(lengthOfLongestSubstring("pwwkew"));
