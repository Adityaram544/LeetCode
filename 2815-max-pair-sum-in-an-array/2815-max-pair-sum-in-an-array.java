class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        List<int[]> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int x=nums[i];
            int maxD=0;
            int lst[]=new int[2];
            while(x>0){
                int temp=x%10;
                maxD=Math.max(maxD,temp);
                x=x/10;
            }
            lst[0]=i;
            lst[1]=maxD;
            res.add(lst);
        }
        int sum=-1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(res.get(i)[1]==res.get(j)[1]){
                    sum=Math.max(sum,(nums[i]+nums[j]));
                }
            }
        }
        return sum;
    }
}