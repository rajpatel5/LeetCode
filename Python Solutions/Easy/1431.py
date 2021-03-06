from typing import *

class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        """
            Time: O(n), where n = len(candies)
            Space: O(n), where n = len(candies)
        """
        
        result = []
        greatest = self.findGreatestCandies(candies)
                
        for i in range(len(candies)):
            isGreatest = candies[i] + extraCandies >= greatest
            result.append(isGreatest)
        
        return result
    
    
    def findGreatestCandies(self, candies: List[int]) -> int:
        """
            Time: O(n), where n = len(candies)
            Space: O(1)
        """
        
        greatest = 0
        for i in range(len(candies)):
            if candies[i] > greatest:
                greatest = candies[i]
                
        return greatest