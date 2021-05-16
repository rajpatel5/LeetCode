from typing import *

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        """
            Time: O(n^2), where n = len(nums)
            Space: O(1)
        """
        
        n = len(nums)
        pairCount = 0
        
        for i in range(n):
            for j in range(i + 1, n):
                if nums[i] == nums[j]:
                    pairCount += 1
                    
        return pairCount