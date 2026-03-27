class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int minCom=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            int l=0,h=nums2.length-1;
            while(l<=h){
                int mid=l+(h-l)/2;
                if(nums2[mid]==nums1[i]){
                    minCom=Math.min(minCom,nums1[i]);
                    break;
                }else if(nums2[mid]<nums1[i]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return minCom==Integer.MAX_VALUE ? -1 : minCom;
    }
}