class Solution {
    public String reverseStr(String s, int k) {
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            s=reverse(s,i,Math.min(i+k-1,n-1));
        }
        return s;
    }
    private static String reverse(String s,int l,int r){
        char c[]=s.toCharArray();
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
        return new String(c);
    }
}