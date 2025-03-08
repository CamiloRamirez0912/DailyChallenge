# 🎯 Keith Number Challenge

## Description
A **Keith number** is a special number that appears in a sequence generated as follows:

1. Start with the digits of the number.
2. Each subsequent term is the sum of the previous terms in the sequence.
3. If the original number appears in the sequence, it is a **Keith number**.

### Example 1:
```
Input: 197  
Sequence: 1, 9, 7, (1+9+7)=17, (9+7+17)=33, (7+17+33)=57, (17+33+57)=107, (33+57+107)=197  
Output: true (197 is a Keith number)
```

### Example 2:
```
Input: 19  
Sequence: 1, 9, (1+9)=10, (9+10)=19  
Output: true (19 is a Keith number)
```

### Example 3:
```
Input: 23  
Sequence: 2, 3, (2+3)=5, (3+5)=8, (5+8)=13, (8+13)=21, (13+21)=34...  
Output: false (23 is not a Keith number)
```

## Tasks:
1. Write a Java function to determine if a number is a **Keith number**.
2. Add test cases with different values.
3. (Optional) Find all Keith numbers within a given range (e.g., from 1 to 1000).

## Constraints:
- The input number is a positive integer.
- Optimize your solution for efficiency.

Good luck! 🚀

