class Solution {
    public int minMoves(int[] nums) {
        int cnt=0,min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(min,x);
        }
        for(int x:nums){
            cnt+=x-min;
        }
        return cnt;
    }
}