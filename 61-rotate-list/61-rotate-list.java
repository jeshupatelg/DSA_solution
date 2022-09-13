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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){return null;}
        int n=1;
        ListNode cur=head;
        while(cur.next!=null){
            n++;
            cur=cur.next;
        }
        k=k%n;
        cur.next=head;
        for(int i=0;i<n-k;i++){cur=cur.next; head=head.next;}
        cur.next=null;
        return head;
    }
}