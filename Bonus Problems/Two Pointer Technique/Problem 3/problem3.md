# 4 Sum - All Quadruples

Given an array `arr[]` of integers and another integer `target`. Find all unique quadruples from the given array that sums up to `target`.

**Note:** All the quadruples should be internally sorted, i.e., for any quadruple `[q1, q2, q3, q4]` it should be: `q1 <= q2 <= q3 <= q4`.

## Examples

**Input:** `arr[] = [0, 0, 2, 1, 1]`, `target = 3`  
**Output:** `[0, 0, 1, 2]`  
**Explanation:** Sum of 0, 0, 1, 2 is equal to 3.

**Input:** `arr[] = [10, 2, 3, 4, 5, 7, 8]`, `target = 23`  
**Output:** `[[2, 3, 8, 10], [2, 4, 7, 10], [3, 5, 7, 8]]`  
**Explanation:** Sum of 2, 3, 8, 10 is 23, sum of 2, 4, 7, 10 is 23 and sum of 3, 5, 7, 8 is also 23.

**Input:** `arr[] = [0, 0, 2, 1, 1]`, `target = 2`  
**Output:** `[0, 0, 1, 1]`  
**Explanation:** Sum of 0, 0, 1, 1 is equal to 2.

## Constraints

- `1 <= arr.size() <= 200`
- `-10^6 <= target <= 10^6`
- `-10^6 <= arr[i] <= 10^6`