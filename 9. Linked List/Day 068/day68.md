# Linked List Group Reverse

Given the head of a linked list, the task is to reverse every k nodes in the linked list. If the number of nodes is not a multiple of k, then the left-out nodes at the end should be considered as a group and must be reversed.

## Examples

**Input:** 
```
head = 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8, k = 4
```
**Output:** 
```
4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5
```
**Explanation:** 
The first 4 elements 1, 2, 2, 4 are reversed first and then the next 4 elements 5, 6, 7, 8. Hence, the resultant linked list is 4 -> 2 -> 2 -> 1 -> 8 -> 7 -> 6 -> 5.
<br><br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700013/Web/Other/blobid0_1723298986.png)

**Input:** 
```
head = 1 -> 2 -> 3 -> 4 -> 5, k = 3
```
**Output:** 
```
3 -> 2 -> 1 -> 5 -> 4
```
**Explanation:** 
The first 3 elements 1, 2, 3 are reversed first and then the left-out elements 4, 5 are reversed. Hence, the resultant linked list is 3 -> 2 -> 1 -> 5 -> 4.
<br><br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700013/Web/Other/blobid1_1723298995.png)

## Constraints:
- 1 <= size of linked list <= 10^5
- 1 <= data of nodes <= 10^6
- 1 <= k <= size of linked list