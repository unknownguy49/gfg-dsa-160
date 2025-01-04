# 4 Sum – Count Quadruplets with Given Sum

Given an array `arr[]` and an integer `target`, you need to find and return the count of quadruplets such that the index of each element of the quadruplet is unique and the sum of the elements is equal to `target`.

## Examples

**Input:** 
```markdown
arr[] = [1, 5, 3, 1, 2, 10], target = 20
```
**Output:** 
```markdown
1
```
**Explanation:** 
Only quadruplet satisfying the condition is `arr[1] + arr[2] + arr[4] + arr[5] = 5 + 3 + 2 + 10 = 20`. Hence, the answer is 1.

**Input:** 
```markdown
arr[] = [1, 1, 1, 1, 1], target = 4
```
**Output:** 
```markdown
5
```
**Explanation:** 
Five quadruplets with sum 4 are:
- `arr[0] + arr[1] + arr[2] + arr[3] = 1 + 1 + 1 + 1 = 4`
- `arr[1] + arr[2] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4`
- `arr[0] + arr[2] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4`
- `arr[0] + arr[1] + arr[3] + arr[4] = 1 + 1 + 1 + 1 = 4`
- `arr[0] + arr[1] + arr[2] + arr[4] = 1 + 1 + 1 + 1 = 4`

**Input:** 
```markdown
arr = [4, 3, -13, 3], target = -3
```
**Output:** 
```markdown
1
```
**Explanation:** 
There is only 1 quadruplet with sum = -3, that is `[4, 3, -13, 3]`.

## Constraints
- `1 <= arr.length <= 10^3`
- `-10^5 <= arr[i] <= 10^5`
- `-10^5 <= target <= 10^5`