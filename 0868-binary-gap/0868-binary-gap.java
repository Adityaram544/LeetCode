class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int cnt=0,maxCnt=0;
        boolean st=false;
        for(char c:s.toCharArray()){
            if(c=='1'){
                if(st){
                    maxCnt=Math.max(maxCnt,cnt);
                }
                cnt=1;
                st=true;
            }else if(st){
                cnt++;
            }
        }
        return maxCnt;
    }
}