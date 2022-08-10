class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        per(nums,new boolean[nums.length],0,new ArrayList<>(),res);
        return res;
    }
    public static void per(int[] arr,boolean[] vis,int ind,ArrayList<Integer> list,List<List<Integer>> res){
        if(ind == arr.length){res.add(new ArrayList<>(list)); return;}
        for(int i=0;i<arr.length;i++){
            if(vis[i]){continue;}
            vis[i]=true;
            list.add(arr[i]);
            per(arr,vis,ind+1,list,res);
            list.remove(list.size()-1);
            vis[i] = false;
        }
    }
}