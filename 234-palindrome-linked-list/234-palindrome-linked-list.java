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
    public boolean isPalindrome(ListNode head) {
        boolean[] res = new boolean[1];
        res[0] = true;
        check(head,head,res);
        return res[0];
    }
    public ListNode check(ListNode head,ListNode cur,boolean[] res){
        if(cur==null){return head;}
        ListNode nxt=check(head,cur.next,res);
        if(nxt.val != cur.val){res[0]=false;}
        return nxt.next;
    }
}