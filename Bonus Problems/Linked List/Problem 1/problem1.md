# Intersection in Y Shaped Lists

Given the head of two singly linked lists, return the point where these two linked lists intersect.

**Note:** It is guaranteed that the intersected node always exists.

### Custom Input Format:

- `head1` contains the nodes before intersection in list1
- `head2` contains the nodes before intersection in list2
- `CommonList` contains the nodes after intersection of list1 and list2.

## Examples:

**Input:**  
`head1`: 4 -> 4 -> 4 -> 4 -> 4  , `head2`: 4 -> 4 -> 4

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700163/Web/Other/blobid1_1721764552.png)

**Output:**  
4

**Explanation:**  
From the above image, it is clearly seen that the common part is 4 -> 4 whose starting point is 4.

**Input:**  
`head1`: 4 -> 1 -> 8 -> 4 -> 5  , `head2`: 5 -> 6 -> 1 -> 8 -> 4 -> 5

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700163/Web/Other/blobid0_1721764467.png)

**Output:**  
8

**Explanation:**  
From the above image, it is clearly seen that the common part is 8 -> 4 -> 5 whose starting point is 8.

## Constraints:

- 2 ≤ total number of nodes ≤ 2 * 10^5
- -10^4 ≤ node->data ≤ 10^4