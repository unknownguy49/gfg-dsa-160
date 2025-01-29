# Largest Subarray of 0's and 1's

Given an array `arr` of 0s and 1s, find and return the length of the longest subarray with an equal number of 0s and 1s.

## Examples

**Input:** `arr[] = [1, 0, 1, 1, 1, 0, 0]`  
**Output:** `6`  
**Explanation:** `arr[1...6]` is the longest subarray with three 0s and three 1s.

**Input:** `arr[] = [0, 0, 1, 1, 0]`  
**Output:** `4`  
**Explanation:** `arr[0...3]` or `arr[1...4]` is the longest subarray with two 0s and two 1s.

**Input:** `arr[] = [0]`  
**Output:** `0`  
**Explanation:** There is no subarray with an equal number of 0s and 1s.

## Constraints

- `1 <= arr.size() <= 10^5`
- `0 <= arr[i] <= 1`
