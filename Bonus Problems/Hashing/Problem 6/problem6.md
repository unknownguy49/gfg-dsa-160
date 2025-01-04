# Group Shifted String

Given an array of strings (all lowercase letters), the task is to group them in such a way that all strings in a group are shifted versions of each other.

Two strings `s1` and `s2` are called shifted if the following conditions are satisfied:

- `s1.length = s2.length`
- `s1[i] = s2[i] + m` for `1 <= i <= s1.length` for a constant integer `m`

## Examples

### Example 1
**Input:** `arr = ["acd", "dfg", "wyz", "yab", "mop", "bdfh", "a", "x", "moqs"]`  
**Output:** `[["acd", "dfg", "wyz", "yab", "mop"], ["bdfh", "moqs"], ["a", "x"]]`  
**Explanation:** All shifted strings are grouped together.

### Example 2
**Input:** `arr = ["geek", "for", "geeks"]`  
**Output:** `[["for"], ["geek"], ["geeks"]]`

### Example 3
**Input:** `arr = ["aaa", "adb", "bbd", "dbc", "bca"]`  
**Output:** `[["aaa"], ["adb"], ["bbd"], ["bca"], ["dbc"]]`

## Constraints
- `1 ≤ arr.size() ≤ 10^5`
- `1 ≤ arr[i].size() ≤ 5`