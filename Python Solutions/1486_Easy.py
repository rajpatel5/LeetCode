class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        """
            Time: O(n)
            Space: O(1)
        """
        
        result = start
        nums = [start]
        
        for i in range(1, n):
            nums.append(start + 2*i)
        
        for i in range(1, n):
            result ^= nums[i]
            
        return result