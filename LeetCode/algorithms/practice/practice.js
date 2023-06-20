/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
  let left = 0;
  let right = 0;
  let maxLen = 0;
  const window = new Set();

  while (right < s.length - 1) {
    if (!window.has(s.charAt(right))) {
      window.add(s.charAt(right));
      right++;
      maxLen = Math.max((maxLen, window.size));
    } else {
      window.delete(s.charAt(left));
      left++;
    }
  }
  return maxLen;
};
