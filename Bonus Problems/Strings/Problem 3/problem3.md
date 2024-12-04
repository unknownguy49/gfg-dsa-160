# Integer to Words

The function converts a given number `n` into words. The idea is to break down the number into the International Number System, i.e., smaller groups of three digits (hundreds, tens, and ones), and convert each group into words.

## Examples

### Example 1
**Input:** `n = 0`  
**Output:** `"Zero"`

### Example 2
**Input:** `n = 123`  
**Output:** `"One Hundred Twenty Three"`

### Example 3
**Input:** `n = 10245`  
**Output:** `"Ten Thousand Two Hundred Forty Five"`

### Example 4
**Input:** `n = 2147483647`  
**Output:** `"Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven"`

## Constraints
- `0 <= n <= 2^31 - 1`