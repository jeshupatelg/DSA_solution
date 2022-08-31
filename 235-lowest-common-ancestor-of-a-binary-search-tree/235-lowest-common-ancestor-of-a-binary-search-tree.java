/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pp=p.val,qq=q.val;
        while(true){
            if(pp<root.val && qq<root.val){root=root.left;}
            else if(pp>root.val && qq>root.val){root=root.right;}
            else {break;}
        }
        return root;
    }
}