class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long hSum[]=new long[m];
        long vSum[]=new long[n];
        long total=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hSum[i]+=grid[i][j];
                vSum[j]+=grid[i][j];
                total+=grid[i][j];
            }
        }
        if(total%2!=0) return false;
        if(can(hSum,total)) return true;
        if(can(vSum,total)) return true;
        return false;
    }
    private boolean can(long sum[],long total){
        long l=sum[0];
        long r=total-l;
        for(int i=1;i<sum.length;i++){
            if(l==r) return true;
            else if(l>r) return false;
            l+=sum[i];
            r-=sum[i];
        }
        return false;
    }
}