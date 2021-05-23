import java.util.*;

class Solution {
    public boolean validMountainArray(int[] arr) {
        /* 
            Time: O(n), n = arr.length
            Space: O(1)
        */
        
        int n = arr.length;
        
        if (n < 3) {
            return false;
        }
        
        // Find peak of mountain
        int i = 0;
        while (i < n - 1) {
            if (arr[i] > arr[i+1]) {
                break;
            }
            i++;
        }
        
        if (i == n - 1 || i == 0) {
            return false;
        }
        
        // Check strictly decreasing and increasing part of mountain
        for (int start = 0; start < n - 1; start++) {
            if ((start < i && arr[start] >= arr[start + 1]) || 
                (start > i && arr[start] <= arr[start + 1])) {
                return false;
            }
        }
        
        return true;
    }
}