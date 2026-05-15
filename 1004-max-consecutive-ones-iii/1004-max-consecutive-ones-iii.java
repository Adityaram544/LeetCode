class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen=0,l=0,z=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}