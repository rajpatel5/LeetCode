import java.util.*;

class Solution {
    public boolean isValid(String s) {
        /* 
            Time: O(n), where n = s.length()
            Space: O(n), where n = s.length()
        */
        
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> mapping = new HashMap<Character, Character>();
        
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        
        for (int i = 0; i < s.length(); i++) {
            char type = s.charAt(i);
            
            if (!stack.empty()) {
                if (stack.peek() == mapping.get(type)) {
                    stack.pop();
                } else {
                    stack.push(type);
                }
            } else {
                stack.push(type);
            }
        }
        
        return stack.empty();
    }
}