from typing import *

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        """
            Time: O(nm), where n = len(accounts) & m = len(accounts[i])
            Space: O(1)
        """
        
        richest = 0
        
        for i in range(len(accounts)):
            wealth = 0
            for j in range(len(accounts[i])):
                wealth += accounts[i][j]
                
            # Set the richest customer
            if wealth > richest:
                richest = wealth
                
        return richest