class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0,high=0;
        for(int x:weights){
            low=Math.max(low,x);
            high+=x;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(can(weights,mid)<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int can(int weights[],int x){
        int dayC=1,sum=0;
        for(int m:weights){
            sum+=m;
            if(sum>x){
                dayC++;
                sum=m;
            }
        }
        return dayC;
    }
}