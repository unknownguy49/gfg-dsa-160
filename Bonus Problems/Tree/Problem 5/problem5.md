# Normal BST to Balanced BST

Given a root of a Binary Search Tree, modify and return the given BST such that it is balanced and has minimum possible height. If there is more than one answer, return any of them.

**Note:** The height of balanced BST returned by you will be compared with the expected height of the balanced tree.

## Examples

**Input:** `root[] = [30, 20, N, 10, N]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700630/Web/Other/blobid0_1739346405.png)

**Output:** `2`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700630/Web/Other/blobid1_1739346405.png)

**Explanation:** The above unbalanced BST is converted to balanced with the minimum possible height i.e. 2.

**Input:** `root[] = [4, 3, 5, 2, N, N, 6, 1, N, N, 7]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/888005/Web/Other/blobid0_1739474366.png)

**Output:** `3`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/888005/Web/Other/blobid1_1739474366.png)

**Explanation:** The above unbalanced BST is converted to balanced with the minimum possible height i.e. 3.

## Constraints

- `1 <= Number of Nodes <= 10^5`
- `1 <= Node -> data <= 10^9`