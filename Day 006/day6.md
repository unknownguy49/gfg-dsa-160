# Majority Element

You are given an array of integers `arr[]` where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes. If there's not a majority vote, return an empty array.

**Note:** The answer should be returned in an increasing format.

## Examples

### Example 1
**Input:** 
```markdown
arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
```
**Output:** 
```markdown
[5, 6]
```
**Explanation:** 5 and 6 occur more than n/3 times.

### Example 2
**Input:** 
```markdown
arr[] = [1, 2, 3, 4, 5]
```
**Output:** 
```markdown
[]
```
**Explanation:** No candidate occurs more than n/3 times.

## Constraints
- `1 <= arr.size() <= 10^6`
- `-10^9 <= arr[i] <= 10^9`