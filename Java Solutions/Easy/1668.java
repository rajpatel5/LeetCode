import java.util.*;

class Solution {
    public int maxRepeating(String sequence, String word) {
        /* 
            Time: O(n^2), n = sequence.length()
            Space: O(1)
        */
        
        // Sliding window O(n + m)
        
        int n = sequence.length();
        int m = word.length();
        
        if (n < m) {
            return 0;
        }
        
        int maxCount = 0;
        
        for (int k = 0; k < n; k++) {
            int repeatCount = 0;
            int i = k;
            
            // Count how many times word repeats
            while (i <= n - m) {
                boolean isSubstring = true;
                
                // Check if word is a substring of sequence
                for (int j = 0; j < m; j++) {
                    if (sequence.charAt(i + j) != word.charAt(j)) {
                        isSubstring = false;
                        repeatCount = 0;
                    }
                }

                if (isSubstring) {
                    repeatCount += 1;

                    if (repeatCount > maxCount) {
                        maxCount = repeatCount;
                    }
                    i += m - 1;
                }

                i += 1;
            }
        }
        
        return maxCount;
    }
}