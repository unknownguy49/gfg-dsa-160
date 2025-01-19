# Number of times graph cuts X-axis

Given an integer array `arr[]`, where each `arr[i]` denotes the trajectory of the graph over the plane; i.e. `arr[i] > 0` means graph going above its current position by `arr[i]` value and `arr[i] < 0` means graph going down by `arr[i]` value. If the initial position of the graph is at the origin, determine the number of times the graph crosses or touches the X-axis.

## Example:

**Input:** `arr[] = [2, 5, -9, 4]`  
**Output:** `2`  
**Explanation:** Graph touches the X-axis two times through index 1 to 2, and through index 2 to 3.

**Input:** `arr[] = [4, -6, 2, 8, -2, 3, -12]`  
**Output:** `3`  
**Explanation:** Graph touches the X-axis three times through index 0 to 1, through index 1 to 2, and through index 5 to 6.
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20200225131006/Untitled-Diagram412.jpg)

**Input:** `arr[] = [1, 3, 5]`  
**Output:** `0`  
**Explanation:** Graph has not touched the X-axis any time.

## Constraints:
- `1 <= arr.size() <= 10^5`
- `-10^4 <= arr[i] <= 10^4`
- `arr[i]` does not contain any zero.