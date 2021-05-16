from typing import *

class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        """
            Time: O(n), where n = len(nums)
            Space: O(1)
        """
        
        bits = 0
        
        for num in nums:
            bits |= num
            
        return pow(2, len(nums) - 1) * bits
                