# Search Pattern (KMP-Algorithm)

Given two strings, one is a text string `txt` and the other is a pattern string `pat`. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices.

**Note:** Return an empty list in case of no occurrences of the pattern.

## Examples

### Example 1
**Input:** 
```plaintext
txt = "abcab"
pat = "ab"
```
**Output:** 
```plaintext
[0, 3]
```
**Explanation:** The string "ab" occurs twice in `txt`, one starts at index 0 and the other at index 3.

### Example 2
**Input:** 
```plaintext
txt = "abesdu"
pat = "edu"
```
**Output:** 
```plaintext
[]
```
**Explanation:** There's no substring "edu" present in `txt`.

### Example 3
**Input:** 
```plaintext
txt = "aabaacaadaabaaba"
pat = "aaba"
```
**Output:** 
```plaintext
[0, 9, 12]
```
**Explanation:** The string "aaba" occurs three times in `txt`, starting at indices 0, 9, and 12.
![KMP Algorithm](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/703119/Web/Other/blobid0_1731391225.png)

## Constraints
- `1 <= txt.size() <= 10^6`
- `1 <= pat.size() < txt.size()`
- `Both strings consist of lowercase English alphabets.`