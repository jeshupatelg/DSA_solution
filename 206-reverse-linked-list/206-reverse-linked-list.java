/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode prev=null;
        ListNode next=head.next;
        while(head!=null){
            head.next=prev;
            prev=head;
            head=next;
            if(next!=null){next=next.next;}
            //System.out.println(prev==null?"null":prev.val);
        }
        //head.next=prev;
        return prev;
    }
}