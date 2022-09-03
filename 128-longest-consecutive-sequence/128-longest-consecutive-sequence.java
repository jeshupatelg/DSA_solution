class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        int max=0;
       
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer e : set){
            //System.out.println(" "+e+" ";)
            if(!set.contains(e-1)){
                int len=0;
                int k=e;
                while(set.contains(k)){len++; k++;}
                max=Math.max(len,max);
                
            }
        }
        return max;
    }
}