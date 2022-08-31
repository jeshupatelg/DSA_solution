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
    public int kthSmallest(TreeNode root, int k) {
        int[] res = new int[1];
        int[] counter = {0};
        inorder(root,k,res,counter);
        return res[0];
    }
    public void inorder(TreeNode root,int n,int[] res,int[] counter){
        //int left=0,right=0;
        if(root == null){return ;}
        inorder(root.left,n,res,counter);
        if(counter[0]+1==n){res[0]=root.val;}
         counter[0]++;
        inorder(root.right,n,res,counter);
        //return left+right+1;
    }
}