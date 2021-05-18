import java.util.*;

class Solution {
    public int trailingZeroes(int n) {
        /* 
            Time: O(log n), note it's log_5 not log_2
            Space: O(1)
        */
        
        int zeros = 0;
        while (n > 0) {
            zeros += n / 5;
            n /= 5;
        }
        
        return zeros;
    }
}