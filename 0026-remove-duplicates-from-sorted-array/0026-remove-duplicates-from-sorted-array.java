class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]!=nums[l]){
                nums[l+1]=nums[r];
                l++;
            }
        }
        return l+1;
    }
}