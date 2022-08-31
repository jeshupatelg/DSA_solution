/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        //if(fast.n==null){retur}
        while(slow!=null && fast!=null){
            
            slow=slow.next;
            if(fast.next==null){break;}
            fast=fast.next.next;
            if(fast == slow){return true;}
        }
        return false;
    }
}