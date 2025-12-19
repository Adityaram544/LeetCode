class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0,high=m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowIdx=maxColEle(mat,n,m,mid);
            int left=mid-1>=0 ? mat[rowIdx][mid-1] : -1;
            int right=mid+1<m ? mat[rowIdx][mid+1] : -1;
            if(mat[rowIdx][mid]>left && mat[rowIdx][mid]>right){
                return new int[]{rowIdx,mid};
            }else if(mat[rowIdx][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    private static int maxColEle(int[][] mat,int n,int m,int x){
        int maxEle=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            if(mat[i][x]>=maxEle){
                maxEle=mat[i][x];
                idx=i;
            }
        }
        return idx;
    }
}