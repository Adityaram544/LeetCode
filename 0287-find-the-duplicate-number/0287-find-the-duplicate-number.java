class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            int cnt=0;
            for(int i=0;i<n;i++){
                if(nums[i]<=m) cnt++;
            }
            if(cnt<=m) l=m+1;
            else h=m-1;
        }
        return l;
    }
}