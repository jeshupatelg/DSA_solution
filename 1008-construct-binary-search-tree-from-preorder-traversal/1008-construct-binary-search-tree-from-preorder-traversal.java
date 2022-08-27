/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] pre) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(pre[0]),cur;
        cur=root;
        stack.push(root);
        for(int i=1;i<pre.length;i++){
            if(pre[i]<cur.val){cur.left=new TreeNode(pre[i]); cur=cur.left;}
            else{
                while(pre[i]>stack.peek().val){
                    cur=stack.pop();
                    if(stack.isEmpty()){break;}
                }
                    cur.right=new TreeNode(pre[i]);
                    cur=cur.right;
                }
                stack.push(cur);
        }
        return root;
    }
}