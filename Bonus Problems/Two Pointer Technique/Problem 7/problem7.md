# Pair Sum in a Sorted and Rotated Array

Given an array of positive elements `arr[]` that is sorted and then rotated around an unknown point, the task is to check if the array has a pair with sum equal to a given target.

## Examples

**Input:** `arr[] = [7, 9, 1, 3, 5]`, `target = 6`  
**Output:** `true`  
**Explanation:** `arr[2]` and `arr[4]` have a sum equal to 6, which is equal to the target.

**Input:** `arr[] = [2, 3, 4, 1]`, `target = 3`  
**Output:** `true`  
**Explanation:** `arr[0]` and `arr[3]` have a sum equal to 3, which is equal to the target.

**Input:** `arr[] = [10, 7, 4, 1]`, `target = 9`  
**Output:** `false`  
**Explanation:** There is no such pair in `arr[]` that sums to the target.

## Constraints

- `2 <= arr.size() <= 10^6`
- `1 <= arr[i] <= 10^6`
- `1 <= target <= 10^6`