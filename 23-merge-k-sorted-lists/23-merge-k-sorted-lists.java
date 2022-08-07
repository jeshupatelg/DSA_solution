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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null){return new ListNode();}
        ListNode res=null,cur=res;
        boolean con = true;
        int min = Integer.MAX_VALUE,ind=0;
        while(con){
            min = Integer.MAX_VALUE;
            con = false;
            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null){
                    con = true;
                    if(lists[i].val<=min){min=lists[i].val; ind=i;}
                }
            }
            if(!con){break;}
            if(cur!=null){cur.next=new ListNode(min,null); cur=cur.next;}
            else {cur=new ListNode(min,null); res = cur;}
            if(lists[ind].next==null){lists[ind]=null;}
            else{ lists[ind] = lists[ind].next;}
        }
        return res;
    }
}