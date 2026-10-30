# 234. Palindrome Linked List

## 1. Problem

We need to check if a linked list is a palindrome. This means the list reads the exact same forwards and backwards. We must return `true` if it is, and `false` if it is not.

## 2. Approach

To solve this without using extra memory, we can reverse the second half of the list and compare it to the first half.
1. Use a "slow" and "fast" pointer to find the middle of the list.
2. Reverse the second half of the list starting from the middle node.
3. Compare the first half and the reversed second half node by node.

**Tracing example: Input `[1, 2, 2, 1]`**

* Find middle: Our pointer stops at the second `2`.
* Reverse second half: The second half `[2, 1]` is reversed to `[1, 2]`.
* Compare: Left pointer starts at head `1`. Right pointer starts at reversed head `1`.
* `1 == 1`, move both. `2 == 2`, move both.
* Right pointer hits the end. Everything matched. Output is `true`.

**Challenges:**
An easy way would be to copy all numbers into a regular array and check it backwards, but that takes too much memory. Figuring out how to reverse the second half of the list in place was tricky, but it saves memory.

## 3. Time Complexity

**Time Complexity:** `$O(n)$`
We walk through the list a few times to find the middle, reverse, and compare. This takes time proportional to the total number of nodes, `n`.

## 4. Reflection / Improvement

* **Is there a more efficient approach?** No, this is the most optimal approach.

* **What would you need to change?** Nothing.

* **What complexity could the improved solution achieve?** We achieved `$O(n)$` time and `$O(1)$` space, which is the best possible result for this problem.