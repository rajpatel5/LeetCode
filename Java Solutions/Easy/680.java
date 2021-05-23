import java.util.*;

class Solution {
    public boolean validPalindrome(String s) {
        /*
            Time: O(n), n = s.length()
            Space: O(1)
        */
        
        int[] indices = isPalindrome(s, -1);
        if (indices[0] == -1 && indices[1] == -1) {
            return true;
        } 
        else {
            int[] indicesI = isPalindrome(s, indices[0]);
            int[] indicesJ = isPalindrome(s, indices[1]);
            
            if ((indicesI[0] == -1 && indicesI[1] == -1) || 
                (indicesJ[0] == -1 && indicesJ[1] == -1)) {
                return true;
            } 
        }
        
        return false;
    }
    
    private int[] isPalindrome(String s, int removedIndex) {
        int i = 0;
        int j = s.length() - 1;
        int[] indices = {-1, -1}; 
        
        while (i <= j) {
            if (i == removedIndex) {
                i++;
            } else if (j == removedIndex) {
                j--;
            } 
            
            if (s.charAt(i) != s.charAt(j)) {
                indices[0] = i;
                indices[1] = j;
                break;
            }
            
            i++;
            j--;
        }
        
        return indices;
    }
}