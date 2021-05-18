import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        /* 
            Time: O(n^2), n = nums.length
            Space: O(1)
        */
        
        // Optimized for Space
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        
        return false;
    }
}