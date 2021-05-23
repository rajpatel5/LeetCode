import java.util.*;

class Solution {
    public boolean checkPerfectNumber(int num) {
        /* 
            Time: O(sqrt(num))
            Space: O(1) 
        */
        
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        
        return sum - num == num;
    }
}