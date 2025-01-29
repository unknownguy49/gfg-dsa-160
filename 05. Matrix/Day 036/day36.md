# Spirally Traversing a Matrix

You are given a rectangular matrix `mat[][]` of size `n x m`, and your task is to return an array while traversing the matrix in spiral form.

## Examples

### Example 1
**Input:** 
```plaintext
mat[][] = [[1, 2, 3, 4], 
           [5, 6, 7, 8], 
           [9, 10, 11, 12], 
           [13, 14, 15, 16]]
```
**Output:** 
```plaintext
[1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
```
**Explanation:** 
[![Explanation](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/701264/Web/Other/blobid1_1734498654.png)]()

### Example 2
**Input:** 
```plaintext
mat[][] = [[1, 2, 3, 4, 5, 6], 
           [7, 8, 9, 10, 11, 12], 
           [13, 14, 15, 16, 17, 18]]
```
**Output:** 
```plaintext
[1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
```
**Explanation:** Applying the same technique as shown above.

### Example 3
**Input:** 
```plaintext
mat[][] = [[32, 44, 27, 23], 
           [54, 28, 50, 62]]
```
**Output:** 
```plaintext
[32, 44, 27, 23, 62, 50, 28, 54]
```
**Explanation:** Applying the same technique as shown above, the output will be `[32, 44, 27, 23, 62, 50, 28, 54]`.

## Constraints
- `1 <= n, m <= 1000`
- `0 <= mat[i][j] <= 100`