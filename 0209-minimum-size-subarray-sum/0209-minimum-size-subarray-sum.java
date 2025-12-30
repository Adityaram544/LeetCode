class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minLen=Integer.MAX_VALUE;
        int l=0,sum=0;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                minLen=Math.min(minLen,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? 0 : minLen;
    }
}