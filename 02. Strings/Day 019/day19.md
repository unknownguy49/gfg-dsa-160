# Minimum Characters to Add to Make a String Palindrome

Given a string `s`, the task is to find the minimum characters to be added at the front to make the string a palindrome.

**Note:** A palindrome string is a sequence of characters that reads the same forward and backward.

## Examples

### Example 1
**Input:** 
```
s = "abc"
```
**Output:** 
```
2
```
**Explanation:** 
Add 'b' and 'c' at the front of the above string to make it a palindrome: "cbabc".

### Example 2
**Input:** 
```
s = "aacecaaaa"
```
**Output:** 
```
2
```
**Explanation:** 
Add 2 'a's at the front of the above string to make it a palindrome: "aaaacecaaaa".

## Constraints
- `1 ≤ s.size() ≤ 10^6`