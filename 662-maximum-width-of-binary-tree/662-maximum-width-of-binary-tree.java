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
    public int widthOfBinaryTree(TreeNode root) {
        class Pair{
            TreeNode node;
            int x;
            Pair(TreeNode node,int x){
                this.node=node;
                this.x=x;
            }
        }
        Queue<Pair> q = new LinkedList<>();
        int min=0;
        int width=0,left=0,right=0;
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.peek();
            min=p.x;
            int size=q.size();
            for(int i=0;i<size;i++){
                p=q.poll();
                if(i==0){left=p.x;}
                if(i==size-1){right=p.x;}
                int cur=p.x-min;
                if(p.node.left!=null){q.add(new Pair(p.node.left,cur*2+1));}
                if(p.node.right!=null){q.add(new Pair(p.node.right,cur*2+2));}
            }
            width=Math.max(width,right-left+1);
        }
        return width;
    }
}