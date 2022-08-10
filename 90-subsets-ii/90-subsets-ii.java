class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subset(nums,0,res,new ArrayList<>());
        return res;
    }
    public static void subset(int[] arr,int ind,List<List<Integer>>res,ArrayList<Integer> list)
    {
        res.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1])continue;
            list.add(arr[i]);
            subset(arr,i+1,res,list);
            list.remove(list.size()-1);
        }
    }
}