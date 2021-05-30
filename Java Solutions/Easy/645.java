import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        /*
            Time: O(n), n = nums.length
            Space: O(n), n = nums.length
        */
        
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        
        // Initialize HashMap
        for (int i = 1; i <= nums.length; i++) {
            counts.put(i, 0);
        }
        
        // Find duplicate
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int countNum = counts.get(num);
            
            if (countNum < 1) {
                counts.put(num, countNum + 1);
            } else {
                duplicate = num;
            }
        }
        
        // Find missing value
        int missing = -1;
        for (int key : counts.keySet()) {
            if (counts.get(key) == 0) {
                missing = key;
            }
        }
        
        return new int[] {duplicate, missing};
    }
}