class Solution {
    public int minimumCost(int[] cost) {
        int minCost=0,cnt=0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(cnt==2){
                cnt=0;
                continue;
            }
            cnt++;
            minCost+=cost[i];
        }
        return minCost;
    }
}