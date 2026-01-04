class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt=0;
        int res=start^goal;
        while(res>0){
            res=res & (res-1);
            cnt++;
        }
        return cnt;
    }
}