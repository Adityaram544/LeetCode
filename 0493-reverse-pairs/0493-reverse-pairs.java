class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    private static int countPairs(int nums[],int low,int mid,int high){
        int cnt=0,r=mid+1;
        for(int i=low;i<=mid;i++){
            while(r<=high && nums[i] > 2L *nums[r]){
                r++;
            }
            cnt+=(r-(mid+1));
        }
        return cnt;
    }
    private static int mergeSort(int nums[],int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(nums,low,mid);
        cnt+=mergeSort(nums,mid+1,high);
        cnt+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    private static void merge(int nums[],int low,int mid,int high){
        List<Integer> lst=new ArrayList<>();
        int l=low,r=mid+1;
        while(l<=mid && r<=high){
            if(nums[l]<=nums[r]){
                lst.add(nums[l++]);
            }else{
                lst.add(nums[r++]);
            }
        }
        while(l<=mid){
            lst.add(nums[l++]);
        }
        while(r<=high){
            lst.add(nums[r++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=lst.get(i-low);
        }
    }
}