# Solve the Sudoku

Given an incomplete Sudoku configuration in terms of a 9x9 2-D integer square matrix, `mat[][]`, the task is to solve the Sudoku. It is guaranteed that the input Sudoku will have exactly one solution.

A sudoku solution must satisfy all of the following rules:

1. Each of the digits 1-9 must occur exactly once in each row.
2. Each of the digits 1-9 must occur exactly once in each column.
3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

**Note:** Zeros represent blanks to be filled with numbers 1-9, while non-zero cells are fixed and cannot be changed.

## Examples

**Input:** 

mat[][] = 
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886267/Web/Other/blobid0_1738136756.png)

**Output:**

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886267/Web/Other/blobid1_1738127837.png)

**Explanation:** Each row, column, and 3x3 box of the output matrix contains unique numbers.


**Input:** 

mat[][] = 
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886267/Web/Other/blobid1_1738136756.png)

**Output:**
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886267/Web/Other/blobid1_1738127837.png)

**Explanation:** Each row, column, and 3x3 box of the output matrix contains unique numbers.

## Constraints:

- `mat.size() = 9`
- `mat[i].size() = 9`
- `0 ≤ mat[i][j] ≤ 9`