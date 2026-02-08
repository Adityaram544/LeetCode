class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;

        boolean sign=((dividend<0) == (divisor<0));

        long dvd=Math.abs((long)dividend);
        long dvs=Math.abs((long)divisor);
        int q=0;
        while(dvd>=dvs){
            int s=0;
            while((dvs<<(s+1))<=dvd){
                s++;
            }
            dvd-=(dvs<<s);
            q+= 1<<s;
        }
        return sign ? q : -q;
    }
}