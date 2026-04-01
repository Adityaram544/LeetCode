class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int l=0,r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPal(s,l+1,r) || isPal(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPal(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}