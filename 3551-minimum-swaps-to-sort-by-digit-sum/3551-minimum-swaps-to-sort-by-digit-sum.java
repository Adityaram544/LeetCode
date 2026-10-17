class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            int x=nums[i],sum=0;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            arr[i][0]=nums[i];
            arr[i][1]=sum;
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)-> a[1]!=b[1] ? a[1]-b[1] : a[0]-b[0]);
        boolean vis[]=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++){
            if(vis[i] || arr[i][2]==i){
                vis[i]=true;
                continue;
            }
            int j=i,cnt=0;
            while(!vis[j]){
                vis[j]=true;
                j=arr[j][2];
                cnt++;
            }
            res+=cnt-1;
        }
        return res;
    }
}