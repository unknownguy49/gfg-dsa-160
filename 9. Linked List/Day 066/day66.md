# Rotate a Linked List

**Difficulty:** Medium  
**Accuracy:** 39.95%  
**Submissions:** 259K+  
**Points:** 4  

Given the head of a singly linked list, your task is to left rotate the linked list `k` times.

## Examples:

**Input:** head = 10 -> 20 -> 30 -> 40 -> 50, k = 4  
**Output:** 50 -> 10 -> 20 -> 30 -> 40  
**Explanation:**  
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10  
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20  
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30  
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40 
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885669/Web/Other/blobid0_1737098802.webp) 

**Input:** head = 10 -> 20 -> 30 -> 40, k = 6  
**Output:** 30 -> 40 -> 10 -> 20  
![alt text](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/885669/Web/Other/blobid3_1737099041.webp)

## Constraints:

- 1 <= number of nodes <= 10^5
- 0 <= k <= 10^9
- 0 <= data of node <= 10^9