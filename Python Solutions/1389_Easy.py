from typing import *

class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        """
            Time: O(n^2), where n = len(nums)
            Space: O(n), where n = len(nums)
        """
        
        target = []
        
        i = 0
        while i < len(nums):
            
            if index[i] == i:
                target.append(nums[i])
            else:
                self.insert(target, index[i], nums[i])
                
            i += 1
            
        return target
    
    
    def insert(self, target: List[int], index: int, num: int) -> None:
        """
            Time: O(n), where n = len(nums)
            Space: O(n), where n = len(nums)
        """
        
        i = 0
        numInsert = num
        
        while i < len(target) - index:
            temp = target[index + i]
            target[index + i] = numInsert
            numInsert = temp
            i += 1
            
        target.append(numInsert)