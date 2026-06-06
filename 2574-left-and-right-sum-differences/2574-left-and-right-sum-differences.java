class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int lSum=0,rSum=0;
        for(int i=0;i<n;i++){
            res[i]=lSum;
            lSum+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]=Math.abs(res[i]-rSum);
            rSum+=nums[i];
        }
        return res;
    }
}