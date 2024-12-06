# Sorting an Array of 0s, 1s, and 2s

Given an array `arr[]` containing only 0s, 1s, and 2s, the task is to sort the array in ascending order.

## Examples

### Example 1
**Input:** 
```python
arr[] = [0, 1, 2, 0, 1, 2]
```
**Output:** 
```python
[0, 0, 1, 1, 2, 2]
```
**Explanation:** 0s, 1s, and 2s are segregated into ascending order.

### Example 2
**Input:** 
```python
arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
```
**Output:** 
```python
[0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
```
**Explanation:** 0s, 1s, and 2s are segregated into ascending order.

## Constraints
- 1 ≤ arr.size() ≤ 1,000,000
- 0 ≤ arr[i] ≤ 2