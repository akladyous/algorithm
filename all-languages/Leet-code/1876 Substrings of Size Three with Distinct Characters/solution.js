// with string

var countGoodSubstrings1 = function (s) {
    let left = 0;
    let result = 0;

    while (left <= s.length - 3) {
        let right = left;
        let subStr = "";
        for (let right = left; right < left + 3; right++) {
            if (!subStr.includes(s.at(right))) {
                subStr += s.charAt(right);
            } else {
                break;
            }
        }
        if (subStr.length === 3) result++;
        left++;
    }
    return result;
};

var countGoodSubstrings = function (s) {
    let left = 0;
    let result = 0;
    
    while (left <= s.length-3){
        let subStr = new Set();
        for(let right = left; right < left+3; right++){
            subStr.add(s.charAt(right))
        };
        if (subStr.size === 3) result ++
        left ++
    };
    return result;
};

console.log(countGoodSubstrings("xyzzaz"));
console.log(countGoodSubstrings("aababcabc"));