# Median of 2 Sorted Arrays of Different Sizes

Given two sorted arrays `a[]` and `b[]`, you need to find and return the median of the combined array after merging them into a single sorted array.

## Examples

**Input:** `a[] = [-5, 3, 6, 12, 15]`, `b[] = [-12, -10, -6, -3, 4, 10]`  
**Output:** `3`  
**Explanation:** The merged array is `[-12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15]`. So the median of the merged array is `3`.

**Input:** `a[] = [2, 3, 5, 8]`, `b[] = [10, 12, 14, 16, 18, 20]`  
**Output:** `11`  
**Explanation:** The merged array is `[2, 3, 5, 8, 10, 12, 14, 16, 18, 20]`. So the median of the merged array is `(10 + 12) / 2 = 11`.

**Input:** `a[] = []`, `b[] = [2, 4, 5, 6]`  
**Output:** `4.5`  
**Explanation:** The merged array is `[2, 4, 5, 6]`. So the median of the merged array is `(4 + 5) / 2 = 4.5`.

## Constraints

- `0 ≤ a.size(), b.size() ≤ 10^6`
- `1 ≤ a[i], b[i] ≤ 10^9`
- `a.size() + b.size() > 0`