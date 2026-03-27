class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int m=arr2.length;
        int cnt=0;
        Arrays.sort(arr2);
        for(int i=0;i<n;i++){
            int l=0,h=m-1;
            boolean b=true;
            while(l<=h){
                int md=l+(h-l)/2;
                if(Math.abs(arr1[i]-arr2[md])<=d){
                    b=false;
                    break;
                }else if(arr1[i]>arr2[md]){
                    l=md+1;
                }else{
                    h=md-1;
                }
            }
            if(b) cnt++;
        }
        return cnt;
    }
}