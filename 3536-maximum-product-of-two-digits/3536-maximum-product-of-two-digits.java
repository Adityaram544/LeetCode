class Solution {
    public int maxProduct(int n) {
        int maxP=0,maxD=0;
        while(n!=0){
            int temp=n%10;
            maxP=Math.max(maxP,temp*maxD);
            maxD=Math.max(maxD,temp);
            n/=10;
        }
        return maxP;
    }
}