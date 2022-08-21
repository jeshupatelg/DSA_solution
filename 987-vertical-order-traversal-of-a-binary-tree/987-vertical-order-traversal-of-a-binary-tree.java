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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){return res;}
        class tuple{
            TreeNode node;
            int depth;
            int x;
            tuple(TreeNode node,int depth,int x){
                this.node=node;
                this.depth=depth;
                this.x=x;
            }
        }
            Queue<tuple> q = new LinkedList<>();
            TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
            q.add(new tuple(root,0,0));
            while(!q.isEmpty()){
                tuple t=q.remove();
                if(!map.containsKey(t.x)){map.put(t.x,new TreeMap<>());}
                if(!map.get(t.x).containsKey(t.depth)){map.get(t.x).put(t.depth,new PriorityQueue<>());}
                map.get(t.x).get(t.depth).add(t.node.val);
                if(t.node.left!=null){q.add(new tuple(t.node.left,t.depth+1,t.x-1));}
                if(t.node.right!=null){q.add(new tuple(t.node.right,t.depth+1,t.x+1));}
            }
            for(TreeMap<Integer,PriorityQueue<Integer>> mapx : map.values()){
                res.add(new ArrayList<>());
                for(PriorityQueue<Integer> qd : mapx.values()){
                    while(!qd.isEmpty()){res.get(res.size()-1).add(qd.poll());}
                }
            }
        return res;
    }
}