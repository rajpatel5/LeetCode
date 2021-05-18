import java.util.*;

class Solution {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int minDepth(TreeNode root) {
        /* 
            Time: O(n), n = number of nodes
            Space: O(n), n = number of nodes
        */   
        
        /* Iterative BFS Algorithm */
        
        if (root == null) {
            return 0;
        }
        
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        ArrayList<Integer> depthQueue = new ArrayList<Integer>();
        queue.add(root);
        depthQueue.add(1);
        
        int i = 0;
        int depth = 1;
        while (queue.size() > 0) {
            TreeNode node = queue.get(i);
            depth = depthQueue.get(i);
            
            if (node.left == null && node.right == null) {
                break;
            } 
            
            if (node.left != null) {
                queue.add(node.left);
                depthQueue.add(depth + 1);
            }
            
            if (node.right != null) {
                queue.add(node.right);
                depthQueue.add(depth + 1);
            }
            
            i += 1;
        }
        
        return depth;
    }
}