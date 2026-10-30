# 203. Remove Linked List Elements

## 1. Problem

We need to go through a linked list and remove every node that matches a given number, `val`. After removing them, we return the new head of the list.

## 2. Approach

We create a "dummy" node and put it right before the head. We use a pointer to check the next node's value. 
If the next node matches `val`, we skip it by pointing to the node after it. 
If it doesn't match, we just move our pointer forward.

**Tracing example: Input `[7, 7, 7, 7]`, target `val` is 7.**

* The pointer starts at the dummy node.

* It sees the next node is `7`, so it skips it.

* It repeats this until all `7`s are skipped.

* Output is an empty list `[]`.

**Challenges:**
If the very first node (the head) needs to be deleted, it can cause errors. Adding a dummy node before the head makes sure we can safely delete the head just like any other node.

## 3. Time Complexity

**Time Complexity: O(n)**
We check each node exactly one time. The time it takes grows directly with the number of nodes in the list.

## 4. Reflection / Improvement

* **Is there a more efficient approach?** No, this is the best way.

* **What would you need to change?** Nothing, this works perfectly.

* **What complexity could the improved solution achieve?** It is already optimal at O(n) time and O(1) space.