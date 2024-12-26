# Make Matrix Beautiful

A beautiful matrix is a matrix in which the sum of elements in each row and column is equal. Given a square matrix `mat[][]`, find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation, you can increment the value of any one cell by 1.

## Examples

**Input:** `mat[][] = [[1, 2], [3, 4]]`  
**Output:** `4`  
**Explanation:** Increment the value of cell (0, 0) by 3 and increment the value of cell (0, 1) by 1. Hence, a total of 4 operations are required so that all rows and columns have a sum of 8.

**Input:** `mat[][] = [[1, 2, 3], [4, 2, 3], [3, 2, 1]]`  
**Output:** `6`  
**Explanation:** Increment the value of cell (0, 0) by 1, increment the value of cell (0, 1) by 2, increment the value of cell (2, 1) by 1, and increment the value of cell (2, 2) by 2. Thus, all rows and columns have a sum of 9.

**Input:** `mat[][] = [[0, 2], [3, 4]]`  
**Output:** `5`  
**Explanation:** Increment the value of cell (0, 0) by 4 and increment the value of cell (0, 1) by 1. Hence, a total of 5 operations are required.

## Constraints

- `1 <= mat.size(), mat[0].size() <= 500`
- `1 <= mat[i][j] <= 10^6`