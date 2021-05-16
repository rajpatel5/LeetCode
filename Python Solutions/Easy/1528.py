from typing import *

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        """
            Time: O(n log n), where n = len(s)
            Space: O(n), where n = len(s)
        """
        
        n = len(s)
        string = []
        result = ""
        
        for i in range(n):
            string.append((indices[i], s[i]))
            
        # Fastest Sort Algorithm, assume Mergesort here
        string.sort()
        
        for i in range(n):
            result += string[i][1]
        
        return result