class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int minD=0;
        int bCnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                bCnt++;
            }else{
                minD=Math.min(minD+1,bCnt);
            }
        }
        return minD;
    }
}