import java.util.*;

class Solution {
    public int strStr(String haystack, String needle) {
        /* 
            Time: O(nm), n = haystack.length() and m = needle.length()
            Space: O(1)
        */
        
        int n = haystack.length();
        int m = needle.length();
        
        if (m == 0) {
            return 0;
        }
        
        boolean found = false;
        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                found = (haystack.charAt(i + j) == needle.charAt(j));
                
                if (!found) {
                    break;
                }
            }
            
            if (found) {
                return i;
            }
        }
        
        return -1;
    }
}