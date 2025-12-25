class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length-1;
        Arrays.sort(happiness);
        long maxSum=0;
        for(int i=0;i<k;i++){
            int val=happiness[n-i]-i;
            if(val>0) maxSum+=val;
            else break;
        }
        return maxSum;
    }
}