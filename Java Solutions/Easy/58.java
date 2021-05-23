import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        /* 
            Time: O(n), n = s.length()
            Space: O(1)
        */
        
        int end = s.length() - 1;
        while (end > 0 && s.charAt(end) == ' ') {
            end--;
        }
        
        int start = end;
        while (start > 0 && s.charAt(start) != ' ') {
            start--;
        }
        
        if (s.charAt(start) != ' ') {
            end++;
        }
        
        return end - start;
    }
}