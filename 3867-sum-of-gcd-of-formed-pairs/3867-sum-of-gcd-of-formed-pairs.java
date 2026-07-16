class Solution {
    public long gcdSum(int[] nums) {
        long gcdSum=0;
        int n=nums.length;
        int prefixGcd[]=new int[n];
        int mx=nums[0];
        prefixGcd[0]=nums[0];
        for(int i=1;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prefixGcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        int i=0,j=n-1;
        while(i<j){
            int x=prefixGcd[i];
            int y=prefixGcd[j];
            gcdSum+=gcd(x,y);
            i++;
            j--;
        }
        return gcdSum;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}