class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);        
    }
    private int atMost(int nums[],int k){
        int n=nums.length;
        int l=0,res=0;
        for(int r=0;r<n;r++){
            if(nums[r]%2!=0){
                k--;
            }
            while(k<0){
                if(nums[l]%2!=0) k++;
                l++;
            }
            res+= r-l+1;
        }
        return res;
    }
}