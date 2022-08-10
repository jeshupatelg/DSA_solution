class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        find(res,0,target,new ArrayList<Integer>(),candidates);
        return res;
    }
    public void find(List<List<Integer>> res,int ind,int need,ArrayList<Integer> list,int[] arr){
        if(ind>=arr.length){return;}
        if(need == 0){res.add(new ArrayList<Integer>(list)); return;}
        if(need>=arr[ind]){
            list.add(arr[ind]);
            find(res,ind,need-arr[ind],list,arr);
            if(list.size()>0) list.remove(list.size()-1);
        }
        find(res,ind+1,need,list,arr);
    }
}