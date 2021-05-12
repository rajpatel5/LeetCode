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


# Change arguments to test various cases
arg1 = [[1,2,3],[3,2,1]]

print(Solution.runningSum(None, arg1))