# Corona Vaccine

Geek has successfully developed an effective vaccine for the Coronavirus and aims to ensure that every house in Geek Land has access to it. The houses in Geek Land are structured as a binary tree, where each node represents a house, and the edges denote direct connections between houses.

Each house that receives a vaccine kit can provide coverage to:

- Itself
- Its direct parent house (if it exists)
- Its immediate child houses (if any exist)

Your task is to determine the minimum number of houses that must be supplied with a vaccine kit to ensure that every house is covered.

## Examples

**Input:** `root = [1, 2, 3, N, N, N, 4, N, 5, N, 6]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886892/Web/Other/blobid0_1739010580.png)

**Output:** `2`  
**Explanation:** The vaccine kits should be supplied to house numbers 1 and 5.

**Input:** `root = [1, 2, 3]`  

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/886892/Web/Other/blobid1_1739010580.png)

**Output:** `1`  
**Explanation:** The vaccine kits should be supplied to house number 1.

## Constraints

- `1 ≤ number of nodes ≤ 10^5`
- `1 ≤ node->data ≤ 10^5`