# 🎯 Padovan Number Challenge

## Description
The **Padovan numbers** form a sequence where each term is the sum of the two preceding terms, but with an offset of two positions. The sequence is defined as follows:

$P_n = P_{n-2} + P_{n-3}$

With the initial values:
- $ P_0 = 1$
- $ P_1 = 1$
- $ P_2 = 1$

The first Padovan numbers are: **1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, ...**

### Example 1:
```
Input: n = 5  
Output: 3 (The fifth Padovan number is 3)
```

### Example 2:
```
Input: n = 8  
Output: 7 (The eighth Padovan number is 7)
```

## Tasks:
1. Write a Java function to compute the **n-th Padovan number** using recursion.
2. Optimize the solution using **memoization** to improve efficiency.
3. Implement test cases for different values of $ n $.

## Constraints:
- The input number $ n $ is a non-negative integer.
- Optimize for efficiency when possible.

Good luck! 🚀

