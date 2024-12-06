# CamelCase Pattern Matching

Given a dictionary of words `arr[]` where each word follows CamelCase notation, print all words in the dictionary that match with a given pattern `pat` consisting of uppercase characters only.

CamelCase is the practice of writing compound words or phrases such that each word or abbreviation begins with a capital letter. Common examples include PowerPoint, Wikipedia, GeeksForGeeks, CodeBlocks, etc.

## Problem Statement

You need to find all words in the dictionary that match a given pattern `pat`. The pattern consists of uppercase characters only.

### Example

- "GeeksForGeeks" matches the pattern "GFG", because if we combine all the capital letters in "GeeksForGeeks" they become "GFG". 
- "GeeksForGeeks" matches with the pattern "GFG" and also "GF", but does not match with "FG".

**Note:** The driver code will sort your answer before checking and return the answer in any order.

### Examples

#### Input
```plaintext
arr[] = ["WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"], pat = "WTG"
```

#### Output
```plaintext
["WelcomeToGeeksForGeeks"]
```

**Explanation:** Since only "WelcomeToGeeksForGeeks" matches the pattern, it is the only answer.

#### Input
```plaintext
arr[] = ["Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab"], pat = "HA"
```

#### Output
```plaintext
[]
```

**Explanation:** None of the words matches the given pattern.

### Constraints

- `1 <= arr.size() <= 1000`
- `1 <= pat.size() <= 100`
- `1 <= arr[i].size() <= 100`
