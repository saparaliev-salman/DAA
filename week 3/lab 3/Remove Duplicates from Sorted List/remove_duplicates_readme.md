# 83. Remove Duplicates from Sorted List

## 1. Problem
We have a sorted linked list. We need to remove all duplicate numbers so that each number appears only once. The list must stay sorted.

## 2. Approach
We check the list one node at a time. Because the list is sorted, duplicate numbers are always next to each other. 
If the current node's value is the same as the next node's value, we skip the next node. 
If the values are different, we simply move our pointer to the next node.

**Tracing example: Input [1, 1, 2]**
* `current` is at the first `1`. The next value is also `1`. 
* They match! We skip the second `1`. The list becomes `[1, 2]`. We keep `current` at the first `1`.
* Now, `current` is `1`, and the next is `2`. They are different. We move `current` to `2`.
* `current` is at `2`, there is no next node. Loop stops.
* Output: `[1, 2]`.

**Challenges:**
At first, I tried moving the pointer forward immediately after skipping a duplicate. This failed for lists like `[1, 1, 1]` because it skipped checking the third `1`. The fix was to keep the pointer in the same place after a deletion so it can check the *new* next node.

## 3. Time Complexity
**Time Complexity: O(n)**
We use one loop to check each node exactly one time. `n` is the number of nodes in the list.

## 4. Reflection / Improvement
* **Is there a more efficient approach?** No, O(n) time and O(1) space is the best possible approach.
* **What would you need to change?** Nothing. We have to check every single node at least once to find all duplicates, so we cannot make it faster than O(n). 
* **What complexity could the improved solution achieve?** The best complexity remains O(n) for time and O(1) for space.