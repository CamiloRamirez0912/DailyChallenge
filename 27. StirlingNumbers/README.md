# ✨ Stirling Numbers of the Second Kind Challenge

## Description
The **Stirling numbers of the second kind**, denoted as **S(n, k)**, count the number of ways to partition a set of **n elements** into exactly **k non-empty subsets**.

They are defined recursively as:

$S(n, k) = k \cdot S(n-1, k) + S(n-1, k-1)$

With base cases:

$S(0, 0) = 1, \quad S(n, 0) = 0 \ (n > 0), \quad S(0, k) = 0 \ (k > 0), \quad S(n, n) = 1$

The first few values of **S(n, k)** are:

| $ n \backslash k $ | 1 | 2 | 3 | 4 | 5 |
|----------------|---|---|---|---|---|
| 1              | 1 |   |   |   |   |
| 2              | 1 | 1 |   |   |   |
| 3              | 1 | 3 | 1 |   |   |
| 4              | 1 | 7 | 6 | 1 |   |
| 5              | 1 | 15 | 25 | 10 | 1 |

---

## Example 1
```
Input: n = 4, k = 2  
Output: 7
```

## Example 2
```
Input: n = 5, k = 3  
Output: 25
```

---

## Tasks
1. Implement a **Java** function to compute **S(n, k)** recursively.
2. Optimize the solution using **memoization** or **dynamic programming**.
3. *(Optional)* Generate a table of Stirling numbers for values up to **n, k ≤ 10**.

---

## Constraints
- $ n $ and $ k $ are positive integers where $ n \geq k $.
- The solution should handle large values of $ n $ efficiently.

Good luck! 🚀

