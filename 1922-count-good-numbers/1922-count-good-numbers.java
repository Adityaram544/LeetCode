class Solution {
    static final long mod=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long res=(pow(5,even)*pow(4,odd))%mod;
        return (int)res;
    }
    private long pow(long base,long exp){
        if(exp==0) return 1;
        if(exp%2==0) return pow((base*base)%mod,exp/2)%mod;
        return base*pow(base,exp-1)%mod;
    }
}