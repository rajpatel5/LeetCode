from typing import *

class Solution:
    def balancedStringSplit(self, s: str) -> int:
        """
            Time: O(n), where n = len(s)
            Space: O(n), where n = len(s)
        """
        
        stack = []
        opposite = {"R": "L", "L": "R"}
        count = 0
        
        for char in s:        
            if len(stack) > 0 and char == opposite[stack[-1]]:
                stack.pop()
            else:
                stack.append(char)
                
            if len(stack) == 0:
                count += 1
                
        return count