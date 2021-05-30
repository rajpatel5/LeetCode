import java.util.*;

class Solution {
    public int minPartitions(String n) {
        /* 
            Time: O(n), n = n.length()
            Space: O(1)
        */
        
        int zeroCount = 0;
        int max = 0;
        
        for (int i = 0; i < n.length(); i++) {
            int num = ((int) n.charAt(i)) - 48;
            
            if (num == 0) {
                zeroCount++;
            } else if (num > max) {
                max = num;
            }
        }
        
        if (max > 0) {
            return max;
        }
        
        return zeroCount;
    }
}