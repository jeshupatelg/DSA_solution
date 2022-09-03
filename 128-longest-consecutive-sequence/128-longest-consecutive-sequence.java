class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int len=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(Integer e : set){
            //System.out.println(" "+e+" ";)
            if(!set.contains(e-1)){
                int k=e;
                while(set.contains(k)){len++; k++;}
                if(len>max){max=len;}
                len=0;
            }
        }
        return max;
    }
}