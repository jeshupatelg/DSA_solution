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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){return res;}
        int depth=0;
        Queue<TreeNode> q = new LinkedList<>();
        List<TreeNode> rev = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            res.add(new ArrayList<>());
            int size=q.size();
            //System.out.println(q.size());
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                //System.out.println("  "+temp.val);
                res.get(depth).add(temp.val);
                if(depth%2==0){
                    if(temp.left!=null){rev.add(temp.left);}
                    if(temp.right!=null){rev.add(temp.right);}
                } else{
                    if(temp.right!=null){rev.add(temp.right);}
                    if(temp.left!=null){rev.add(temp.left);}
                }
            }
            for(int i=rev.size()-1;i>=0;i--){ q.add(rev.get(i));}
            rev.clear();
            depth++;
        }
        return res;
    }
}