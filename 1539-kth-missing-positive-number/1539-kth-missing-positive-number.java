class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=1,high=n+k;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(count(arr,mid)>=k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static int count(int arr[],int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x) c++;
            else break;
        }
        return x-c;
    }
}