# Combination Sum

Given an array `arr[]` and a target, your task is to find all unique combinations in the array where the sum is equal to the target. The same number may be chosen from the array any number of times to make the target.

You can return your answer in any order.

## Examples:

**Input:** `arr[] = [2, 4, 6, 8]`, `target = 8`  
**Output:** `[[2, 2, 2, 2], [2, 2, 4], [2, 6], [4, 4], [8]]`  
**Explanation:** Total number of possible combinations are 5.

**Input:** `arr[] = [2, 7, 6, 5]`, `target = 16`  
**Output:** `[[2, 2, 2, 2, 2, 2, 2, 2], [2, 2, 2, 2, 2, 6], [2, 2, 2, 5, 5], [2, 2, 5, 7], [2, 2, 6, 6], [2, 7, 7], [5, 5, 6]]`  
**Explanation:** Total number of possible combinations are 7.

**Input:** `arr[] = [6, 5, 7]`, `target = 8`  
**Output:** `[]`  
**Explanation:** There are no possible combinations such that the target sum is 8.

## Constraints:
- `1 <= arr.size() <= 30`
- `2 <= arr[i] <= 40`
- `2 <= target <= 40`
- All `arr[i]` are distinct.