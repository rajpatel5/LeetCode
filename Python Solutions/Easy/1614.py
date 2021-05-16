from typing import *

class Solution:
    def maxDepth(self, s: str) -> int:
        """
            Time: O(n), where n = len(s)
            Space: O(n), where n = len(s)
        """
        
        stack = []
        maxDepth = 0
        
        for char in s:
            if char == "(":
                stack.append(char)
            elif char == ")":
                stack.pop()
                
            size = len(stack)
            if size > maxDepth:
                maxDepth = size
                
        return maxDepth