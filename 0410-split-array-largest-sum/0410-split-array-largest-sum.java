class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return -1;
        int total=0,maxi=Integer.MIN_VALUE;
        for(int x:nums){
            maxi=Math.max(maxi,x);
            total+=x;
        }
        int low=maxi,high=total;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,mid)<=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int canSplit(int nums[],int x){
        int cnt=1,sum=0;
        for(int num:nums){
            if(sum+num<=x){
                sum+=num;
            }else{
                cnt++;
                sum=num;
            }
        }
        return cnt;
    }
}