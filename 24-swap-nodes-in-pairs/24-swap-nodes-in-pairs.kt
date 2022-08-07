/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        var cur: ListNode?=head
        var header=head
        var prev: ListNode?=null
        var first=true
        while(cur!=null && cur!!.next!=null){
            var temp = cur!!.next
            cur!!.next = temp!!.next
            if(prev!=null){prev!!.next=temp}
            temp!!.next = cur
            cur = temp
            if(first){header=cur; first=false}
            prev=cur.next
            cur=cur.next.next
        }
        return header
    }
}