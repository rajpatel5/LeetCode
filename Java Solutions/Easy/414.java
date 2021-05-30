import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        /*
            Time: O(n), n = nums.length
            Space: O(1)
        */
        
        // We can sort then return nums[nums.length - 3] if exists else nums[nums.length - 1] 
        // Time: O(n log n), Space: O(1)
        
        ArrayList<Long> maxes = new ArrayList<Long>(3);
        
        for (int i = 0; i < 3; i++) {
            maxes.add(Long.MIN_VALUE);  // smallest number possible
            
            for (int j = 0; j < nums.length; j++) {
                if ((long) nums[j] > maxes.get(i) && !maxes.contains((long) nums[j])) {
                    maxes.remove(i);
                    maxes.add((long) nums[j]);
                }
            }
        }
        
        for (int i = 2; i >= 0; i--) {
            if (maxes.get(i) == Long.MIN_VALUE) {
                return maxes.get(0).intValue();
            }
        }
        
        return maxes.get(2).intValue();
    }
}