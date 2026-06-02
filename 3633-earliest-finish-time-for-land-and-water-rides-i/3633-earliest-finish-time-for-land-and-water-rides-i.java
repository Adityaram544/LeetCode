class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
        int[] waterStartTime, int[] waterDuration) {

        int minL = Integer.MAX_VALUE;
        int minW = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;

        // Earliest completion time of any land ride
        for (int i = 0; i < n; i++) {
            minL = Math.min(minL, landStartTime[i] + landDuration[i]);
        }
        // Land first, then water
        for (int i = 0; i < m; i++) {
            minW = Math.min(minW,
            waterStartTime[i] + waterDuration[i]);
            res = Math.min(res,
                Math.max(minL, waterStartTime[i]) + waterDuration[i]
            );
        }
        // Water first, then land
        for (int i = 0; i < n; i++) {
            res = Math.min(res,
                Math.max(minW, landStartTime[i]) + landDuration[i]
            );
        }
        return res;
    }
}