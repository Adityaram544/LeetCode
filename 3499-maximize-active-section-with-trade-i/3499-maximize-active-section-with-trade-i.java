class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n=s.length();
        int res=0;
        int pre=Integer.MIN_VALUE;
        int max=0;
        int i=0;
        while(i<n){
            int j=i;
            while(j<n && s.charAt(j)==s.charAt(i)){
                j++;
            }
            int len=j-i;
            if(s.charAt(i)=='1'){
                res+=len;
            }else{
                max=Math.max(max,pre+len);
                pre=len;
            }
            i=j;
        }
        return res+max;
    }
}