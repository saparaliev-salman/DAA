# 160. Intersection of Two Linked Lists

## 1. Problem

We have two linked lists. We need to find the exact node where they join together. If they never join, return `null`.

## 2. Approach

We use two pointers. One starts at list A, the other at list B. They move one step at a time.
Lists can be different sizes. So, if a pointer reaches the end of its list, it jumps to the start of the *other* list. This forces both pointers to walk the exact same total distance. They will meet at the join point.

**Tracing example: Intersect at node '8'**
List A: `[4, 1, 8, 4, 5]`
List B: `[5, 6, 1, 8, 4, 5]`

* Pointer A starts at `4`. Pointer B starts at `5`.
* Pointer A finishes list A first. It jumps to the start of list B (`5`).
* Pointer B finishes list B. It jumps to the start of list A (`4`).
* Now they are perfectly lined up. They walk together and hit `8` at the same time. Output: `8`.

**Challenges:**
I thought about saving the nodes of the first list to check later, but that takes too much memory. The trick of jumping to the other list solves it without needing extra memory.

## 3. Time Complexity

**Time Complexity:** `$O(m + n)$`
We just walk through both lists once. `m` and `n` are the sizes of the two lists.

## 4. Reflection / Improvement

* **Is there a more efficient approach?** No, this is the best way.
* **What would you need to change?** Nothing.
* **What complexity could the improved solution achieve?** `$O(m + n)$` time and `$O(1)$` space is the best possible result.