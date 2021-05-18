from typing import *

class Solution:
    def replaceDigits(self, s: str) -> str:
        """
            Time: O(n), where n = len(s)
            Space: O(n), where n = len(s)
        """
        
        newS = ""
        
        for i in range(len(s)):
            if i % 2 == 0:
                newS += s[i]
            else:
                unicode = ord(s[i-1])
                newS += chr(unicode + int(s[i]))
            
        return newS