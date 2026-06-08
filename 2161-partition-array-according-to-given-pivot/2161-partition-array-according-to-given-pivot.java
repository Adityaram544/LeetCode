class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int l=0,e=0;
        for(int x:nums){
            if(x<pivot) l++;
            if(x==pivot) e++;
        }
        int res[]=new int[n];
        int a=0,b=l,c=l+e;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                res[a++]=nums[i];
            }else if(nums[i]==pivot){
                res[b++]=nums[i];
            }else{
                res[c++]=nums[i];
            }
        }
        return res;
    }
}