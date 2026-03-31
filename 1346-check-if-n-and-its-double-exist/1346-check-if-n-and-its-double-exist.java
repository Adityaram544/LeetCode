class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l=0,h=n-1;
            int tar=2*arr[i];
            while(l<=h){
                int m=l+(h-l)/2;
                if(arr[m]==tar && m!=i){
                    return true;
                }else if(arr[m]>tar){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }
        }
        return false;
    }
}