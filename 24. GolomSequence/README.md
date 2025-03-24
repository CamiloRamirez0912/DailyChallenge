# 🎯 Golomb Sequence Challenge

## Description
The **Golomb sequence** is a non-decreasing integer sequence where each term describes how many times that number appears in the sequence. It is defined recursively as:

$G(1) = 1$

$G(n) = 1 + G(n - G(G(n - 1)))$

The first few terms of the Golomb sequence are:
**1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, ...**

## Examples
### Example 1:
```
Input: n = 6  
Output: 4  
```

### Example 2:
```
Input: n = 10  
Output: 5  
```

## Tasks:
1. Implement a **Java** function to compute the **n-th Golomb number**.
2. Provide both a **recursive** and an **iterative** solution using dynamic programming.
3. Add test cases for different values of $ n $.
4. Optimize the solution to handle large values of $ n $.

## Constraints:
- $ n $ is a positive integer.
- The solution should be **efficient** and avoid excessive recursion.

💡 **Hint:** Using an array to store previously computed values will significantly improve performance.

Good luck! 🚀

