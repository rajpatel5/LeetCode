import java.util.*;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /*
            Time: O(m), m = flowerbed.length
            Space: O(1)
        */
        
        int i = 0;
        int count = 0;
        
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            
            if (count >= n) {
                return true;
            }
            
            i++;
        }
        
        return false;
    }
}