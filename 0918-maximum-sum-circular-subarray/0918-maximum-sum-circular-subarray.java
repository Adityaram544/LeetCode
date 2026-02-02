class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE,maxSum=0;
        int mini=Integer.MAX_VALUE,minSum=0;
        int total=0;
        for(int num:nums){
            maxSum+=num;
            maxi=Math.max(maxi,maxSum);
            if(maxSum<0){
                maxSum=0;
            }

            minSum+=num;
            mini=Math.min(mini,minSum);
            if(minSum>0){
                minSum=0;
            }
            total+=num;
        }
        return maxi<0 ? maxi : Math.max(maxi,total-mini);
    }
}