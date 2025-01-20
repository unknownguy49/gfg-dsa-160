# Merge Two Sorted Linked Lists

Given the head of two sorted linked lists consisting of nodes respectively. The task is to merge both lists and return the head of the sorted merged list.

## Examples

**Input:**  
`head1 = 5 -> 10 -> 15 -> 40`, `head2 = 2 -> 3 -> 20`  
**Output:**  
`2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40`  
**Explanation:**
<br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700176/Web/Other/blobid1_1722768650.png)

**Input:**  
`head1 = 1 -> 1`, `head2 = 2 -> 4`  
**Output:**  
`1 -> 1 -> 2 -> 4`  
**Explanation:**
<br>
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700176/Web/Other/blobid3_1722768742.png)

## Constraints
- `1 <= no. of nodes <= 10^3`
- `0 <= node->data <= 10^5`