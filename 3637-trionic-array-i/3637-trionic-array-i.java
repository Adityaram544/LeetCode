class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(isInc(0,i,nums) && isDec(i,j,nums) && isInc(j,n-1,nums)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isInc(int l,int r,int nums[]){
        for(int i=l;i<r;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    private static boolean isDec(int l,int r,int nums[]){
        for(int i=l;i<r;i++){
            if(nums[i]<=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}