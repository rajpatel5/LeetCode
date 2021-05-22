import java.util.*;

class Solution {
    public int countSegments(String s) {
        /* 
            Time: O(n), n = s.length()
            Space: O(n), n = s.length()
        */
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                count++;   
            }
        }
        
        return count;
    }
}