class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(nums,0,res,new ArrayList<>());
        return res;
    }
    public static void subset(int[] arr,int ind,List<List<Integer>> res,ArrayList<Integer> list){
        if(ind == arr.length){res.add(new ArrayList<>(list)); return;}
        
        list.add(arr[ind]);
        subset(arr,ind+1,res,list);
        list.remove(list.size()-1);
        subset(arr,ind+1,res,list);
    }
}