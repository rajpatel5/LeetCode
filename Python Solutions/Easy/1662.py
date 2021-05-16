from typing import *

class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        """
            Time: O(n), where n = sum(len(word1[i]))
            Space: O(n), where n = sum(len(word1[i]))
        """
        
        first = ""
        second = ""
        
        for subword in word1:
            first += subword
            
        for subword in word2:
            second += subword
            
        return first == second