# Subarrays with Sum K

Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number `k`.

## Examples

**Input:** `arr = [10, 2, -2, -20, 10], k = -10`  
**Output:** `3`  
**Explanation:** Subarrays: `arr[0...3]`, `arr[1...4]`, `arr[3...4]` have sum exactly equal to `-10`.

**Input:** `arr = [9, 4, 20, 3, 10, 5], k = 33`  
**Output:** `2`  
**Explanation:** Subarrays: `arr[0...2]`, `arr[2...4]` have sum exactly equal to `33`.

**Input:** `arr = [1, 3, 5], k = 0`  
**Output:** `0`  
**Explanation:** No subarray with sum `0`.

## Constraints

- `1 ≤ arr.size() ≤ 10^5`
- `-10^3 ≤ arr[i] ≤ 10^3`
- `-10^7 ≤ k ≤ 10^7`