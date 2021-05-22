import java.util.*;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        /* 
            Time: O(log n)
            Space: O(1)
        */
        
        if (n == 1 || isBadVersion(1)) {
            return 1;
        } else if (n == 2) { 
            return 2;
        }
        
        int low = 1;
        int high = n;
        int mid = (high - low) / 2;
        
        while (low + 1 < high) {
            mid = (high - low) / 2;
            
            if (isBadVersion(high - mid)) {
                high -= mid;
            } else {
                low = high - mid;
            }
        }
        
        return high - mid + 1;
    }
}