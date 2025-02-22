# Nearly Sorted

**Difficulty:** Medium  
**Accuracy:** 75.25%  
**Submissions:** 69K+  
**Points:** 4  
**Average Time:** 30m  

## Problem Statement

Given an array `arr[]`, where each element is at most `k` away from its target position, you need to sort the array optimally.

**Note:** You need to change the given array `arr[]` in place.

## Examples

### Example 1
**Input:** 
``` 
arr[] = [6, 5, 3, 2, 8, 10, 9], k = 3 
```
**Output:** 
```
[2, 3, 5, 6, 8, 9, 10]
```
**Explanation:** 
The sorted array will be `[2, 3, 5, 6, 8, 9, 10]`.

### Example 2
**Input:** 
```
arr[] = [1, 4, 5, 2, 3, 6, 7, 8, 9, 10], k = 2 
```
**Output:** 
```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```
**Explanation:** 
The sorted array will be `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`.

## Constraints
- `1 ≤ arr.size() ≤ 10^6`
- `0 ≤ k < arr.size()`
- `1 ≤ arr[i] ≤ 10^6`

## Note
Don't use the inbuilt `sort()` function for this question.