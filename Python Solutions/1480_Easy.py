from typing import *

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        """
            Time: O(n), where n = len(nums)
            Space: O(n), where n = len(nums)
        """
        
        result = [nums[0]]
        
        for i in range(1, len(nums)):
            result.append(result[i-1] + nums[i])
        
        return result