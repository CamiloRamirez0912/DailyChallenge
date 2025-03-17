# 🎯 Perrin Number Challenge

## Description
The **Perrin numbers** form a sequence where each term is the sum of the two preceding terms, but with an offset of two positions. The sequence is defined as follows:

$P_n = P_{n-2} + P_{n-3}$

With the initial values:
- $ P_0 = 3 $
- $ P_1 = 0 $
- $ P_2 = 2 $

The first Perrin numbers are: **3, 0, 2, 3, 2, 5, 5, 7, 10, 12, 17, ...**

### Example 1:
```
Input: n = 5  
Output: 5 (The fifth Perrin number is 5)
```

### Example 2:
```
Input: n = 7  
Output: 7 (The seventh Perrin number is 7)
```

## Tasks:
1. Write a Java function to compute the **n-th Perrin number** using recursion.
2. Optimize the solution using **memoization** to improve efficiency.
3. Implement test cases for different values of $ n $.

## Constraints:
- The input number $ n $ is a non-negative integer.
- Optimize for efficiency when possible.

Good luck! 🚀

