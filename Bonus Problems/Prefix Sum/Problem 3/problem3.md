# Largest Rectangular Sub-matrix Whose Sum is 0

Given a matrix `mat[][]`, find the size of the largest sub-matrix whose sum is equal to zero. The size of a matrix is the product of rows and columns. A sub-matrix is a matrix obtained from the given matrix by deletion of several (possibly, zero or all) rows/columns from the beginning and several (possibly, zero or all) rows/columns from the end.

## Examples

**Input:** 
```
mat[][] = [[9, 7, 16, 5], 
           [1, -6, -7, 3], 
           [1, 8, 7, 9], 
           [7, -2, 0, 10]]
```
**Output:** 
```
6
```
**Explanation:** 
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/710026/Web/Other/blobid0_1736762643.png)

**Input:** 
```
mat[][] = [[1, 2, 3], 
           [-3, -2, -1], 
           [1, 7, 5]]
```
**Output:** 
```
6
```
**Explanation:** 
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/710026/Web/Other/blobid1_1736762643.png)

**Input:** 
```
mat[][] = [[1, -1], 
           [-1, 1]]
```
**Output:** 
```
4
```
**Explanation:** The largest sub-matrix with sum 0 is `[[1, -1], [-1, 1]]`.

## Constraints:
- `1 <= mat.size(), mat[0].size() <= 100`
- `-1000 <= mat[][] <= 1000`