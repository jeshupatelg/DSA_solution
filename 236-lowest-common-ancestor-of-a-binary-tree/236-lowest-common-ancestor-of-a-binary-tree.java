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
        TreeNode res = new TreeNode(-1);
        boolean[] temp = solve(root,p,q,res);
        return res;
    }
    public boolean[] solve(TreeNode root,TreeNode p,TreeNode q,TreeNode res){
        if(root == null){return new boolean[2];}
        boolean[] left=solve(root.left,p,q,res);
        if(left[0] && left[1]){return left;}
        boolean[] right=solve(root.right,p,q,res);
        if(right[0] && right[1]){return right;}
        boolean[] result = new boolean[2];
        result[0] = left[0] || right[0];
        result[1] = left[1] || right[1];
        if(root == p){result[0]=true;}
        if(root == q){result[1]=true;}
        if(result[0] && result[1]){res.val=root.val;}
        //System.out.println(root.val+" "+left[0]+""+left[1]+" "+right[0]+""+right[1]+" "+result[0]+""+result[1]+" "+res.val);
        return result;
    }
}