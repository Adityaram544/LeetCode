class Solution {
    public int concatenatedBinary(int n) {
        final long mod=(long)1e9+7;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
        long res=0;
        String str=sb.toString();
        for(int i=0;i<str.length();i++){
            res=(res*2 + (str.charAt(i)-'0'))%mod;
        }
        return (int)res;
    }
}