# ✨ Delannoy Numbers Challenge

## Description
The **Delannoy numbers** count the number of paths from the top-left corner of an $ m \times n $ grid to the bottom-right corner, allowing three types of movements:

- **Right** $(m, n-1)$
- **Down** $(m-1, n)$
- **Diagonally Down-Right** $(m-1, n-1)$

The recursive formula is:

$D(m, n) = D(m-1, n) + D(m, n-1) + D(m-1, n-1)$

With the base cases:

$D(0, 0) = 1, \quad D(m, 0) = 1, \quad D(0, n) = 1$

The first few values in the sequence are: **1, 1, 3, 13, 63, 321, 1683...**

---

## Example 1
```
Input: m = 2, n = 2  
Output: 13
```

## Example 2
```
Input: m = 3, n = 3  
Output: 63
```

---

## Tasks
1. Implement a function in **Java** to compute the **Delannoy number** using recursion.
2. Optimize the function using **memoization** to improve efficiency.
3. (Optional) Compute the Delannoy number for a large grid (e.g., $ 5 \times 5 $).

---

## Constraints
- The input numbers $ m, n $ are non-negative integers.
- Optimize the solution for large values of $ m, n $.

Happy coding! 🚀