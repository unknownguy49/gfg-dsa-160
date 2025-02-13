# Fixing Two Nodes of a BST

Given the root of a Binary Search Tree (BST), where exactly two nodes were swapped by mistake. Your task is to fix (or correct) the BST by swapping them back. Do not change the structure of the tree.

**Note:** It is guaranteed that the given input will form a BST, except for 2 nodes that will be wrong. All changes must be reflected in the original linked list.

## Examples

**Input:** 
```
root = [10, 5, 8, 2, 20]
```
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid0_1738654776.png)

**Output:** 
```
1
```
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid1_1738654776.png)

**Explanation:** The nodes 20 and 8 were swapped.

**Input:** 
```
root = [5, 10, 20, 2, 8]
```
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid2_1738654931.png)

**Output:** 
```
1
```
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886490/Web/Other/blobid3_1738654931.png)

**Explanation:** The nodes 10 and 5 were swapped.

## Constraints

- ` 1 ≤ Number of nodes ≤ 10^3`