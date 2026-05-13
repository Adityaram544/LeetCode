class Solution {
    public int minMoves(int[] nums, int limit) {
        int n=nums.length;
        int d[]=new int[2*limit+2];
        for(int i=0;i<n/2;i++){
            int min=Math.min(nums[i],nums[n-1-i]);
            int max=Math.max(nums[i],nums[n-1-i]);
            d[2]+=2;
            d[min+1]--;
            d[min+max]--;
            d[min+max+1]++;
            d[max+limit+1]++;
        }
        int res=n,m=0;
        for(int c=2;c<=limit*2;c++){
            m+=d[c];
            res=Math.min(res,m);
        }
        return res;
    }
}