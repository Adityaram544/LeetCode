class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int m=strs[0].length();
        boolean[] sorted=new boolean[n-1];
        int cnt=0;
        for(int j=0;j<m;j++) {
            boolean bad = false;
            for(int i=0;i<n-1;i++){
                if(!sorted[i] &&
                    strs[i].charAt(j) > strs[i+1].charAt(j)) {
                    bad = true;
                    break;
                }
            }
            if(bad) {
                cnt++;
                continue;
            }
            for(int i=0;i<n-1;i++) {
                if(strs[i].charAt(j) < strs[i+1].charAt(j)) {
                    sorted[i] = true;
                }
            }
        }
        return cnt;
    }
}
