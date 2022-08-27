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
    public void flatten(TreeNode root) {
        if(root == null){return ;}
        ArrayList<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        TreeNode cur = root;
        for(int i=1;i<list.size();i++){
            cur.left=null;
            cur.right=list.get(i);
            cur=cur.right;
        }
    }
    public void dfs(TreeNode root,ArrayList<TreeNode> list){
        list.add(root);
        if(root.left!=null){dfs(root.left,list);}
        if(root.right!=null){dfs(root.right,list);}
    }
}