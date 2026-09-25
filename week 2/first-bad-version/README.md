# First Bad Version

## 1. Problem
We have a product with versions from 1 to n. One version is bad, and because of that, all versions after it are also bad. We get an API function `isBadVersion(version)` that tells us if it is bad. We need to find the very first bad version and use the API as little as possible.

## 2. Approach
Because all bad versions are together at the end, it looks like a sorted array (Good, Good, Bad, Bad, Bad). So I decided to use Binary Search here too. 
I created `left` starting at 1 and `right` starting at n. Inside a `while` loop, I find the `mid` version. 
I call the API `isBadVersion(mid)`. If it returns true, it means `mid` is bad. But it can be the first bad one, or maybe the first one is before it. So I change `right = mid`. 
If it returns false, it means `mid` is good. So the first bad version must be after it. So I change `left = mid + 1`. 
The loop runs until `left` and `right` are the same number, and that is my answer.

## 3. Time Complexity
Time Complexity: O(log n)

Because every time I check the `mid` version, I cut the search space in half. I don't check every single version one by one. So the API is called much less times, growing logarithmically. 

## 4. Space Complexity
Space Complexity: O(1)

I only created three integer variables (`left`, `right`, `mid`) to keep track of the versions. I didn't make any arrays or big lists. So it takes very little memory and is constant.

## 5. Reflection / Improvement
Is there a more efficient approach? I don't think so.
If I used a normal `for` loop starting from 1 to n, the time complexity would be O(n). It would be very slow and call the `isBadVersion` API too many times if the first bad version is at the end (like n = 10000). My binary search solution is O(log n) which is much faster and minimizes the API calls like the problem asked. So I don't need to improve it anymore.