class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        return helper(m-1,n-1,dp);
    }
    private int helper(int m,int n,int dp[][]){
        if(m<0 || n<0) return 0;
        if(m==0 || n==0) return 1;
        if(dp[m][n]>0) return dp[m][n];
        else{
            dp[m][n]=helper(m-1,n,dp)+helper(m,n-1,dp);
            return dp[m][n];
        }
    }
}