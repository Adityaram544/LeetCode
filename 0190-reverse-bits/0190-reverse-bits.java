class Solution {
    public int reverseBits(int n) {
        String x=Integer.toBinaryString(n);
        while(x.length()<32){
            x='0'+x;
        }
        int l=0,r=x.length()-1;
        char c[]=x.toCharArray();
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return Integer.parseInt(new String(c),2);
    }
}