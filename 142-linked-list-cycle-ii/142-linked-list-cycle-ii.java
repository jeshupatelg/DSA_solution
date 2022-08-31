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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){return null;}
        if(head.next==head){return head;}
        ListNode fast=head.next.next,slow=head.next;
        while(fast!=slow){
            if(slow.next==null || fast.next==null || fast.next.next==null){return null;}
            fast=fast.next.next;
            slow=slow.next;
            //System.out.println(fast.val+" "+slow.val);
        }
        
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
            //System.out.println(fast.val+" "+slow.val);
        }
        return fast;
    }
}