# Check for BST

Given the root of a binary tree, check whether it is a BST or not.

**Note:** We are considering that BSTs cannot contain duplicate nodes. A BST is defined as follows:

- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.

## Examples

**Input:** `root = [2, 1, 3, N, N, N, 5]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid0_1739182093.jpg)

**Output:** `true`  
**Explanation:** The left subtree of every node contains smaller keys and the right subtree of every node contains greater keys. Hence, the tree is a BST.

**Input:** `root = [2, N, 7, N, 6, N, 9]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid2_1739182131.jpg)

**Output:** `false`  
**Explanation:** Since the node to the right of the node with key 7 has a lesser key value, it is not a valid BST.

**Input:** `root = [10, 5, 20, N, N, 9, 25]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700149/Web/Other/blobid3_1739182159.jpg)

**Output:** `false`  
**Explanation:** The node with key 9 present in the right subtree has a lesser key value than the root node.

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^9`