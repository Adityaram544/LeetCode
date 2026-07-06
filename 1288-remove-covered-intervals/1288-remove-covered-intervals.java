class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
            a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]
        );
        int res=0;
        int maxE=0;
        for(int cur[]:intervals){
            if(cur[1]>maxE){
                res++;
                maxE=cur[1];
            }
        }
        return res;
    }
}
// 14 28 36