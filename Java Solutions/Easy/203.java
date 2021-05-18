import java.util.*;

class Solution {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        /* 
            Time: O(n), n = number of nodes
            Space: O(1)
        */ 
        
        if (head == null) {
            return head;
        }
        
        ListNode newHead = new ListNode(0, head);
        ListNode prev = newHead;
        ListNode temp = head;
        
        while (temp != null) {
            if (temp.val == val) {
                prev.next = temp.next;
            } else {
                prev = prev.next;
            }
            
            temp = temp.next;
        }
        
        return newHead.next;
    }
}