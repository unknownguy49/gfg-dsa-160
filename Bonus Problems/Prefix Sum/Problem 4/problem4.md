# Subarray Sum Divisible By K

You are given an integer array `arr[]` and a value `k`. The task is to find the count of all sub-arrays whose sum is divisible by `k`.

## Examples

**Input:** `arr[] = [4, 5, 0, -2, -3, 1], k = 5`  
**Output:** `7`  
**Explanation:** There are 7 sub-arrays whose sum is divisible by `k`: `[4, 5, 0, -2, -3, 1]`, `[5]`, `[5, 0]`, `[5, 0, -2, -3]`, `[0]`, `[0, -2, -3]` and `[-2, -3]`.

**Input:** `arr[] = [2, 2, 2, 2, 2, 2], k = 2`  
**Output:** `21`  
**Explanation:** All subarray sums are divisible by `2`.

**Input:** `arr[] = [-1, -3, 2], k = 5`  
**Output:** `0`  
**Explanation:** There is no such sub-array whose sum is divisible by `k`.

## Constraints

- `1 ≤ arr.size() ≤ 10^4`
- `-10^6 ≤ arr[i] ≤ 10^6`
- `1 ≤ k ≤ 10^4`