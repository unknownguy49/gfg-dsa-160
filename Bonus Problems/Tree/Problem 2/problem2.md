# Balanced Tree Check

Given a binary tree, determine if it is height-balanced. A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

## Examples:

**Input:** `root[] = [10, 20, 30, 40, 60]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700166/Web/Other/blobid1_1739353289.png)

**Output:** `true`  
**Explanation:** The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.

**Input:** `root[] = [1, 2, 3, 4, N, N, N, 5]` 

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700166/Web/Other/blobid2_1739353291.png)

**Output:** `false`  
**Explanation:** The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.

**Input:** `root[] = [1, 2, N, N, 3]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700166/Web/Other/blobid0_1739353287.png)

**Output:** `false`  
**Explanation:** The height difference between the left and right subtrees at node 1 is 2, which exceeds 1. Hence, the tree is not balanced.

## Constraints:
- `0 <= number of nodes <= 5000`
- `-10^4 <= node->data <= 10^4`