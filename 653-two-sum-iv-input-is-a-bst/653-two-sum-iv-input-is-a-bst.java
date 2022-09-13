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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        dfs(root,set);
        
        for(Integer e : set){
            if(k%2==0 && e==k/2){continue;}
            if(set.contains(k-e)){return true;}
        }
        return false;
    }
    public void dfs(TreeNode root,HashSet<Integer> set){
        if(root.left!=null){dfs(root.left,set);}
        set.add(root.val);
        if(root.right!=null){dfs(root.right,set);}
    }
}