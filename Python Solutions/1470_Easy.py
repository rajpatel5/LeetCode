from typing import *

class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        """
            Time: O(n)
            Space: O(n)
        """
        
        result = []
        
        for i in range(n):
            result.append(nums[i])
            result.append(nums[n + i])
            
        return result


# Change arguments to test various cases
arg1 = "255.255.255.0"
arg2 = 3

print(Solution.shuffle(None, arg1, arg2))