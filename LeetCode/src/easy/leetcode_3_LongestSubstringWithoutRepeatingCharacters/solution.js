function lengthOfLongestSubstring(s=new String){
    let left = 0;
    let right = 0;
    let max = 0;
    let window = new Set();
    while(right < s.length){
        if(!window.has(s[right])){
            window.add(s[right]);
            right ++
            max = Math.max(max, window.size)
        } else{
            window.delete(s[left])
            left ++
        }
    }
    return max
};
console.log(lengthOfLongestSubstring("abcabcbb"));
console.log(lengthOfLongestSubstring("abccabcabcc"));
console.log(lengthOfLongestSubstring("aaaabaaa"));
console.log(lengthOfLongestSubstring("pwwkew"));

/*

    ⬇-> left = 0
    a b c a b c b b
    ⬆ -> right = 0
   if charSet hasn't str[right] then: add str[right] to charSet.
    window = [a]
    max = 1

    ⬇ -> left = 0
    a b c a b c b b
     ⬆ -> right = 1
    if charSet hasn't str[right]: then add str[right] to charSet.
    window = [a,b]
    max = 2

    ⬇-> left = 0
    a b c a b c b b
       ⬆ -> right = 2
    window = [a,b,c]
    max = 3

    ⬇-> left index = 0 -> str[left] = 'a'
    a b c a b c b b
         ⬆ -> right index = 3 and str[right] = 'a'
    [a,b,c] charSet
         if charSet has str[right] == 'a'
         then: remove str[left] which is 'a' from charSet

    
      ⬇-> left = 1
    a b c a b c b b
    X    ⬆ -> right = 3
    window = [b,c]
*/