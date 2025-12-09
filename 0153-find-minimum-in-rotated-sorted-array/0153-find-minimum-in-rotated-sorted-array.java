class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[l]<=nums[m]){
                mini=Math.min(mini,nums[l]);
                l=m+1;
            }else{
                mini=Math.min(mini,nums[m]);
                h=m-1;
            }
        }
        return mini;
    }
}