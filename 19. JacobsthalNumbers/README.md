# 🎯 Jacobsthal Number Challenge

## Description
The **Jacobsthal numbers** form a sequence where each term is obtained by adding the previous term to twice the term two positions before. The sequence is defined as follows:

$J_n = J_{n-1} + 2 \times J_{n-2}$

With the initial values:
- $ J_0 = 0$
- $ J_1 = 1$

The first Jacobsthal numbers are: **0, 1, 1, 3, 5, 11, 21, 43, 85, ...**

### Example 1:
```
Input: n = 5  
Output: 11 (The fifth Jacobsthal number is 11)
```

### Example 2:
```
Input: n = 7  
Output: 43 (The seventh Jacobsthal number is 43)
```

## Tasks:
1. Write a Java function to compute the **n-th Jacobsthal number** using recursion.
2. Optimize the solution using **memoization** to improve efficiency.
3. Implement test cases for different values of $ n $.

## Constraints:
- The input number $ n $ is a non-negative integer.
- Optimize for efficiency when possible.

Good luck! 🚀

