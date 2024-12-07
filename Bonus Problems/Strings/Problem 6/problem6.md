# Longest Prefix which is also Suffix

Given a string of characters `s`, find the length of the longest prefix which is also a suffix. Note that the prefix and suffix can be overlapping but they should not be equal to the entire string.

## Examples

### Example 1
**Input:** `s = "abab"`  
**Output:** `2`  
**Explanation:** "ab" is the longest prefix and suffix.

### Example 2
**Input:** `s = "aabcdaabc"`  
**Output:** `4`  
**Explanation:** The string "aabc" is the longest prefix and suffix.

### Example 3
**Input:** `s = "aaaa"`  
**Output:** `3`  
**Explanation:** "aaa" is the longest prefix and suffix.

## Constraints
- `1 <= s.size() <= 10^6`
- `s contains only lowercase English alphabets.`
