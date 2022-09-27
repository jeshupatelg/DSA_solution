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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){return head;}
        ListNode st=head,en=null,cur=head,prev,next=null;
        head=new ListNode(0,st);
        prev=head;
        int counter=0;
        while(cur!=null){
            //System.out.println(counter+" "+cur.val);
            counter++;
            if(counter!=k){
                //prev=cur;
                cur=cur.next;
            }
            else{
                en=cur;
                next=en.next;
                en.next=null;
                prev.next=rev(st);
                st.next=next;
                prev=st;
                st=next;
                counter=0;
                cur=next;
            }
        }
        return head.next;
    }
    public ListNode rev(ListNode head){
        ListNode cur=head.next;
        ListNode next=cur.next;
        head.next=null;
        while(next!=null){
            cur.next=head;
            head=cur;
            cur=next;
            next=next.next;
        }
        cur.next=head;
        return cur;
    }
}