class Solution {
    public long getDescentPeriods(int[] prices) {
        long count=1;
        int cur=1;
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]==prices[i-1]-1){
                cur++;
            }else{
                cur=1;
            }
            count+=cur;
        }
        return count;
    }
}