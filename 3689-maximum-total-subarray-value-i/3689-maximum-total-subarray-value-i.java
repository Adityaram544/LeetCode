class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long res=0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int x:nums){
            max=Math.max(x,max);
            min=Math.min(x,min);
        }
        return (long) k*(max-min);
    }
}