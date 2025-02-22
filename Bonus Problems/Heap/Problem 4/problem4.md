# Rearrange Characters

Given a string `s` with repeated characters, the task is to rearrange characters in the string such that no two adjacent characters are the same.

**Note:** The string has only lowercase English alphabets and it can have multiple solutions. Return any one of them. If there is no possible solution, then print an empty string ("").

## Examples

**Input:** 
```
s = "aaabc"
```
**Output:** 
```
1
```
**Explanation:** 
```
"aaabc" can be rearranged to "abaca" or "acaba" as no two adjacent characters are the same in the output string.
```

**Input:** 
```
s = "aaabb"
```
**Output:** 
```
0
```
**Explanation:** 
```
No combinations possible such that two adjacent characters are different.
```

**Input:** 
```
s = "aaaabc"
```
**Output:** 
```
0
```
**Explanation:** 
```
No combinations possible such that two adjacent characters are different.
```

## Constraints
`1 <= s.size() <= 10^4`