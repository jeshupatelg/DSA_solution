class Solution {
    List<List<Integer>> ans;
List<Integer> soFar;
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    ans = new ArrayList<>();
    soFar = new ArrayList<>();
    
    Arrays.sort(candidates);
    dfs(candidates , 0, candidates.length, target, 0);
    return ans;
}

//we need to go over all solutions -> bt, but we need to ignore duplicates in same level of tree
private void dfs(int[] nums, int idx, int n, int target, int sum) {
    if(sum==target) {
        ans.add(new ArrayList<>(soFar));
        return;
    }
    if(idx==n)
        return;   
    
    for(int i=idx; i<n; i++) {// all possible cases in level x of tree
        
        //here we check i>idx, since we let first item in the new level to be added to the list 
        // even if it is repatative
        if(i>idx && nums[i]==nums[i-1])
            continue;
        
        if(sum+nums[i]>target)
            continue;
        
        soFar.add(nums[i]);
        dfs(nums, i+1, n, target, sum+nums[i]);
        soFar.remove(soFar.size()-1);
    }
    

}
}