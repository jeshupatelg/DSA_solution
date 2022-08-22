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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length==1){return root;}
        int rooti=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){rooti=i; break;}
        }
        int i=0,j=0;
        int[] preL;
        int[] inL;
        if(rooti>0){
            preL = new int[rooti];
            inL = new int[rooti];
            
            for(i=0,j=1;i<rooti;i++,j++){
                inL[i] = inorder[i];
                preL[i] = preorder[j];
            }
            root.left=buildTree(preL,inL);
        }
        int[] preR;
        int[] inR;
        if(preorder.length-rooti-1>0){
            preR = new int[preorder.length-rooti-1];
            inR = new int[preorder.length-rooti-1];
            i=rooti+1;
            for(i=rooti+1;i<preorder.length;i++){
                inR[i-rooti-1] = inorder[i];
                preR[i-rooti-1] = preorder[i];
            }
            root.right = buildTree(preR,inR);
        }
        return root;
    }
}