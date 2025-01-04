# Min Subsets with Consecutive Numbers

Given an array of distinct positive numbers, the task is to calculate the minimum number of subsets (or subsequences) from the array such that each subset contains consecutive numbers.

## Examples

**Input:** `arr[] = [100, 56, 5, 6, 102, 58, 101, 57, 7, 103]`  
**Output:** `3`  
**Explanation:** `{5, 6, 7}`, `{56, 57, 58}`, `{100, 101, 102, 103}` are 3 subsets in which numbers are consecutive.

**Input:** `arr[] = [10, 100, 105]`  
**Output:** `3`  
**Explanation:** `{10}`, `{100}`, and `{105}` are 3 subsets in which numbers are consecutive.

## Expected Time Complexity

- O(n*log(n))

## Expected Auxiliary Space

- O(1)

## Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `0 ≤ arr[i] ≤ 10^6`