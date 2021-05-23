import java.util.*;

class Solution {
    public int countPrimes(int n) {
        /* 
            Time: O(n)
            Space: O(1)
        */
        
        // Sieve of Eratosthenes
        if (n <= 2) {
            return 0;
        }
        
        boolean[] numbers = new boolean[n];
        for (int p = 2; p <= (int)Math.sqrt(n); ++p) {
            if (numbers[p] == false) {
                for (int j = p*p; j < n; j += p) {
                    numbers[j] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                ++count;
            }
        }
        
        return count;
    }
}