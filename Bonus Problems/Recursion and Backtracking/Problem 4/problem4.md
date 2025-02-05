# Combination Sum II

Given an array `arr[]` and a target, your task is to find all unique combinations in the array where the sum is equal to the target. Each number in `arr[]` may only be used once in the combination.

You can return your answer in any order.

## Examples

**Input:** `arr[] = [1, 2, 3, 3, 5]`, `target = 7`  
**Output:** `[[1, 3, 3], [2, 5]]`  
**Explanation:** Total number of possible combinations are 2.

**Input:** `arr[] = [5, 10, 15, 20, 25, 30]`, `target = 30`  
**Output:** `[[5, 10, 15], [5, 25], [10, 20], [30]]`  
**Explanation:** Total number of possible combinations are 4.

**Input:** `arr[] = [6, 5, 7]`, `target = 8`  
**Output:** `[]`  
**Explanation:** There are no possible combinations such that target sum is 8.

## Constraints

- `1 <= arr.size() <= 100`
- `1 <= arr[i] <= 50`
- `1 <= target <= 30`