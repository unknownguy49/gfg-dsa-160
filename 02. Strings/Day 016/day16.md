# Anagram Check

Given two strings `s1` and `s2` consisting of lowercase characters, the task is to check whether the two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, `act` and `tac` are an anagram of each other. Strings `s1` and `s2` can only contain lowercase alphabets.

**Note:** You can assume both the strings `s1` & `s2` are non-empty.

## Examples

### Example 1
- **Input:** `s1 = "geeks"`, `s2 = "kseeg"`
- **Output:** `true`
- **Explanation:** Both the strings have the same characters with the same frequency. So, they are anagrams.

### Example 2
- **Input:** `s1 = "allergy"`, `s2 = "allergic"`
- **Output:** `false`
- **Explanation:** Characters in both the strings are not the same, so they are not anagrams.

### Example 3
- **Input:** `s1 = "g"`, `s2 = "g"`
- **Output:** `true`
- **Explanation:** Characters in both the strings are the same, so they are anagrams.

## Constraints
- `1 ≤ s1.size(), s2.size() ≤ 10^5`