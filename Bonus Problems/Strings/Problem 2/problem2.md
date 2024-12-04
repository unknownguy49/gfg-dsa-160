# Palindrome Sentence

Given a single string `s`, the task is to check if it is a palindrome sentence or not. A palindrome sentence is a sequence of characters, such as a word, phrase, or series of symbols that reads the same backward as forward after converting all uppercase letters to lowercase and removing all non-alphanumeric characters.

## Examples

**Input:** `s = "Too hot to hoot"`  
**Output:** `true`  
**Explanation:** If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string `s` will become “toohottohoot” which is a palindrome.

**Input:** `s = "Abc 012..## 10cbA"`  
**Output:** `true`  
**Explanation:** If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string `s` will become “abc01210cba” which is a palindrome.

**Input:** `s = "ABC $. def01ASDF"`  
**Output:** `false`  
**Explanation:** The processed string becomes "abcdef01asdf", which is not a palindrome.

## Constraints
- `1 ≤ s.size() ≤ 10^6`