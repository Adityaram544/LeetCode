class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int minIdx=0,maxIdx=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if(nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
        }
        int l=Math.min(minIdx,maxIdx);
        int r=Math.max(minIdx,maxIdx);
        return Math.min(Math.min(r+1,n-l),l+1+n-r);
    }
}
// 5 1
// l=1 r=5
// 6,7=>6   1+1+8-5=>5
