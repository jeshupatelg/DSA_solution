class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1){return nums[0];}
        int st=0,en=n-1;
        while(st<=en){
            int mid = st+(en-st)/2;
            if(mid%2==0){
                if(mid!=n-1 && nums[mid] == nums[mid+1]){st=mid+1;}
                else if(mid!=0 && nums[mid] == nums[mid-1]){en=mid-1;}
                else{return nums[mid];}
            }else{
                if(mid!=0 && nums[mid] == nums[mid-1]){st=mid+1;}
                else if(mid!=n-1 && nums[mid] == nums[mid+1]){en=mid-1;}
                else{return nums[mid];}
            }
        }
        return 0;
    }
}