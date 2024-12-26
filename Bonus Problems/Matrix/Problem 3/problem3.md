# Generate a Matrix with Each Row and Column of Given Sum

Given two integer arrays `rowSum[]` of size `n` and `colSum[]` of size `m`, the task is to construct a 2D matrix of size `n x m` such that the sum of matrix elements in the `i`-th row is `rowSum[i]` and the sum of matrix elements in the `j`-th column is `colSum[j]`.

**Note:** Since multiple answers are possible, return any one of them. Arrays are generated such that an answer is always possible. The driver code will print `true` if the output matrix is correct, otherwise it will print `false`.

## Examples

### Example 1
**Input:** 
```markdown
rowSum[] = [5, 7, 10]
colSum[] = [8, 6, 8]
```
**Output:** 
```markdown
true
```
**Explanation:** 
For the matrix 
```
[[0, 5, 0], 
 [6, 1, 0], 
 [2, 0, 8]], 
```
we have:
- Row 1 with sum equal to 5 and column 1 has sum equal to 8.
- Row 2 has sum equal to 7 and column 2 has sum equal to 6.
- Row 3 has sum equal to 10 and column 3 has sum equal to 8.

### Example 2
**Input:** 
```markdown
rowSum[] = [1, 0]
colSum[] = [1]
```
**Output:** 
```markdown
true
```
**Explanation:** 
For the matrix 
```
[[1], 
 [0]], 
```
we have:
- Row 1 with sum equal to 1 and column 1 has sum equal to 1.
- Row 2 with sum equal to 0.

## Constraints
- `1 <= n, m <= 10^3`
- `1 <= rowSum[i] <= 10^3`
- `1 <= colSum[i] <= 10^3`