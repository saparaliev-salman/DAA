# Linked List Cycle

## 1. Problem
We have a list of connected nodes. We need to check if it has a loop[cite: 3]. A loop means the list goes in a circle. Return true if there is a loop, and false if not[cite: 3].

## 2. Approach
I used a HashSet. It works like a bag to remember the nodes I already saw.
I start from the first node. I check if this node is already in my bag.
If it is in the bag, we found a loop! I return true.
If it is not in the bag, I put it in and move to the next node.
I keep doing this. If I reach the end of the list, there is no loop. I return false.

Tracing with example:
Let's use the list: 3, 2, 0, -4. The -4 connects back to 2[cite: 3].
Start: Bag is empty. Current node is 3.
Step 1: 3 is not in bag. Put 3 in. Move to 2. Bag is 3.
Step 2: 2 is not in bag. Put 2 in. Move to 0. Bag is 3, 2.
Step 3: 0 is not in bag. Put 0 in. Move to -4. Bag is 3, 2, 0.
Step 4: -4 is not in bag. Put -4 in. Move to next, which is 2 because of the loop[cite: 3]. Bag is 3, 2, 0, -4.
Step 5: 2 is already in the bag! We found a loop. Return true.

## 3. Time Complexity
Time Complexity: O(n)
I check every node one time. Putting nodes in the bag is very fast. So the time grows with the number of nodes.

## 4. Space Complexity
Space Complexity: O(n)
I save every node in the bag. If there are many nodes, the bag gets very big. So the memory grows with the number of nodes.

## 5. Reflection / Improvement
Is there a better way? Yes, to save memory.
Right now I use O(n) memory for the bag. I can use two pointers instead: a slow one and a fast one. If there is a loop, the fast pointer will catch the slow pointer. If there is no loop, the fast pointer will hit the end.
This trick does not need a bag. Time is still O(n), but space will be O(1) because I only use two small variables.