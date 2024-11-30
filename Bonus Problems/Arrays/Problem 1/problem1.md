# Split Array into Three Equal Sum Parts

Given an array `arr[]`, determine if `arr` can be split into three consecutive parts such that the sum of each part is equal. If possible, return any index pair `(i, j)` in an array such that `sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1])`, otherwise return an array `{-1, -1}`.

**Note:** Since multiple answers are possible, return any of them. The driver code will print `true` if it is correct otherwise, it will print `false`.

## Examples

### Example 1
**Input:** 
```markdown
arr[] = [1, 3, 4, 0, 4]
```
**Output:** 
```markdown
true
```
**Explanation:** 
```markdown
[1, 2] is a valid pair as the sum of subarray `arr[0..1]` is equal to the sum of subarray `arr[2..3]` and also to the sum of subarray `arr[4..4]`. The sum is 4, so the driver code prints `true`.
```

### Example 2
**Input:** 
```markdown
arr[] = [2, 3, 4]
```
**Output:** 
```markdown
false
```
**Explanation:** 
```markdown
No three subarrays exist which have equal sum.
```

### Example 3
**Input:** 
```markdown
arr[] = [0, 1, 1]
```
**Output:** 
```markdown
false
```

## Constraints
- `3 ≤ arr.size() ≤ 10^6`
- `0 ≤ arr[i] ≤ 10^6`