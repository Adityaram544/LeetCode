class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        for(int x:piles){
            max=Math.max(max,x);
        }
        int low=0,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hrs=0;
            for(int x:piles){
                hrs+=Math.ceil((double)x/mid);
            }
            if(hrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}