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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if(head == null){return head}
        var res: Int
        res = helper(head,n)
        if(res == 0){
            if(head!!.next == null){return null}
            else {return head.next}
        }
        return head
    }
    fun helper(node: ListNode?,n: Int): Int{
        //var header: ListNode?
        var ind:Int = 0
        if(node!!.next!=null){ind = helper(node.next!!,n)}
        else{ind = n}
        if(ind==0){
            node!!.next = node!!.next.next
        }
        return ind-1
    }
}