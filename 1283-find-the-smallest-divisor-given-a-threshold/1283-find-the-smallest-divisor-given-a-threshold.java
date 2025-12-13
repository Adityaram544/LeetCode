class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int x:nums){
            high=Math.max(high,x);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(can(nums,mid) <=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int can(int nums[],int div){
        int total=0;
        for(int x:nums){
            total+=Math.ceil((double)x/div);
        }
        return total;
    }
}