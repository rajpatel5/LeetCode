
import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        /*
            Time: O(n), n = number of nodes
            Space: O(n), n = number of nodes
        */
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(cloned);
        while (queue.size() > 0) {
            TreeNode curr = queue.poll();
            
            if (curr.val == target.val) {
                return curr;
            }
            
            if (curr.left != null) {
                queue.add(curr.left);
            }
            if (curr.right != null) {
                queue.add(curr.right);
            }
        }
        
        return null;
    }
}