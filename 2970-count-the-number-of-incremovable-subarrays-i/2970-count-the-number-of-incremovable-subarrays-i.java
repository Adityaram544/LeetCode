class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                res+=check(i,j,nums);
            }
        }
        return res;
    }
    private int check(int s,int e,int nums[]){
        int temp=-1;
        for(int i=0;i<nums.length;i++){
            if(i>=s && i<=e) continue;
            else{
                if(temp<nums[i]) temp=nums[i];
                else return 0;
            }
        }
        return 1;
    }
}