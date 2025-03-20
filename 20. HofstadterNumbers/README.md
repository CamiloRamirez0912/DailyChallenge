# 🎯 Hofstadter-Q Number Challenge

## Description
The **Hofstadter-Q sequence** is a recursive sequence defined as follows:

$Q(n) = Q(n - Q(n - 1)) + Q(n - Q(n - 2))$

With the initial values:
- $ Q(1) = 1$
- $ Q(2) = 1$

The first Hofstadter-Q numbers are: **1, 1, 2, 3, 3, 4, 5, 5, 6, 6, 7, ...**

### Example 1:
```
Input: n = 5  
Output: 3 (The fifth Hofstadter-Q number is 3)
```

### Example 2:
```
Input: n = 10  
Output: 6 (The tenth Hofstadter-Q number is 6)
```

## Tasks:
1. Write a Java function to compute the **n-th Hofstadter-Q number** using recursion.
2. Optimize the solution using **memoization** to improve efficiency.
3. Implement test cases for different values of $n$.

## Constraints:
- The input number $n$ is a positive integer.
- Optimize for efficiency when possible.

Good luck! 🚀

