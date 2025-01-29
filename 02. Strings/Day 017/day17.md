# First Non-Repeating Character

Given a string `s` consisting of lowercase Latin Letters, return the first non-repeating character in `s`. If there is no non-repeating character, return `$`.

**Note:** When you return `$`, the driver code will output `-1`.

## Examples

### Example 1
**Input:** `s = "geeksforgeeks"`  
**Output:** `'f'`  
**Explanation:** In the given string, `'f'` is the first character in the string which does not repeat.

### Example 2
**Input:** `s = "racecar"`  
**Output:** `'e'`  
**Explanation:** In the given string, `'e'` is the only character in the string which does not repeat.

### Example 3
**Input:** `s = "aabbccc"`  
**Output:** `-1`  
**Explanation:** All the characters in the given string are repeating.

## Constraints
- `1 <= s.size() <= 10^5`