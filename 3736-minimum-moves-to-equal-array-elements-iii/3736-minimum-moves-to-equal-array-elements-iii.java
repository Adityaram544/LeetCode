class Solution {
    public int minMoves(int[] nums) {
        int res=0,max=1;
        for(int x:nums){
            max=Math.max(max,x);
        }
        for(int x:nums){
            int c=max-x;
            res+=c;
        }
        return res;
    }
}