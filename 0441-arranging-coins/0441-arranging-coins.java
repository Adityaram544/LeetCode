class Solution {
    public int arrangeCoins(int n) {
        int l=1,h=n;
        while(l<=h){
            int m=l+(h-l)/2;
            long x=(long)m*(m+1)/2;
            if(x > n){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return h;
    }
}