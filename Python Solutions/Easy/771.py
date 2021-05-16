from typing import *

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        """
            Time: O(nm), where n = len(jewels) and m = len(stones)
            Space: O(1)
        """
        
        result = 0
        
        for jewel in jewels:
            for stone in stones:
                if jewel == stone:
                    result += 1
                    
        return result