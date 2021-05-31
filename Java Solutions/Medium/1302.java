import java.util.*;

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
 
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        /*
            Time: O(n), n = number of nodes
            Space: O(n), n = number of nodes
        */
        
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> depths = new ArrayList<Integer>();
        ArrayList<Integer> values = new ArrayList<Integer>();
        
        queue.add(root);
        values.add(root.val);
        depths.add(1);
        
        int i = 0;
        while (queue.size() > 0) {
            TreeNode current = queue.poll();
            
            if (current.left != null) {
                queue.add(current.left);
                values.add(current.left.val);
                depths.add(depths.get(i) + 1);
            }
            
            if (current.right != null) {
                queue.add(current.right);
                values.add(current.right.val);
                depths.add(depths.get(i) + 1);
            }
            
            i++;
        }
    
        // Find sum
        int sum = 0;
        int n = depths.size();
        for (int j = (n >> 1); j < n; j++) {
            if (depths.get(j) == depths.get(i-1)) {
                sum += values.get(j);
            }
        }
        
        return sum;
    }
}