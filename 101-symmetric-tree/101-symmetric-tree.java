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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){return true;}
        if(root.left==null && root.right==null){return true;}
        if(root.left==null || root.right==null){return false;}
        if(root.left.val!=root.right.val){return false;}
        Queue<TreeNode> left = new LinkedList<>();
        Queue<TreeNode> right = new LinkedList<>();
        left.add(root.left);
        right.add(root.right);
        while(!left.isEmpty() || !right.isEmpty()){
            if(left.size() != right.size()){return false;}
            int size=left.size();
            for(int i=0;i<size;i++){
                if(left.peek().val != right.peek().val){return false;}
                TreeNode temp1 = left.poll();
                TreeNode temp2 = right.poll();
                if(temp1.left == null ^ temp2.right == null){return false;}
                //if(temp1.left.val!=temp2.right.val){return false;}
                if(temp1.right == null ^ temp2.left == null){return false;}
                //if(temp1.right.val!=temp2.left.val){return false;}
                if(temp1.left!=null){left.add(temp1.left);}
                if(temp1.right!=null){left.add(temp1.right);}
                if(temp2.right!=null){right.add(temp2.right);}
                if(temp2.left!=null){right.add(temp2.left);}
            }
        }
        if(left.size()!=right.size()){return false;}
        return true;
    }
}