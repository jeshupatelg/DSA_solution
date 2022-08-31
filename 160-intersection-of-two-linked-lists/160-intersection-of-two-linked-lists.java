/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ha=headA,hb=headB;
        while(ha.next!=null && hb.next!=null){
            if(ha==hb){return ha;}
            ha=ha.next;
            hb=hb.next;
            
        }
        if(ha.next==null && hb.next==null){
            if(ha==hb){return ha;}
            return null;
        }
        if(ha.next==null){ha=headB; hb=hb.next;}
        else {hb=headA; ha=ha.next;}
        while(ha.next!=null && hb.next!=null){
            ha=ha.next;
            hb=hb.next;
            //if(ha==hb){return ha;}
        }
        if(ha.next==null){ha=headB; hb=hb.next;}
        else {hb=headA; ha=ha.next;}
        while(ha.next!=null && hb.next!=null){
            if(ha==hb){return ha;}
            ha=ha.next;
            hb=hb.next;
            
        }
        if(ha==hb){return ha;}
        return null;
    }
}