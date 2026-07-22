class Solution {
    public int primePalindrome(int n) {
        if(n>=8 && n<=11) return 11;
        for(int i=1;i<100000;i++){
            int x=i;
            int num=i/10;
            while(num>0){
                int temp=num%10;
                x=x*10+temp;
                num/=10;
            }
            if(x>=n && isPrime(x)){
                return x;
            }
        }
        return -1;
    }
    private boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}