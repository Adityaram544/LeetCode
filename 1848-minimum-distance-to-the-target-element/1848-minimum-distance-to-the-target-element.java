class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minD=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int x=Math.abs(start-i);
                minD=Math.min(minD,x);
            }
        }
        return minD;
    }
}