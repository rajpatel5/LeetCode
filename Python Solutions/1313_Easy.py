from typing import *

class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        """
            Time: O(nk), n = len(nums) and k = max(nums[i])
            Space: O(nk), n = len(nums) and k = max(nums[i])
        """
        
        result = []
        
        # Skips by 2
        for i in range(0, len(nums), 2):
            for j in range(nums[i]):
                result.append(nums[i + 1])
                
        return result