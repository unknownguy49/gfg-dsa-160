# LFU Cache

Design and implement an LFU (Least Frequently Used) cache. Here `cap` denotes the capacity of the cache and `Q` denotes the number of queries. Queries can be of two types: `GET(x)` and `PUT(x, y)`.

The LFU cache should support the following operations:

- `LFUCache(cap)`: Initializes the cache with a given capacity.
- `get(key)`: Returns the value associated with the key if it exists; otherwise, returns -1.
- `put(key, value)`: Inserts or updates the key with value. If the cache has reached its capacity, the least frequently used (LFU) key should be removed. If there is a tie between keys with the same frequency, the least recently used (LRU) key among them should be removed.

## Examples

### Example 1

**Input:** 
```
cap = 2, Q = 9, Queries = [["PUT", 1, 1], ["PUT", 2, 2], ["GET", 1], ["PUT", 3, 3], ["GET", 2], ["PUT", 4, 4], ["GET", 3], ["GET", 4], ["PUT", 5, 5]]
```

**Output:** 
```
[1, -1, -1, 4]
```

**Explanation:** 
```
Cache Size = 2
["PUT", 1, 1]: inserts the key-value pair (1, 1).
["PUT", 2, 2]: inserts the key-value pair (2, 2).
["GET", 1]: the cache retrieves the value for key 1, which is 1. After accessing key 1, its frequency increases to 2.
["PUT", 3, 3]: The cache is now full (capacity = 2). To insert the new key-value pair (3, 3), the least frequently used key must be removed. Key 2 has a frequency of 1. As a result, key 2 (the least recently accessed key) is removed and key-value pair (3, 3) is inserted with frequency 1.
["GET", 2]: cache returns -1 indicating that key 2 is not found.
["PUT", 4, 4]: key 3 is removed as it has a frequency of 1 and key-value pair (4, 4) is inserted with frequency 1.
["GET", 3]: returns -1 (key 3 not found)
["GET", 4]: the cache retrieves the value for key 4, which is 4. After accessing key 4, its frequency increases to 2.
["PUT", 5, 5]: key 1 and key 4 both have a frequency of 2. Now, key 1 will be removed as key 4 is most recently used and key-value pair (5, 5) is inserted with frequency 1.
```

### Example 2

**Input:** 
```
cap = 3, Q = 10, Queries = [["PUT", 5, 7], ["PUT", 4, 6], ["PUT", 3, 5], ["PUT", 2, 4], ["PUT", 1, 3], ["GET", 1], ["GET", 2], ["GET", 3], ["GET", 4], ["GET", 5]]
```

**Output:** 
```
[3, 4, 5, -1, -1]
```

**Explanation:** 
```
["PUT", 2, 4] evicts (5, 7) as it is the least frequently used.
["PUT", 1, 3] evicts (4, 6). After all operations, the cache contains keys 1, 2, and 3.
```

## Constraints

- `0 ≤ cap ≤ 10^4`
- `0 ≤ key ≤ 10^5`
- `0 ≤ value ≤ 10^6`
- Up to `2×10^5` calls will be made to `get` and `put`.
