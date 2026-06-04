class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxS=0;
        int lSum=0,rSum=0,rIdx=n-1;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
            maxS=lSum;
        }
        for(int i=k-1;i>=0;i--){
            lSum-=cardPoints[i];
            rSum+=cardPoints[rIdx--];
            maxS=Math.max(maxS,lSum+rSum);
        }
        return maxS;
    }
}