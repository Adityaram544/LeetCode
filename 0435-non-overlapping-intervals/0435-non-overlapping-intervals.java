class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int cnt=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int x=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=x){
                x=intervals[i][1];
            }else{
                cnt++;
            }
        }
        return cnt;
    }
}