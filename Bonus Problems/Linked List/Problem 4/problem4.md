# Flattening a Linked List

Given a linked list containing `n` head nodes where every node in the linked list contains two pointers:
1. `next` points to the next node in the list.
2. `bottom` pointer to a sub-linked list where the current node is the head.

Each of the sub-linked lists nodes and the head nodes are sorted in ascending order based on their data. Your task is to flatten the linked list such that all the nodes appear in a single level while maintaining the sorted order.

**Note:**
1. `↓` represents the bottom pointer and `->` represents the next pointer.
2. The flattened list will be printed using the bottom pointer instead of the next pointer.

## Examples

### Input:
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700192/Web/Other/blobid0_1722066129.png)

### Output:
```
5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 30 -> 35 -> 40 -> 45 -> 50
```
**Explanation:**  
Bottom pointer of 5 is pointing to 7.  
Bottom pointer of 7 is pointing to 8.  
Bottom pointer of 8 is pointing to 10 and so on.

### Input:
![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700192/Web/Other/blobid1_1722066171.png)

### Output:
```
5 -> 7 -> 8 -> 10 -> 19 -> 20 -> 22 -> 28 -> 50
```
**Explanation:**  
Bottom pointer of 5 is pointing to 7.  
Bottom pointer of 7 is pointing to 8.  
Bottom pointer of 8 is pointing to 10 and so on.

## Constraints:
- `0 <= n <= 100`
- `1 <= number of nodes in sub-linked list (mi) <= 50`
- `1 <= node->data <= 10^4`