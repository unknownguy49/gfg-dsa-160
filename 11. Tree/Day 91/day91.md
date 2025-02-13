# Pair Sum in BST

Given a Binary Search Tree (BST) and a target, check whether there's a pair of nodes in the BST with values summing up to the target.

## Examples

**Input:** 
```
root = [7, 3, 8, 2, 4, N, 9], target = 12
```
![](https://media.geeksforgeeks.org/wp-content/uploads/20240821183540/bst.webp)

**Output:** 
```
True
```
**Explanation:** In the binary tree above, there are two nodes (8 and 4) that add up to 12.

**Input:** 
```
root = [9, 5, 10, 2, 6, N, 12], target = 23
```
![](https://media.geeksforgeeks.org/wp-content/uploads/20240821184007/bst-3.webp)

**Output:** 
```
False
```
**Explanation:** In the binary tree above, there are no such two nodes that add up to 23.

## Constraints

- 1 ≤ Number of Nodes ≤ 10^5
- 1 ≤ target ≤ 10^6