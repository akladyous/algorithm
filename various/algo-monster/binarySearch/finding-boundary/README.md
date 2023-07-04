Finding Boundary with Binary Search
Prereq: Binary Search Introduction

An array of boolean values is divided into two sections; the left section consists of all false and the right section consists of all true. Find the boundary of the right section, i.e. the index of the first true element. If there is no true element, return -1.

Input: arr = [false, false, true, true, true]

Output: 2

Explanation: first true's index is 2.


Explanation
The binary decision we have to make when we look at an element is

if the element is false, we discard everything to the left and the current element itself.
if the element is true, the current element could be the first true although there may be other true to the left. We discard everything to the right but what about the current element?
We can either keep the current element in the range or record it somewhere and then discard it. Here we choose the latter. We'll discuss the other approach in the alternative solution section.

We keep a variable boundary_index that represents the leftmost true's index currently recorded. If the current element is true, then we update boundary_index with its index and discard everything to the right including the current element itself since its index has been recorded by the variable.

Time Complexity: O(log(n))

