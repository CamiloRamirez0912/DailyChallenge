# 🎯 Eulerian Number Challenge

## Description
The **Eulerian number** $A(n, m)$ counts the number of permutations of $n$ elements with exactly $m$ ascents. An **ascent** occurs when an element is greater than the previous one in the permutation.

The numbers are defined recursively as:

$A(n, m) = (n - m) \times A(n - 1, m - 1) + (m + 1) \times A(n - 1, m)$

With base conditions:

$A(n, 0) = A(n, n-1) = 1$

## Examples
### Example 1:
```
Input: n = 4, m = 2  
Output: 11  
Explanation: There are 11 permutations of 4 elements with exactly 2 ascents.
```

### Example 2:
```
Input: n = 3, m = 1  
Output: 4  
Explanation: There are 4 permutations of 3 elements with exactly 1 ascent.
```

## Tasks:
1. Implement a **Java** function to compute the **Eulerian number** $A(n, m)$.
2. Provide both a **recursive** and an **iterative** solution (optional).
3. Add test cases for different values of $n$ and $m$.
4. Optimize the solution if possible.

## Constraints:
- $n$ is a positive integer.
- $m$ is in the range $0 \leq m < n$.
- The solution should be **efficient** for larger values of $n$.

💡 **Hint:** Dynamic programming can help avoid redundant calculations. 🔢

Good luck! 🚀

