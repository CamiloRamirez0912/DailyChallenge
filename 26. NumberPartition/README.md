# 🔢 Number Partition Challenge

## Description
The **partition number** of an integer $ n $ is the number of ways it can be expressed as a sum of positive integers, disregarding the order of the summands.

It is denoted as **$ P(n) $** and is recursively defined as:

$P(n) = \sum_{k=1}^{n} (-1)^{k+1} \cdot \left[ P(n - g_k) + P(n - g_{-k}) \right]$

Where **$ g_k $** is the generalized pentagonal number:

$g_k = \frac{k(3k - 1)}{2}$

With the base value:

$P(0) = 1$

The first partition numbers are:

```
P(0) = 1
P(1) = 1
P(2) = 2
P(3) = 3
P(4) = 5
P(5) = 7
P(6) = 11
P(7) = 15
P(8) = 22
```

## Example 1
```
Input: n = 4  
Output: 5
```

## Example 2
```
Input: n = 6  
Output: 11
```

## Tasks
1. Implement a **Java** function to compute the **partition number P(n)** using recursion.  
2. Optimize your solution using **memoization** or **dynamic programming**.  
3. (Optional) Implement an **iterative** version to compute the first **n** partition numbers.

## Constraints
- The input number **n** is a non-negative integer.  
- Aim for an efficient solution to reduce redundant calculations.

Good luck! 🚀

