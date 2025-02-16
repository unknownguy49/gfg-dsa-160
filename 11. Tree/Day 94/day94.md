# Serialize and Deserialize a Binary Tree

Serialization is to store a tree in an array so that it can be later restored and deserialization is reading the tree back from the array. Complete the functions:

- `serialize()`: Stores the tree into an array `a` and returns the array.
- `deSerialize()`: Deserializes the array to the tree and returns the root of the tree.

**Note:** Multiple nodes can have the same data and the node values are always positive integers. Your code will be correct if the tree returned by `deSerialize(serialize(input_tree))` is the same as the input tree. Driver code will print the in-order traversal of the tree returned by `deSerialize(serialize(input_tree))`.

## Examples

**Input:** 
```
root = [1, 2, 3]
```

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700281/Web/Other/blobid4_1739345069.png)

**Output:** 
```
[2, 1, 3]
```

**Input:** 
```
root = [10, 20, 30, 40, 60, N, N]
```

![](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700281/Web/Other/blobid5_1739345069.png)

**Output:** 
```
[40, 20, 60, 10, 30]
```

## Constraints

- 1 <= Number of nodes <= 10^4
- 1 <= Data of a node <= 10^9