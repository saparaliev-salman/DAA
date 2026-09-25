class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // target is biger, so ignore left part
                left = mid + 1;
            } else {
                // target is smaller, ignore right part
                right = mid - 1;
            }
        }
        
        return -1;
    }
}