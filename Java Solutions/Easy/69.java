import java.util.*;

class Solution {
    public int mySqrt(int x) {
        /* 
            Time: O(log x)
            Space: O(1)
        */
        
        long low = 1;
        long high = x;
        
        while (true) {
            long mid = (low + high) / 2;
            
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return (int) mid;
            }
            
            if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}