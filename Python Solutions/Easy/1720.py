from typing import *

class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        """
            Time: O(n), n = len(encoded)
            Space: O(n), n = len(encoded)
        """
        
        result = [first]
        
        for i in range(len(encoded)):
            nand = ~(result[i] & encoded[i])
            A = ~(result[i] & nand)
            B = ~(nand & encoded[i])
            xor = ~(A & B)
            
            result.append(xor)
            
        return result