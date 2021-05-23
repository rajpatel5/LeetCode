import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* 
            Time: O(nm), n = strs.length and m = min(strs[i].length())
            Space: O(m), m = min(strs[i].length())
        */
        
        StringBuilder res = new StringBuilder();
        int minLength = 201;
        int n = strs.length;
        
        if (n == 1) {
            return strs[0];
        }
        
        // Find string of min length
        for (int i = 0; i < n; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        
        // Find longest common prefix
        boolean isValid = true;
        char ch = ' ';
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < n - 1; j++) {
                ch = strs[j].charAt(i);
                isValid = (ch == strs[j + 1].charAt(i));
                
                if (!isValid) {
                    return res.toString();
                }
            }
            
            res.append(ch);
        }
        
        return res.toString();
    }
}