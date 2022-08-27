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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=insert(nums,0,nums.length-1);
        //insert(nums,root.right,mid+1,nums.length-1);
        return root;
    }
    public TreeNode insert(int[] nums,int st,int en){
        //System.out.println(st+" "+en);
        if(en<st){return null;}
        int mid=(en+st)/2;
        //root.val=nums[mid];
        TreeNode root = new TreeNode(nums[mid]);
        root.left=insert(nums,st,mid-1);
        root.right=insert(nums,mid+1,en);
        return root;
    }
}