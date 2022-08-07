class Solution {
    fun removeElement(nums: IntArray, k: Int): Int {
        var counter = 0
        for(i in nums.indices){
            if(nums[i] == k){counter++;}
            else {nums[i-counter] = nums[i]}
        }
        return nums.size-counter
    }
}