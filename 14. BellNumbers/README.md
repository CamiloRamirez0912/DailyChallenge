# 🎯 Bell Number Challenge

## Description
The **Bell numbers** form a mathematical sequence used in combinatorics, which count the number of ways to partition a set into non-empty subsets. They are defined by the recurrence relation:

\[
B_n = \sum_{k=0}^{n-1} \binom{n-1}{k} B_k
\]

With the initial values:
- \( B_0 = 1 \)
- \( B_1 = 1 \)
- \( B_2 = 2 \)
- \( B_3 = 5 \)
- \( B_4 = 15 \)

The first Bell numbers are: **1, 1, 2, 5, 15, 52, 203...**

### Example 1:
```
Input: n = 4  
Output: 15 (The fourth Bell number is 15)
```

### Example 2:
```
Input: n = 6  
Output: 203 (The sixth Bell number is 203)
```

## Tasks:
1. Write a Java function to compute the **n-th Bell number**.
2. Use memoization or an iterative approach to optimize the computation.
3. (Optional) Generate all Bell numbers up to a certain limit (e.g., \( n = 10 \)).

## Constraints:
- The input number \( n \) is a non-negative integer.
- Optimize your solution for efficiency.

Good luck! 🚀

