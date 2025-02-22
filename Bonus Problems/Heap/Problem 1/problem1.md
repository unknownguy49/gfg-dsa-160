# Top K Frequent in Array

Given a non-empty integer array `arr[]` of size `n`, find the top `k` elements which have the highest frequency in the array.

**Note:** If two numbers have the same frequencies, then the larger number should be given more preference.

## Examples

**Input:** `arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2`  
**Output:** `[4, 1]`  
**Explanation:** Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1.

**Input:** `arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4`  
**Output:** `[5, 11, 7, 10]`  
**Explanation:** Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1.

## Constraints

- `1 <= n <= 10^5`
- `1 <= arr[i] <= 10^5`
- `1 <= k <= no. of distinct elements`