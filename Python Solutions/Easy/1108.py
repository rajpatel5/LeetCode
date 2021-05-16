from typing import *

class Solution:
    def defangIPaddr(self, address: str) -> str:
        """
            Time: O(n), where n = len(address)
            Space: O(1)
        """
        
        result = ""
            
        for i in range(len(address)):
            if address[i] != ".":
                result += address[i]
            else:
                result += "[.]"
            
        return result
