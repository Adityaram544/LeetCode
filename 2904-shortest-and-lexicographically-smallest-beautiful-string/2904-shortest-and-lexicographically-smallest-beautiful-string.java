class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String res="";
        int l=0,oCnt=0;
        for(int r=0;r<n;r++){
            if(s.charAt(r)=='1') oCnt++;
            while(oCnt>k){
                if(s.charAt(l)=='1') oCnt--;
                l++;
            }
            while(oCnt==k && s.charAt(l)=='0'){
                l++;
            }
            if(oCnt==k){
                String cur=s.substring(l,r+1);
                if(res.isEmpty() || cur.length()<res.length() ||
                    (cur.length()==res.length() && cur.compareTo(res)<0)){
                        res=cur;
                }
            }
        }
        return res;
    }
}