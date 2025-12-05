class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int x:nums){
            total+=x;
        }
        int c=0;
        int lSum=0;
        for(int i=0;i<n-1;i++){
            lSum+=nums[i];
            int rSum=total-lSum;
            if(Math.abs(lSum-rSum)%2==0) c++;
        }
        return c;
    }
}