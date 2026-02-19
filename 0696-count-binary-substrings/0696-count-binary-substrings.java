class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        int res=0;
        int k=1,p=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                k++;
            }else{
                p=k;
                k=1;
            }
            if(k<=p) res++;
        }
        return res;
    }
}