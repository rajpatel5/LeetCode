import java.util.*;

class Solution {
    public String convertToTitle(int columnNumber) {
        /*
            Time: O(n)
            Space: O(m), m = res.length()
        */
        
        StringBuilder res = new StringBuilder();
        
        while(columnNumber > 0){
            res.append((char)((--columnNumber) % 26 + 65));
            columnNumber /= 26;
        }
        
        return res.reverse().toString();
    }
}