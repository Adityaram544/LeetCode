class Solution {
    public int maxProfit(int[] prices) {
        int totalP=0;
        int x=prices[0];
        for(int i=1;i<prices.length;i++){
            if(x<prices[i]){
                totalP+=prices[i]-x;
            }
            x=prices[i];
        }
        return totalP;
    }
}