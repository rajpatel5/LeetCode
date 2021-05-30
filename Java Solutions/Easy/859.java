import java.util.*;

class Solution {
    public boolean buddyStrings(String a, String b) {
        /*
            Time: O(n), n = a.length()
            Space: O(1)
        */        
        
        int n = a.length();
        int m = b.length();
        
        if (n != m || n == 1) {
            return false;
        }
        
        // Initialize count
        Integer[] count = new Integer[26];
        Arrays.fill(count, 0);
        
        for (int i = 0; i < n; i++) {
            int unicode = ((int) a.charAt(i)) - 97;
            count[unicode] += 1;
        }
        
        int countIndex = 0;
        boolean isUnique = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 1) {
                isUnique = false;
                countIndex = i;
                break;
            }
        }
        
        if (a.equals(b)) { 
            return !isUnique;
        }
        
        // Find indcies of letters to swap
        int j = 0, k = 1, l = -1;
        boolean isJSet = false;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)){
                if (!isJSet) {
                    j = i;
                    isJSet = true;
                } else {
                    k = i;
                }
            } 
        }
        
        // Compare both strings
        for (int i = 0; i < n; i++) {
            if (i == j) {
                if (a.charAt(k) != b.charAt(i)) {
                    return false;
                }
            } else if (i == k) {
                if (a.charAt(j) != b.charAt(i)) {
                    return false;
                }
            } else if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}