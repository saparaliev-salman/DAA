# 148. Sort List

## 1. Problem

We have a linked list of numbers. We need to sort it from smallest to largest and return the new sorted list.

## 2. Approach

We use the Merge Sort algorithm, just like with arrays, but adapted for linked lists. 

1. We find the middle of the list using a "slow" and "fast" pointer. The slow pointer moves one step, and the fast pointer moves two steps. When the fast one reaches the end, the slow one is in the middle.
2. We cut the list in half at the middle.
3. We keep cutting the halves until we only have single nodes left.
4. We merge the pieces back together, comparing nodes and linking the smaller one first.

**Tracing example: Input `[4, 2, 1, 3]`**

* Find middle and split: `[4, 2]` and `[1, 3]`.

* Split again: `[4]`, `[2]`, `[1]`, `[3]`.

* Merge `[4]` and `[2]`: Compare `4` and `2`, link `2` first. We get `[2, 4]`.

* Merge `[1]` and `[3]`: Compare `1` and `3`, link `1` first. We get `[1, 3]`.

* Merge `[2, 4]` and `[1, 3]`: Compare and link `1`, then `2`, then `3`, then `4`.

* Output: `[1, 2, 3, 4]`.

**Challenges:**
Finding the middle of a linked list is harder than an array because we can't just divide the length by two. Using the slow and fast pointer trick was the easiest way to solve this.

## 3. Time Complexity

**Time Complexity:** `$O(n \log n)$`
We cut the list in half repeatedly (`$\log n$` times) and we iterate through all `n` nodes during the merge process.

## 4. Reflection / Improvement

* **Is there a more efficient approach?** For time, no. `$O(n \log n)$` is the best time for sorting.

* **What would you need to change?** This solution uses recursion, which takes up `$O(\log n)$` memory in the call stack. To get perfect `$O(1)$` memory, we would need to write a "bottom-up" merge sort that uses loops instead of recursion.

* **What complexity could the improved solution achieve?** A bottom-up approach would achieve `$O(n \log n)$` time and strictly `$O(1)$` memory space.