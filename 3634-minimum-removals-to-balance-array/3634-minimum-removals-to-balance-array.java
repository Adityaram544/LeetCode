class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int r=0,res=n;
        for(int l=0;l<n;l++){
            while(r<n && nums[r]<=(long)nums[l]*k){
                r++;
            }
            res=Math.min(res,n-(r-l));
        }
        return res;
    }
}