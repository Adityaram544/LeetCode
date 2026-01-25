class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i+k-1<n;i++){
            minDiff=Math.min(minDiff,nums[i+k-1]-nums[i]);
        }
        return minDiff;
    }
}