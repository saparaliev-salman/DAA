# Binary Search

1. Problem
We get an array of numbers that is sorted and a target number. We need to find the target and return the index. If we don't find it, return -1. 

2. Approach
This time I decided to make it smarter and use O(log n) way like the problem says.
I make two variables. lef is at the start (0) and righ is at the end (length - 1). Inside a while loop I find the middle number mid. 
If nums[mid] is exactly my target, I just return mid. 
If nums[mid] is smaller than target, it means target is in the right half because array is sorted. So I move left to mid + 1. 
If it is bigger, target is in the left half, so I move righ` to mid - 1.
I do this until left` is bigger than right. If loop ends, return -1.

3. Time Complexity
Time Complexity: O(log n)

Because every step I cut the array in half. I don't check all numbers. Like opening a book in the middle. So if I have many numbers, it still takes very few steps to find it or stop.

4. Space Complexity
Space Complexity: O(1)

I don't make any new arrays. I only make left, right and mid variables. So memory is always the same and very small.

5. Reflection / Improvement
Is there a more efficient approach? I don't think so.
Before I tried to write a simple for loop and it was O(n). It was checking every number and it was slow. Now I tried useing Binary Search and it is O(log n). Because array is already sorted, cutting it in half is the best and fastest way to find a number. So no need to improve time complexity.