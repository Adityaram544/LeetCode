class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        int f=firstOccurence(nums,n,target);
        int l=lastOccurence(nums,n,target);
        res[0]=f;res[1]=l;
        return res;
    }
    public static int firstOccurence(int nums[],int n,int x){
        int f=-1;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==x) f=m;h=m-1;
            else if(nums[m]<x) l=m+1;
            else h=m-1;
        }
        return f;
    }
    public static int lastOccurence(int nums[],int n,int x){
        int l=-1;
        int l=0,h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==x) l=m;l=m+1;
            else if(nums[m]<x) l=m+1;
            else h=m-1;
        }
        return l;
    }
}