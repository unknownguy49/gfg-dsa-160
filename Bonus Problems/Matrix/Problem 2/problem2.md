# Spiral Matrix of N*M Size from Given Array

You are given two positive integers `n` and `m`, and an integer array `arr[]` containing a total of `n * m` elements. Return a 2D matrix of dimensions `n x m` by filling it in a clockwise spiral order using the elements from the given array.

## Examples

**Input:** 
```
n = 4, m = 4, arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
```
**Output:** 
```
[[1, 2, 3, 4],
 [12, 13, 14, 5],
 [11, 16, 15, 6],
 [10, 9, 8, 7]]
```

**Input:** 
```
n = 3, m = 4, arr[] = [1, 8, 6, 3, 8, 6, 1, 6, 3, 2, 5, 3]
```
**Output:** 
```
[[1, 8, 6, 3],
 [2, 5, 3, 8],
 [3, 6, 1, 6]]
```

**Input:** 
```
n = 2, m = 2, arr[] = [1, 8, 6, 3]
```
**Output:** 
```
[[1, 8],
 [3, 6]]
```

## Constraints:
- `1 ≤ n, m ≤ 10^3`
- `arr.size() = n * m`
- `1 ≤ arr[i] ≤ 10^3`