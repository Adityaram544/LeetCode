class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int neg=Integer.MIN_VALUE;
        int dp[][][]=new int[m][n][k+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int c=0;c<=k;c++){
                    dp[i][j][c]=neg;
                }
            }
        }
        dp[0][0][0]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int c=0;c<=k;c++){
                    if(dp[i][j][c]==neg) continue;
                    if(i+1<m){
                        int val=grid[i+1][j];
                        int newc=c+ (val>0 ? 1 : 0);
                        if(newc<=k){
                            dp[i+1][j][newc]=Math.max(dp[i+1][j][newc], dp[i][j][c]+val);
                        }
                    }
                    if(j+1<n){
                        int val=grid[i][j+1];
                        int newc=c+ (val>0 ? 1 : 0);;
                        if(newc<=k){
                            dp[i][j+1][newc]=Math.max(dp[i][j+1][newc], dp[i][j][c]+val);
                        }
                    }
                }
            }
        }
        int res=-1;
        for(int c=0;c<=k;c++){
            res=Math.max(res,dp[m-1][n-1][c]);
        }
        return res<0 ? -1 : res;
    }
}