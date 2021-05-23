import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        /* 
            Time: O(n), n = arr.length
            Space: O(n), n = arr.length
        */
        
        Set<Integer> set = new HashSet<>();
        
        for(int n: arr) {
            if(set.contains(n)) {
                return true;
            }
            else {
                set.add(n * 2);
                if(n % 2 == 0) {
                    set.add(n / 2);
                }
            }
        }
        
        return false;
    }
}