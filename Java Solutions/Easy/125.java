import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        /* 
            Time: O(n), n = len(s)
            Space: O(n), n = len(s)
        */
        
        int n = s.length();
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int unicode = (int) ch;
            
            if ((unicode >= 65 && unicode <= 90) || 
                (unicode >= 97 && unicode <= 122) || 
                (unicode >= 48 && unicode <= 57)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
                
            start += 1;
            end -= 1;
        }
        
        return true;
    }
}