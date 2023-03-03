/*
58. Length of Last Word
Easy

Share
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/

var lengthOfLastWord = function (s) {
    let pointer = s.length - 1;
    let wordLength = 0;
    while (s[pointer] === " ") {
        pointer--;
    }
    while (pointer >= 0 && s[pointer] !== " ") {
        wordLength++;
        pointer--;
    }
    return wordLength;
};
console.log(lengthOfLastWord("Hello World"));
console.log(lengthOfLastWord("   fly me   to   the moon  "));
console.log(lengthOfLastWord("luffy is still joyboy"));
