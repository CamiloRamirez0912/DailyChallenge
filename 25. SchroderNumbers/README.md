# 🎯 Schröder Numbers Challenge

## Description
The **Schröder numbers** form a mathematical sequence that counts certain combinatorial structures, such as restricted lattice paths and binary tree formations. The sequence is defined by the recurrence relation:

$S_n = 3S_{n-1} + \sum_{k=1}^{n-2} S_k S_{n-k-1}$

With the initial values:
- $ S_0 = 1 $
- $ S_1 = 2 $
- $ S_2 = 6 $
- $ S_3 = 22$
- $ S_4 = 90$

## Examples
### Example 1:
```
Input: n = 4  
Output: 90  
```

### Example 2:
```
Input: n = 5  
Output: 394  
```

## Tasks:
1. Implement a **Java** function to compute the **n-th Schröder number**.
2. Provide both a **recursive** and an **iterative** solution using dynamic programming.
3. Add test cases for different values of $ n $.

## Constraints:
- $ n $ is a non-negative integer.
- The solution should be **efficient** and scalable.

💡 **Hint:** Schröder numbers are related to counting binary tree structures and polygon partitions.

Good luck! 🚀

