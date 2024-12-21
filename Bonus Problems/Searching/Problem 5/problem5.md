# Koko Eating Bananas

Given an array `arr[]` of integers where each element represents a pile of bananas, and Koko has `k` hours to finish all the piles, find the minimum number of bananas (`s`) Koko must eat per hour to finish all the bananas within `k` hours. Each hour, Koko chooses a pile and eats `s` bananas from it. If the pile has fewer than `s` bananas, she consumes the entire pile for that hour and won't eat any other banana during that hour.

## Examples

**Input:** `arr[] = [3, 6, 7, 11]`, `k = 8`  
**Output:** `4`  
**Explanation:** Koko eats at least 4 bananas per hour to finish all piles within 8 hours, as she can consume each pile in 1 + 2 + 2 + 3 = 8 hours.

**Input:** `arr[] = [30, 11, 23, 4, 20]`, `k = 5`  
**Output:** `30`  
**Explanation:** With 30 bananas per hour, Koko completes each pile in 1 hour, totaling 5 hours, which matches `k = 5`.

**Input:** `arr[] = [5, 10, 15, 20]`, `k = 7`  
**Output:** `10`  
**Explanation:** At 10 bananas per hour, Koko finishes in 7 hours, just within the `k = 7` limit.

## Constraints

- `1 <= arr.size() <= 10^5`
- `1 <= arr[i] <= 10^4`
- `arr.size() <= k <= 2*10^5`