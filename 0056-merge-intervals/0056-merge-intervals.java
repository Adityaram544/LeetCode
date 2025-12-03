class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int cur[]=intervals[0];
        res.add(cur);
        for(int i=1;i<n;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=cur[1]){
                cur[1]=Math.max(cur[1],e);
            }else{
                cur=intervals[i];
                res.add(cur);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}