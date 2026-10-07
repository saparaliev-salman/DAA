

## 1. Problem
We have two linked lists that are already sorted from small to big[cite: 1, 2]. We need to combine them into one big sorted list[cite: 1].

## 2. Approach
I imagine I have two lines of numbers. I just look at the first number of each line and pick the smaller one to put in my new list. 
To write the code, I made a "fake" starting node called dummy. This just makes it easier to start building my new list so my code doesn't crash on the first step. I use a current pointer (like an arrow) to add new numbers to the end of my list.

Inside a while loop, I check: is the number in list1 smaller than list2? 
If yes, I point my current arrow to list1 and move list1 to its next number. 
If no, I point to list2 and move list2 to its next number. 

When one list is finally empty, I just take all the leftover numbers from the other list and stick them at the very end. At the end, I return dummy.next because the dummy itself was just a fake start.

*Tracing with example:*
Let's use the first example: list1 = [1,2,4] and list2 = [1,3,4] [cite: 1].
Start: I have my fake node. 
Step 1: Compare 1 and 1. They are the same. I just take the 1 from list1.
  My list so far: [fake -> 1]
Step 2: Compare 2 (from list1) and 1 (from list2). 1 is smaller. I take it.
  My list so far: [fake -> 1 -> 1]
Step 3: Compare 2 and 3. 2 is smaller. Take it.
  My list so far: [fake -> 1 -> 1 -> 2]
Step 4: Compare 4 and 3. 3 is smaller. Take it.
  My list so far: [fake -> 1 -> 1 -> 2 -> 3]
Step 5: Compare 4 and 4. I take 4 from list1.
  My list so far: [fake -> 1 -> 1 -> 2 -> 3 -> 4]
End: list1 is empty now. But list2 still has a 4. I just stick it at the end.
  Final list without fake node: [1 -> 1 -> 2 -> 3 -> 4 -> 4][cite: 1].

## 3. Time Complexity
Time Complexity: O(n + m)
n is the size of the first list and m is the size of the second list. I literally just walk through every single node one time. I don't go back or do loops inside loops. So the time is just the total number of items in both lists.

## 4. Space Complexity
Space Complexity: O(1)
I didn't create a whole new list in the computer's memory. I just took the original nodes and changed where their "next" arrows point to link them together. The only new things I made were a couple of variables (dummy and current), so extra memory use is almost zero.

## 5. Reflection / Improvement
Is there a more efficient approach? 
Not really. To merge two lists, you HAVE to look at every single node at least once, so O(n + m) is the fastest time you can get. 
Some people use "recursion" (a function calling itself) to solve this with fewer lines of code. But recursion uses extra memory for the computer to remember the steps. My simple while loop way is actually better for memory (Space O(1)), so I don't need to change it.