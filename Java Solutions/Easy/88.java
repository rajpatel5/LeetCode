import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
            Time: O(n + m)
            Space: O(1)
        */
        
        if (n != 0 || m != 0) {
            int j = m - 1;
            int i = n - 1;
            
            while (j >= 0 || i >= 0) {
                int num1 = Integer.MIN_VALUE;
                int num2 = Integer.MIN_VALUE;
                
                if (j >= 0) {
                    num1 = nums1[j];
                }
                if (i >= 0) {
                    num2 = nums2[i];
                }

                if (num1 >= num2) {
                    nums1[j + i + 1] = num1;
                    j--;
                } else {
                    nums1[j + i + 1] = num2;
                    i--;
                }
            }
        }
    }
}