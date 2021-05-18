import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        /* 
            Time: O(n), n = s.length()
            Space: O(n), n = s.length()
        */
        
        // Optimized for Space Complexity
        HashMap<Character, Character> letterSeenS = new HashMap<Character, Character>();
        HashMap<Character, Character> letterSeenT = new HashMap<Character, Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            
            if (letterSeenS.get(chS) == null && letterSeenT.get(chT) == null){
                letterSeenS.put(chS, chT);
                letterSeenT.put(chT, chS);
            } else if (letterSeenS.get(chS) != null && letterSeenT.get(chT) != null &&
                      (letterSeenS.get(chS) != chT || letterSeenT.get(chT) != chS)){
                return false;   
            } else if (letterSeenS.get(chS) != null && letterSeenT.get(chT) == null || 
                      letterSeenS.get(chS) == null && letterSeenT.get(chT) != null){
                return false;
            }
        }
        
        return true;
    }
}