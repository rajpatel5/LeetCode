from typing import *

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        """
            Time: O(m), where m = num of digits
            Space: O(m), where m = num of digits
        """
        
        sumDigits = 0
        productDigits = 1
        
        while n != 0:
            remainder = n % 10
            sumDigits += remainder
            productDigits *= remainder
            
            n = n // 10
            
        return productDigits - sumDigits