class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1) return s;
        String maxStr=s.substring(0,1);
        for(int i=0;i<n;i++){
            String odd=expAc(s,i,i);
            String even=expAc(s,i,i+1);
            if(odd.length()>maxStr.length()){
                maxStr=odd;
            }
            if(even.length()>maxStr.length()){
                maxStr=even;
            }
        }
        return maxStr;
    }
    private String expAc(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}