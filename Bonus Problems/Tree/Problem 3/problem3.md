# Vertical Tree Traversal

Given a root of a Binary Tree, find the vertical traversal of it starting from the leftmost level to the rightmost level. If there are multiple nodes passing through a vertical line, then they should be printed as they appear in level order traversal of the tree.

## Examples

### Example 1

**Input:** 
```
root[] = [1, 2, 3, 4, 5, 6, 7, N, N, N, N, N, 8, N, 9]
```

![](https://media.geeksforgeeks.org/wp-content/uploads/20241009173605620782/Vertical-Taversal-.webp)

**Output:** 
```
[[4], [2], [1, 5, 6], [3, 8], [7], [9]]
```

**Explanation:** 
The below image shows the horizontal distances used to print vertical traversal starting from the leftmost level to the rightmost level.

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/887914/Web/Other/blobid1_1739369757.png)

### Example 2

**Input:** 
```
root[] = [1, 2, 3, 4, 5, N, 6]
```

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/887914/Web/Other/blobid1_1739361586.png)

**Output:** 
```
[[4], [2], [1, 5], [3], [6]]
```

**Explanation:** 
From left to right the vertical order will be `[[4], [2], [1, 5], [3], [6]]`.

## Constraints

- 1 <= number of nodes <= 105
- 1 <= node->data <= 105