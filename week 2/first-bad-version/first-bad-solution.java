public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (isBadVersion(mid) == true) {
                // it is bad, so the first bad version is this one or before it
                right = mid; 
            } else {
                // it is good, so the bad version is definitely after mid
                left = mid + 1; 
            }
        }
        
        // when loop stops, left and right are the same, this is the answer
        return left;
    }
}