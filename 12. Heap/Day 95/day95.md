# k Largest Elements

Given an array `arr[]` of positive integers and an integer `k`, your task is to return `k` largest elements in decreasing order.

## Examples

**Input:** 
```markdown
arr[] = [12, 5, 787, 1, 23], k = 2
```
**Output:** 
```markdown
[787, 23]
```
**Explanation:** 
1st largest element in the array is 787 and second largest is 23.

<br>

**Input:** 
```markdown
arr[] = [1, 23, 12, 9, 30, 2, 50], k = 3
```
**Output:** 
```markdown
[50, 30, 23]
```
**Explanation:** 
Three largest elements in the array are 50, 30, and 23.

<br>

**Input:** 
```markdown
arr[] = [12, 23], k = 1
```
**Output:** 
```markdown
[23]
```
**Explanation:** 
1st largest element in the array is 23.
<br>

## Constraints:
- `1 ≤ k ≤ arr.size() ≤ 10^6`
- `1 ≤ arr[i] ≤ 10^6`