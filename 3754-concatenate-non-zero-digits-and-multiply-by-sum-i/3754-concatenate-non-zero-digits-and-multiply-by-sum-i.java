class Solution {
    public long sumAndMultiply(int n) {
        String s=Integer.toString(n);
        int sum=0;
        long x=0;
        for(char c:s.toCharArray()){
            int num=c-'0';
            if(num!=0){
                x=x*10+num;
                sum+=num;
            }
        }
        return x*sum;
    }
}