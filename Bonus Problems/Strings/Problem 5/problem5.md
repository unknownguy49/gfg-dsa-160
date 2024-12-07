# Minimum Repeats for Substring

Given two strings `s1` and `s2`, return the minimum number of times `s1` has to be repeated such that `s2` is a substring of it. If `s2` can never be a substring, then return `-1`.

**Note:** Both the strings contain only lowercase letters.

## Examples

### Example 1
**Input:** 
```plaintext
s1 = "ww"
s2 = "www"
```
**Output:** 
```plaintext
2
```
**Explanation:** Repeating `s1` two times "wwww", `s2` is a substring of it.

### Example 2
**Input:** 
```plaintext
s1 = "abcd"
s2 = "cdabcdab"
```
**Output:** 
```plaintext
3
```
**Explanation:** Repeating `s1` three times "abcdabcdabcd", `s2` is a substring of it. `s2` is not a substring of `s1` when it is repeated less than 3 times.

### Example 3
**Input:** 
```plaintext
s1 = "ab"
s2 = "cab"
```
**Output:** 
```plaintext
-1
```
**Explanation:** No matter how many times we repeat `s1`, we can't get a string such that `s2` is a substring of it.

## Constraints
- `1<=s1.size(),s2.size()<=10^5`