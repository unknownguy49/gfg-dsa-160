# Level Order Traversal

Given a root of a binary tree with `n` nodes, the task is to find its level order traversal. Level order traversal of a tree is breadth-first traversal for the tree.

## Examples

**Input:** `root[] = [1, 2, 3]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700511/Web/Other/blobid0_1738405019.png)

**Output:** `[[1], [2, 3]]`

**Input:** `root[] = [10, 20, 30, 40, 50]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700511/Web/Other/blobid2_1738405085.png)

**Output:** `[[10], [20, 30], [40, 50]]`

**Input:** `root[] = [1, 3, 2, N, N, N, 4, 6, 5]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700511/Web/Other/blobid3_1738405128.png)

**Output:** `[[1], [3, 2], [4], [6, 5]]`

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `0 ≤ node->data ≤ 10^9`