class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        int ans=n;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>=target){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}