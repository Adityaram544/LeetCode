class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int mod=1_000_000_007;
        for(int i=0;i<queries.length;i++){
            int li=queries[i][0];
            int ri=queries[i][1];
            int ki=queries[i][2];
            int vi=queries[i][3];
            int idx=li;
            while(idx<=ri){
                nums[idx]=(int)(((long)nums[idx]*vi) % mod);
                idx+=ki;
            }
        }
        int res=0;
        for(int x:nums){
            res^=x;
        }
        return res;
    }
}