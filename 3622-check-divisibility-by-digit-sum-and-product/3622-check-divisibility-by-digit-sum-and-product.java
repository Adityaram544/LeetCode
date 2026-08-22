class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int org=n;
        while(n>0){
            int t=n%10;
            s+=t;
            p*=t;
            n/=10;
        }
        return (org%(s+p))==0;
    }
}