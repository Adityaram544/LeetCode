class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int maxLen=0;
        for(int r=0;r<nums.length;r++){
            while(nums[r]-nums[l]>1){
                l++;
            }
            if(nums[r]-nums[l]==1){
                maxLen=Math.max(r-l+1,maxLen);
            }
        }
        return maxLen;
    }
}


// 1 2 2 2 3 3 5 7