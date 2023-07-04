/*
125. Valid Palindrome
Easy

Share
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/
var isPalindrome = function (s) {
    let left = 0;
    let right = s.length - 1;
    while (left < right) {
        while (left < right && s[left].match(/[\W_]/g) !== null) {
            left++;
        }
        while (right > left && s[right].match(/[\W_]/g) !== null) {
            right--;
        }

        if (s[left].toUpperCase() != s[right].toUpperCase()) {
            return false;
        }
        left++;
        right--;
    }
    return true;
};

console.log(isPalindrome("A man, a plan, a canal: Panama"))
console.log(isPalindrome("race a car"))
console.log(isPalindrome(" "))
console.log(isPalindrome(" A brown fox jumping over"))
