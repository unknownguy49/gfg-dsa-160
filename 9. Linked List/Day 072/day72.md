# Find the First Node of Loop in Linked List

Given the head of a singly linked list, if a loop is present in the list, return the first node of the loop; otherwise, return `NULL`.

### Custom Input Format:
A head of a singly linked list and a `pos` (1-based index) which denotes the position of the node to which the last node points. If `pos = 0`, it means the last node points to `null`, indicating there is no loop.

## Examples:

### Input:
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/713150/Web/Other/blobid0_1723112915.png)

### Output:
```
3
```
**Explanation:** We can see that there exists a loop in the given linked list and the first node of the loop is 3.
<br><br>
### Input:
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/713150/Web/Other/blobid1_1723112944.png)
### Output:
```
-1
```
**Explanation:** No loop exists in the above linked list. So the output is -1.

## Constraints:
- `1 <= no. of nodes <= 10^6`
- `1 <= node->data <= 10^6`