class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int dp[]=new int[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int best=Integer.MIN_VALUE;
            int take=0;
            for(int j=i;j<Math.min(n,i+3);j++){
                take+=stoneValue[j];
                int dif=take-dp[j+1];
                best=Math.max(best,dif);
            }
            dp[i]=best;
        }
        if(dp[0]>0){
            return "Alice";
        }else if(dp[0]<0){
            return "Bob";
        }else{
            return "Tie";
        }
    }
}