class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int n=workerTimes.length;
        long l=1,h=(long)1e16;
        while(l<h){
            long m=(l+h)>>1;
            long total=0;
            for(int i=0;i<n && total<mountainHeight;i++){
                total+=(long) (Math.sqrt((double)m/workerTimes[i] * 2 + 0.25)-0.5);
            }
            if(total>=mountainHeight){
                h=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}