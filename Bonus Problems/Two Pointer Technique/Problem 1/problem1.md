# Triplet Sum in Array

Given an array `arr[]` and an integer `target`, determine if there exists a triplet in the array whose sum equals the given target.

Return `true` if such a triplet exists, otherwise, return `false`.

## Examples

**Input:** `arr[] = [1, 4, 45, 6, 10, 8]`, `target = 13`  
**Output:** `true`  
**Explanation:** The triplet {1, 4, 8} sums up to 13.

**Input:** `arr[] = [1, 2, 4, 3, 6, 7]`, `target = 10`  
**Output:** `true`  
**Explanation:** The triplets {1, 3, 6} and {1, 2, 7} both sum to 10.

**Input:** `arr[] = [40, 20, 10, 3, 6, 7]`, `target = 24`  
**Output:** `false`  
**Explanation:** No triplet in the array sums to 24.

## Constraints

- `3 ≤ arr.size() ≤ 10^3`
- `1 ≤ arr[i] ≤ 10^5`