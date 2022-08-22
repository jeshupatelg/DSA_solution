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
    static int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){return 0;}
        //int max=0;
        int res=sum(root);
        res = max;
        max=Integer.MIN_VALUE;
        return res;
    }
    public int sum(TreeNode root){
        if(root == null){return 0;}
        int left=0;
        left=Math.max(0,sum(root.left));
        int right=0;
        right=Math.max(0,sum(root.right));
        max=Math.max(max,left+right+root.val);
        return root.val+Math.max(left,right);
    }
}