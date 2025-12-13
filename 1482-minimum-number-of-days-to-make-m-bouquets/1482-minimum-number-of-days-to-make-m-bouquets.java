class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k) return -1;
        int minD=Integer.MAX_VALUE;
        int maxD=Integer.MIN_VALUE;
        for(int x:bloomDay){
            minD=Math.min(minD,x);
            maxD=Math.max(maxD,x);
        }
        int low=minD,high=maxD;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static boolean canMake(int arr[],int days,int m,int k){
        int cnt=0;
        int noOfBouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                cnt++;
            }else{
                noOfBouquets+=(cnt/k);
                cnt=0;
            }
        }
        noOfBouquets+=(cnt/k);
        return noOfBouquets>=m;
    }
}