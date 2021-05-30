import java.util.*;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        /* 
            Time: O(m), m = typed.length()
            Space: O(1)
        */
    
        int n = name.length();
        int m = typed.length();
        
        if(m < n || name.charAt(0) != typed.charAt(0)) {
            return false;
        }
        
        int i = 0, j = 0;
        while(j < m){
            if(i < n && (name.charAt(i) == typed.charAt(j))) {
                i++;
            } else if(typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            
            j++;
        }
        
        return i == n;
    }
}