class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean hasNonZero=false;
        for(int x:nums){
            xor^=x;
            if(x!=0) hasNonZero=true;
        }
        if(!hasNonZero) return 0;
        if(xor!=0) return n;
        return n-1;
    }
}