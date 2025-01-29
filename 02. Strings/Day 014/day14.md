# Implement Atoi

Given a string `s`, the objective is to convert it into integer format without utilizing any built-in functions. Refer to the steps below to understand the `atoi()` function.

## Cases for `atoi()` Conversion:

1. Skip any leading whitespaces.
2. Check for a sign (`+` or `-`), default to positive if no sign is present.
3. Read the integer by ignoring leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits are present, return 0.
4. If the integer is greater than 2<sup>31</sup> – 1, then return 2<sup>31</sup> – 1 and if the integer is smaller than -2<sup>31</sup>, then return -2<sup>31</sup>.

## Examples:

### Example 1
**Input:** `s = "-123"`  
**Output:** `-123`  
**Explanation:** It is possible to convert `-123` into an integer so we returned it in the form of an integer.

### Example 2
**Input:** `s = "  -"`  
**Output:** `0`  
**Explanation:** No digits are present, therefore the returned answer is `0`.

### Example 3
**Input:** `s = " 1231231231311133"`  
**Output:** `2147483647`  
**Explanation:** The converted number will be greater than 2<sup>31</sup> – 1, therefore print 2<sup>31</sup> – 1 = `2147483647`.

### Example 4
**Input:** `s = "-999999999999"`  
**Output:** `-2147483648`  
**Explanation:** The converted number is smaller than -2<sup>31</sup>, therefore print -2<sup>31</sup> = `-2147483648`.

### Example 5
**Input:** `s = "  -0012gfg4"`  
**Output:** `-12`  
**Explanation:** Nothing is read after `-12` as a non-digit character `g` was encountered.

## Constraints:
- `1 ≤ |s| ≤ 15`