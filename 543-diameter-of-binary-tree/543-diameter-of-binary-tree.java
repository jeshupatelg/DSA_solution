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
    public static int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){return 0;}
        int res = Math.max(dim(root)-1,max);
        max=0;
        return res;
    }
    public int dim(TreeNode root){
        if(root==null){return 0;}
        int lh=dim(root.left);
        int rh=dim(root.right);
        max = Math.max(max,lh+rh);
        return 1+Math.max(lh,rh);
    }
}