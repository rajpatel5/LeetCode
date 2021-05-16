from typing import *

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

        
class Solution:
    def rangeSumBST(self, root: TreeNode, low: int, high: int) -> int:
        """
            Time: O(n), where n = number of nodes
            Space: O(n), where n = number of nodes
        """
        
        stack = []
        current = root
        sumValues = 0
        
        # Inorder traversal (Iterative)
        while True:
            if current is not None:
                stack.append(current)
                current = current.left
            elif len(stack) > 0:
                current = stack.pop()
                if low <= current.val <= high:
                    sumValues += current.val
                    
                current = current.right
            else:
                break
                
        return sumValues
        