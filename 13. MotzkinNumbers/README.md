# 🎯 Motzkin Number Challenge

## Description
The **Motzkin numbers** form a mathematical sequence used in combinatorics, defined by the recurrence relation:

\[
M_n = M_{n-1} + \sum_{k=0}^{n-2} M_k M_{n-2-k}
\]

With the initial values:
- \( M_0 = 1 \)
- \( M_1 = 1 \)

The first Motzkin numbers are: **1, 1, 2, 4, 9, 21, 51, 127...**

### Example 1:
```
Input: n = 4  
Output: 9 (The fourth Motzkin number is 9)
```

### Example 2:
```
Input: n = 6  
Output: 51 (The sixth Motzkin number is 51)
```

## Tasks:
1. Write a Java function to compute the **n-th Motzkin number**.
2. Use memoization or an iterative approach to optimize the computation.

## Constraints:
- The input number \( n \) is a non-negative integer.
- Optimize your solution for efficiency.

Good luck! 🚀