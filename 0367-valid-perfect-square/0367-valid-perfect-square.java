class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1,h=num;
        while(l<=h){
            long m=l+(h-l)/2;
            long s=m*m;
            if(m*m>num){
                h=m-1;
            }else if(m*m<num){
                l=m+1;
            }else{
                return true;
            }
        }
        return false;
    }
}