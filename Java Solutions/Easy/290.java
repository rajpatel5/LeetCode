import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        /* 
            Time: O(n), n = s.length()
            Space: O(n), n = s.length()
        */
        
        String[] splitS = s.split(" ", 0);
        HashMap<String, Character> mapping = new HashMap<String, Character>();
        
        int n = pattern.length();
        int m = splitS.length;
            
        if (n != m) {
            return false;
        }
        
        
        int i = 0;
        while (i < n) {
            char ch = pattern.charAt(i);
            
            if (!mapping.containsValue(ch)) {
                mapping.put(splitS[i], ch);
            }
            
            i++;
        }
        
        // Determine if mapping is correct
        i = 0;
        int j = 0;
        while (j < m) {
            String str = splitS[j];
            
            if (!mapping.containsKey(str) || mapping.get(str) != pattern.charAt(j)) {
                return false;
            }
            
            i++;
            j++;
            if (i == n) {
                i = 0;
            }
        }
        
        return true;
    }
}