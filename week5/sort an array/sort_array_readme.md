# 912. Sort an Array

## 1. Problem

We are given an array of numbers. We need to sort it from smallest to largest without using any built-in sorting tools. It must be fast, specifically running in `$O(n \log n)$` time.

## 2. Approach

We use the Merge Sort algorithm. It works by breaking the array down into smaller and smaller pieces until each piece has only one number. Then, it merges those pieces back together in the correct order.

1. Find the middle of the array and split it into a left half and a right half.
2. Keep splitting until you just have single numbers.
3. Merge the halves back together. Compare the numbers from the left and right halves and put the smaller one first.

**Tracing example: Input `[5, 2, 3, 1]`**

* Split into `[5, 2]` and `[3, 1]`.

* Split again into `[5]`, `[2]`, `[3]`, `[1]`.

* Merge `[5]` and `[2]`. `2` is smaller, so it becomes `[2, 5]`.

* Merge `[3]` and `[1]`. `1` is smaller, so it becomes `[1, 3]`.

* Merge `[2, 5]` and `[1, 3]`. Compare `2` and `1` (pick `1`), then `2` and `3` (pick `2`), then `5` and `3` (pick `3`), then add the leftover `5`.

* Output: `[1, 2, 3, 5]`.

**Challenges:**
Using Quick Sort sometimes runs in `$O(n^2)$` time if the array is already sorted or has many duplicates, which would fail the test. Choosing Merge Sort guarantees it always runs fast enough, even though creating the temporary left and right arrays takes a little extra memory.

## 3. Time Complexity

**Time Complexity:** `$O(n \log n)$`
We cut the array in half repeatedly (`$\log n$` steps), and each time we merge, we look at all `n` items. 

## 4. Reflection / Improvement

* **Is there a more efficient approach?** For time, no. `$O(n \log n)$` is the best possible time for comparison sorting.

* **What would you need to change?** If we wanted to use completely `$O(1)$` extra space, we could use Heap Sort instead of Merge Sort, because Merge Sort creates small temporary arrays.

* **What complexity could the improved solution achieve?** Heap Sort would achieve `$O(n \log n)$` time and exactly `$O(1)$` space. 