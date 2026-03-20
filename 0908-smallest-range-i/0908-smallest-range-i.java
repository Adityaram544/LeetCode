class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int x:nums){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        return (max-k)<(min+k) ? 0 : (max-k)-(min+k);
    }
}