class Solution {
    public int dominantIndex(int[] nums) {
        int maxIdx=0;
        int maxEl=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxEl){
                maxEl=nums[i];
                maxIdx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=maxIdx && nums[i]*2>maxEl){
                return -1;
            }
        }
        return maxIdx;
    }
}