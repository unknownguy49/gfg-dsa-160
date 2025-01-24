# Detect Loop in Linked List

You are given the head of a singly linked list. Your task is to determine if the linked list contains a loop. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

### Custom Input Format:
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If `pos = 0`, it means the last node points to null, indicating there is no loop.

## Examples:

**Input:** 
```
head: 1 -> 3 -> 4, pos = 2
```
**Output:** 
```
true
```
**Explanation:** 
There exists a loop as the last node is connected back to the second node.
<br><br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700099/Web/Other/blobid1_1718699705.png)
<br><br>

**Input:** 
```
head: 1 -> 8 -> 3 -> 4, pos = 0
```
**Output:** 
```
false
```
**Explanation:** 
There exists no loop in the given linked list.
<br><br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700099/Web/Other/blobid2_1718699755.png)
<br><br>

**Input:** 
```
head: 1 -> 2 -> 3 -> 4, pos = 1
```
**Output:** 
```
true
```
**Explanation:** 
There exists a loop as the last node is connected back to the first node.
<br><br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700332/Web/Other/blobid2_1718609744.png)
<br><br>

## Constraints:
- `1 ≤ number of nodes ≤ 10^4`
- `1 ≤ node->data ≤ 10^3`
- `0 ≤ pos ≤ Number of nodes in Linked List`